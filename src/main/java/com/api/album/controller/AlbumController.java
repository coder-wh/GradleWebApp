package com.api.album.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.album.service.IAlbumService;
import com.base.cache.CacheManager;
import com.base.cache.CacheManagerTOT;
import com.base.cache.album.AlbumCache;
import com.base.commons.constant.KeyPrefix;
import com.base.commons.constant.StatusCode;
import com.base.vo.album.AlbumResult;
import com.base.vo.statistic.StatisticResult;

@Controller
@RequestMapping("/api/v1")
public class AlbumController {
	
	
//	@Resource(name="cManagerTOT")
//	private CacheManagerTOT cache;
	
	@Resource(name="cManager")
	private CacheManager cache;
	@Resource
	private IAlbumService albumService;
	
	@RequestMapping(value = "/getAlbumCache/{albumId}", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.GET)
	@ResponseBody
	public AlbumResult getAlbumCache(@PathVariable("albumId") String albumId) {
		AlbumResult result = new AlbumResult();
		AlbumCache album =(AlbumCache) cache.getLocalCache(KeyPrefix.keyPrefix+albumId);
//		System.out.println(KeyPrefix.keyPrefix+albumId);
//		System.out.println(cache.getMemoryStoreSize());
//		System.out.println(cache.getSize());
		if (album == null){
			result.failure(StatusCode.CACHE_ERROR);
		}else{
			result.setAlbum(album.getAlbumVO());
			result.setPlist(album.getProgramListVO());
			result.setTotal(album.getProgramListVO().size());
		}
		return result;
	}
	@RequestMapping(value = "/setAlbumCache/{albumNum}", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.GET)
	@ResponseBody
	public AlbumResult setAlbumCache(@PathVariable("albumNum")Integer albumNum) {
		System.out.println("Controller-----"+cache);
		AlbumResult result = new AlbumResult();
		albumService.setAlbumCache(albumNum);
		return result;
	}
	@RequestMapping(value = "/setAlbumCacheById/{albumId}", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.GET)
	@ResponseBody
	public AlbumResult setAlbumCacheById(@PathVariable("albumId")Integer albumId) {
		System.out.println("Controller-----"+cache);
		AlbumResult result = new AlbumResult();
		albumService.setAlbumCacheById(albumId);
		return result;
	}
	
	@RequestMapping(value = "/getTotalEntries", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.GET)
	@ResponseBody
	public AlbumResult getTotalEntries() {
		AlbumResult result = new AlbumResult();
		result.setTotalEntries((long) albumService.getTotalEntries());
		return result;
	}
	@RequestMapping(value = "/getElementSize/{albumId}", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.GET)
	@ResponseBody
	public AlbumResult getElementSize(@PathVariable("albumId")Integer albumId) {
		AlbumResult result = new AlbumResult();
		result.setAlbumCacheSize(albumService.getElementSize(albumId));
		return result;
	}
	
	@RequestMapping(value = "/getStatistics/{albumId}", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.GET)
	@ResponseBody
	public StatisticResult getStatistics(@PathVariable("albumId")Integer albumId) {
		StatisticResult result = new StatisticResult();
		result.setLocalDiskSize(cache.getStatistics().getLocalDiskSize());
		result.setLocalDiskSizeInBytes(cache.getStatistics().getLocalDiskSizeInBytes());
		result.setLocalHeapSize(cache.getStatistics().getLocalHeapSize());
		result.setLocalHeapSizeInBytes(cache.getStatistics().getLocalHeapSizeInBytes());
		result.setLocalSize(cache.getStatistics().getSize());
		result.setAlbumCacheSize(albumService.getElementSize(albumId));
		return result;
	}
}