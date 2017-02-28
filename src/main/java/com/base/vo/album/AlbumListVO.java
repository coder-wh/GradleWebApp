package com.base.vo.album;

import com.base.vo.common.AbstractModel;

/**
 * @author alex
 *
 */
public class AlbumListVO extends AbstractModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5252907429553742731L;

	// album唯一id
	private long albumId;

	// 类型 1为有声书 2为电台
	private int albumType;

	// album名称
	private String albumName;

	// 主播
	private String anchorName;

	// 封面图
	private String albumCover;
	
	private Long playNum;

	public long getAlbumId() {
		return albumId;
	}

	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}

	public int getAlbumType() {
		return albumType;
	}

	public void setAlbumType(int albumType) {
		this.albumType = albumType;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getAnchorName() {
		return anchorName;
	}

	public void setAnchorName(String anchorName) {
		this.anchorName = anchorName;
	}

	public String getAlbumCover() {
		return albumCover;
	}

	public void setAlbumCover(String albumCover) {
		this.albumCover = albumCover;
	}

	public Long getPlayNum() {
		return playNum;
	}

	public void setPlayNum(Long playNum) {
		this.playNum = playNum;
	}



}
