package com.base.vo.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseParam extends AbstractModel {

	private Integer pageNo;
	private Integer pageSize;

	// 用户唯一id
	@JsonProperty("c")
	private String cuid;
	// 用户唯一id
	@JsonProperty("h")
	private String huaweiId;

	@JsonProperty("i")
	private String ip;

	public String getCuid() {
		return cuid;
	}

	public void setCuid(String cuid) {
		this.cuid = cuid;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getHuaweiId() {
		return huaweiId;
	}

	public void setHuaweiId(String huaweiId) {
		this.huaweiId = huaweiId;
	}

}
