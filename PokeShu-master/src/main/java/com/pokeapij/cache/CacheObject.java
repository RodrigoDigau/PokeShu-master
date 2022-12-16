package com.pokeapij.cache;

import java.lang.ref.SoftReference;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;


public class CacheObject implements Delayed {

    private final String key;
    private final SoftReference<Object> reference;
    private final long expiryTime;

    public CacheObject(String key, SoftReference<Object> reference, long expiryTime) {
        this.key = key;
        this.reference = reference;
        this.expiryTime = expiryTime;
    }

    public String getKey() {
        return key;
    }

    public SoftReference<Object> getReference() {
        return reference;
    }

    public long getExpiryTime() {
        return expiryTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(expiryTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(expiryTime, ((CacheObject) o).expiryTime);
    }
}
