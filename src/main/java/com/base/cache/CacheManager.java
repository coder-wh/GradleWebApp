package com.base.cache;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
import net.sf.ehcache.statistics.StatisticsGateway;

@Repository("cManager")
public class CacheManager {
	@Resource
	private Cache localCache;
	
// -------------------------------------本地缓存----------------------------------------------
	//ehcache2.8
	public void setLocalCache(String key, Object obj) {
		Element element = new Element(key, obj);
		localCache.put(element);
	}
	public Object getLocalCache(String key) {
		Element values = localCache.get(key);
		if (values != null) {
			return values.getObjectValue();
		}
		return null;
	}
	public Element getLocalCacheElement(String key) {
		return localCache.get(key);
	}
	public int getTotalEntries(){
		return localCache.getSize();
	}
	public long getElementSize(String key){
		Element values = localCache.get(key);
		if (values != null) {
			return values.getSerializedSize();
		}
		return -1;
	}
	
	public StatisticsGateway getStatistics(){
		return localCache.getStatistics();
	}
	
}