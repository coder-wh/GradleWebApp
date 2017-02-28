package com.base.cache;

/*import org.ehcache.Cache;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.ResourcePools;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.xml.XmlConfiguration;*/
import org.springframework.stereotype.Repository;

import com.base.cache.album.AlbumCache;

@Repository("cManagerTOT")
public class CacheManagerTOT {

	/*private Cache<String, com.base.cache.album.AlbumCache> localCache;

	public CacheManagerTOT() {
		super();
		this.localCache = cacheManager().getCache("localCache", String.class, AlbumCache.class);
		System.out.println(localCache);
	}

	public org.ehcache.CacheManager cacheManager() {
		org.ehcache.CacheManager cacheManager = null;
		XmlConfiguration xmlConfiguration = new XmlConfiguration(getClass().getResource("/ehcache303.xml"));
		cacheManager = CacheManagerBuilder.newCacheManager(xmlConfiguration);
		cacheManager.init();
//		if (cacheManager != null) {
//			System.out.println("nullehcacheehcacheehcacheehcacheehcacheehcache");
//		}
//		ResourcePools pools = ResourcePoolsBuilder.heap(10000L).build();
//		CacheConfigurationBuilder<String, AlbumCache> cacheConfigurationBuilder = CacheConfigurationBuilder
//				.newCacheConfigurationBuilder(String.class, AlbumCache.class, pools);
//		CacheConfiguration<String, AlbumCache> cacheConfiguration = cacheConfigurationBuilder.build();
//		if (cacheManager.getCache("localCache", String.class, AlbumCache.class) == null){
//			cacheManager.createCache("localCache", cacheConfiguration);
//			System.out.println("createCache==>localCache");
//		}
		System.out.println(cacheManager);
		return cacheManager;
	}

	public void setLocalCache(String key, AlbumCache obj) {
		localCache.put(key, obj);
	}

	public AlbumCache getLocalCache(String key) {
		AlbumCache values = localCache.get(key);
		return values;
	}
	
	public int getTotalEntries(){
		return -1;
	}
	
	public long getElementSize(String albumId){
		return -1L;
	}*/
}
