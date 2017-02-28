package com.api.album.service;

public interface IAlbumService {
	public void setAlbumCache(int albumNum);
	public void setAlbumCacheById(int albumId);
	public int getTotalEntries();
	public long getElementSize(int albumId);
}
