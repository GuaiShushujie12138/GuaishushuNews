package com.example.news;

/**
 * Created by 付旺辉 on 2017/3/14.
 */
public class BasicValue<K, V> {
    private K key;
    private V value;

    public BasicValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
