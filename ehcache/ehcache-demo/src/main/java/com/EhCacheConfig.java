package com;

import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.sf.ehcache.Cache;
import net.sf.ehcache.config.CacheConfiguration;


@Configuration
public class EhCacheConfig {
	@Bean 
	public EhCacheManagerFactoryBean cacheManager() {
		return new EhCacheManagerFactoryBean();
	}
	
	@Bean
	public EhCacheCacheManager testEhCacheManager() {
		CacheConfiguration testEhCacheConfig = new CacheConfiguration()
			.eternal(false)						// if true, timeouts are ignored
			.timeToIdleSeconds(60)				// time since last accessed before item is marked for removal
			.timeToLiveSeconds(60)				// time since inserted before item is marked for removal
			.maxEntriesLocalHeap(10)			// total items that can be stored in cache
			.memoryStoreEvictionPolicy("LRU")	// eviction policy for when items exceed cache. LRU = Least Recently Used
			.name("testCache");
		
		Cache testCache = new Cache(testEhCacheConfig);
		
		cacheManager().getObject().addCache(testCache);
		return new EhCacheCacheManager(cacheManager().getObject());
	}
}
