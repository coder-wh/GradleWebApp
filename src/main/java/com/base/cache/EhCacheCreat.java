package com.base.cache;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@Configuration
//@EnableAspectJAutoProxy
//@ComponentScan
public class EhCacheCreat {
//	@Resource(name="ehcache")
//	CacheManager ehcache;
//	
//	@Bean(name="localCache")
//	Cache<String, Object> cache(){
//		CacheConfigurationBuilder<String, Object> cacheConfigurationBuilder = CacheConfigurationBuilder.newCacheConfigurationBuilder();
//		CacheConfiguration<String, Object> cacheConfiguration = cacheConfigurationBuilder.buildConfig(String.class, Object.class);
//		Cache<String, Object> cache = ehcache.createCache("localCache", cacheConfiguration);
//		return cache;
//	}
}
