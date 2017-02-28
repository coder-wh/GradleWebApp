package com.base.vo.album;

import java.util.List;

import com.base.vo.common.BaseResult;
import com.base.vo.program.ProgramVO;

/**
 * album集合
 */
public class AlbumResult extends BaseResult {
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 402077255910957312L;
	private AlbumVO album;
    private List<ProgramVO> plist;
    private Integer total;
    private Long totalEntries;
    private Long albumCacheSize;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Long getTotalEntries() {
		return totalEntries;
	}
	public void setTotalEntries(Long totalEntries) {
		this.totalEntries = totalEntries;
	}
	public Long getAlbumCacheSize() {
		return albumCacheSize;
	}
	public void setAlbumCacheSize(Long albumCacheSize) {
		this.albumCacheSize = albumCacheSize;
	}
	public List<ProgramVO> getPlist() {
		return plist;
	}
	public void setPlist(List<ProgramVO> plist) {
		this.plist = plist;
	}
	private List<AlbumListVO> albumList;
	public AlbumVO getAlbum() {
		return album;
	}
	public void setAlbum(AlbumVO album) {
		this.album = album;
	}
	public List<AlbumListVO> getAlbumList() {
		return albumList;
	}
	public void setAlbumList(List<AlbumListVO> albumList) {
		this.albumList = albumList;
	}






}
