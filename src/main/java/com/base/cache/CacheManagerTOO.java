package com.base.cache;
/*package com.kting.huawei.fm.base.cache;

import org.ehcache.Cache;
import org.ehcache.CacheManagerBuilder;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.CacheConfigurationBuilder;
import org.ehcache.config.ResourcePoolsBuilder;
import org.ehcache.config.xml.XmlConfiguration;
import org.springframework.stereotype.Repository;

import com.kting.huawei.fm.base.cache.album.AlbumCache;

@Repository("cManagerThree")
public class CacheManagerThree {

	private Cache<String, com.kting.huawei.fm.base.cache.album.AlbumCache> localCache;

	public CacheManagerThree() {
		super();
		this.localCache = cacheManager().getCache("localCache", String.class, AlbumCache.class);
	}

	public org.ehcache.CacheManager cacheManager() {
		org.ehcache.CacheManager cacheManager = null;
			try {
				XmlConfiguration xmlConfiguration = new XmlConfiguration(getClass().getResource("/ehcache300.xml"));
				cacheManager = CacheManagerBuilder.newCacheManager(xmlConfiguration);
				cacheManager.init();
				if (cacheManager != null) {
					System.out.println("nullehcacheehcacheehcacheehcacheehcacheehcache");
				}
				System.out.println("ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
				CacheConfigurationBuilder<String, AlbumCache> cacheConfigurationBuilder = CacheConfigurationBuilder
						.newCacheConfigurationBuilder();
				//(String.class, AlbumCache.class, ResourcePoolsBuilder.newResourcePoolsBuilder().build());
				CacheConfiguration<String, AlbumCache> cacheConfiguration = cacheConfigurationBuilder
						.buildConfig(String.class, AlbumCache.class);
				//build();
				Cache<String, AlbumCache> cache = cacheManager.createCache("localCache", cacheConfiguration);
				return cacheManager;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("exception");
			}
			return cacheManager;
	}

	public void setLocalCache(String key, AlbumCache obj) {
		localCache.put(key, obj);
	}

	public Object getLocalCache(String key) {
		Object values = localCache.get(key);
		return values;
	}
}
*/