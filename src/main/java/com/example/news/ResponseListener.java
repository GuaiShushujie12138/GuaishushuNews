package com.example.news;

/**
 * Created by 付旺辉 on 2017/3/14.
 */
public interface ResponseListener {
    String onResult(String s);

    void onError(String message);
}
