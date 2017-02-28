package com.base.commons.util;

import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.MessageConstraints;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpClientUtil {
	private static final String encoding = "UTF-8";
	private final static int connectTimeout = 30000;

	private static PoolingHttpClientConnectionManager connManager = null;
	private static CloseableHttpClient httpclient = null;

	static {
		try {
			Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory> create().register("http",
					PlainConnectionSocketFactory.getSocketFactory()).register("https", SSLConnectionSocketFactory.getSocketFactory()).build();
			connManager = new PoolingHttpClientConnectionManager(registry);
			// Create socket configuration
			SocketConfig socketConfig = SocketConfig.custom().setTcpNoDelay(true).build();
			connManager.setDefaultSocketConfig(socketConfig);
			// Create message constraints
			MessageConstraints messageConstraints = MessageConstraints.custom().setMaxHeaderCount(200).setMaxLineLength(2000).build();

			// Create connection configuration
			ConnectionConfig connectionConfig = ConnectionConfig.custom().setMalformedInputAction(CodingErrorAction.IGNORE).setUnmappableInputAction(
					CodingErrorAction.IGNORE).setCharset(Consts.UTF_8).setMessageConstraints(messageConstraints).build();

			connManager.setDefaultConnectionConfig(connectionConfig);
			connManager.setMaxTotal(1000);
			connManager.setDefaultMaxPerRoute(500);
			httpclient = HttpClients.custom().setConnectionManager(connManager).build();
		} catch (Exception e) {

		}
	}

	public static String doPost(String url_str, String param) {
		HttpPost post = new HttpPost(url_str);
		CloseableHttpResponse response = null;
		HttpEntity entity = null;
		try {
			post.setHeader("User-Agent", "agx.api");
			post.setHeader("Content-type", "application/json");
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(connectTimeout).setConnectTimeout(connectTimeout)
					.setConnectionRequestTimeout(connectTimeout).setExpectContinueEnabled(false).build();
			post.setConfig(requestConfig);
			post.setEntity(new StringEntity(param, encoding));
			response = httpclient.execute(post);
			//System.out.println(response.getStatusLine().getStatusCode());
			if (HttpStatus.SC_OK == response.getStatusLine().getStatusCode()) {
				entity = response.getEntity();
				if (entity != null) {
					return EntityUtils.toString(entity, encoding);
				}
			}

		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("服务器连接错误");
		} finally {
			try {
				if (entity != null) {
					entity.getContent().close();
				}
				if (response != null) {
					response.close();
				}
				if (post != null) {
					post.releaseConnection();
				}
			} catch (Exception e) {
			}
		}
		return null;
	}

	public static String doGet(String url_str) {
		String responseString = null;
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(connectTimeout).setConnectTimeout(connectTimeout)
				.setConnectionRequestTimeout(connectTimeout).build();

		HttpGet get = new HttpGet(url_str);
		get.setHeader("Accept-Encoding", "gzip");
		get.setConfig(requestConfig);

		try {
			CloseableHttpResponse response = httpclient.execute(get);
			try {
				HttpEntity entity = response.getEntity();
				try {
					if (entity != null) {
						responseString = EntityUtils.toString(entity, encoding);
					}
				} finally {
					if (entity != null) {
						entity.getContent().close();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (response != null) {
					response.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			get.releaseConnection();
		}
		return responseString;
	}

	/**
	 * HTTPS请求，默认超时为5S
	 * 
	 * @param reqURL
	 * @param params
	 * @return
	 */
	public static String connectPostHttps(String reqURL, Map<String, String> params) {

		String responseContent = null;

		HttpPost httpPost = new HttpPost(reqURL);
		try {
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(connectTimeout).setConnectTimeout(connectTimeout)
					.setConnectionRequestTimeout(connectTimeout).build();

			List<NameValuePair> formParams = new ArrayList<NameValuePair>();
			httpPost.setEntity(new UrlEncodedFormEntity(formParams, Consts.UTF_8));
			httpPost.setConfig(requestConfig);
			// 绑定到请求 Entry
			for (Map.Entry<String, String> entry : params.entrySet()) {
				formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
			}
			CloseableHttpResponse response = httpclient.execute(httpPost);
			try {
				// 执行POST请求
				HttpEntity entity = response.getEntity(); // 获取响应实体
				try {
					if (null != entity) {
						responseContent = EntityUtils.toString(entity, Consts.UTF_8);
					}
				} finally {
					if (entity != null) {
						entity.getContent().close();
					}
				}
			} finally {
				if (response != null) {
					response.close();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpPost.releaseConnection();
		}
		return responseContent;

	}

}