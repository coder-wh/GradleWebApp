package com.test;

import com.base.commons.constant.StatusCode;
import com.base.commons.util.HttpClientUtil;
import com.base.commons.util.JacksonUtil;
import com.base.vo.album.AlbumResult;

public class GetCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		long start = System.currentTimeMillis();
		for (int i = 0; i < 15000; i++) {
			String result = HttpClientUtil.doGet("http://192.168.2.161:8081/HUAWEI_MUSIC_CACHE_TEST/api/v1/getAlbumCache/"+i);
			AlbumResult b = JacksonUtil.toObject(result, AlbumResult.class);
			if (b != null && StatusCode.SUCCESS.equals(b.getStatusCode())) {
				System.out.println(b.getAlbum().getAlbumId()+"____"+b.getPlist().size());
				count++;
			} 
		}
		long end = System.currentTimeMillis();
		System.out.println("总数为"+count);
		long total = end - start;
		System.out.println("总耗时"+total);
		if (count != 0){
			System.out.println("平均耗时"+(total/count));
		}
	}

}
