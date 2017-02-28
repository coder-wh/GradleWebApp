package com.base.cache;


/*import org.ehcache.config.CacheConfiguration;
import org.ehcache.jsr107.Eh107Configuration;*/

public class EHCacheConfiguration {
	
	/*XmlConfiguration xmlConfiguration = new XmlConfiguration(getClass().getResource("/ehcache.xml"));
	org.ehcache.CacheManager cacheManager = CacheManagerBuilder.newCacheManager(xmlConfiguration);
	cacheManager.init();
		Cache<Long, String> cache = cacheManager.createCache("myCache",
		    Eh107Configuration.fromEhcacheCacheConfiguration(xmlConfiguration)); 

		Eh107Configuration<Long, String> configuration = cache.getConfiguration(Eh107Configuration.class);
		configuration.unwrap(CacheConfiguration.class); 

		configuration.unwrap(CacheRuntimeConfiguration.class); 

		try {
		  cache.getConfiguration(CompleteConfiguration.class); 
		  throw new AssertionError("IllegalArgumentException expected");
		} catch (IllegalArgumentException iaex) {
		  // Expected
		}*/
	
//	CachingProvider cachingProvider = Caching.getCachingProvider();
//	javax.cache.CacheManager manager = cachingProvider.getCacheManager( 
//	    getClass().getResource("/org/ehcache/docs/ehcache-jsr107-config.xml").toURI(), 
//	    getClass().getClassLoader()); 
//	Cache<String, Object> localCache = (Cache<String, Object>) manager.getCache("localCache", String.class, Object.class); 
}
