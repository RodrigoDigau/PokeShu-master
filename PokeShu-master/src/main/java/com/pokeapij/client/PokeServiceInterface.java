package com.pokeapij.client;

import com.pokeapij.cache.InMemoryCache;


public interface PokeServiceInterface {

    Object getResource(String cacheID, String path, String objectName);

    Object queryAPI(String path, String ObjectName);

    Object parseJSONtoObject(String jsonString, String Objectname);

    InMemoryCache getCache();

    void changeCacheTime(long seconds);

    long getCacheTime();
}
