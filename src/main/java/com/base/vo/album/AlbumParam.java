package com.base.vo.album;

import com.base.vo.common.BaseParam;

public class AlbumParam extends BaseParam {

	private Long albumId;
	private Integer channelId;

    private String keyword;
	public Long getAlbumId() {
		return albumId;
	}
	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	
	
	
}
