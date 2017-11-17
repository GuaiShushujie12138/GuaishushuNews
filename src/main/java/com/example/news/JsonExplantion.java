package com.example.news;

import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 付旺辉 on 2017/3/14.
 * json解析
 */

public class JsonExplantion {

    private String resultData = null;

    public JsonExplantion(String data) {
        this.resultData = data;
    }

    //解析数据
    public List getList () {
        List<NewsBean.ResultBean.DataBean> list = new ArrayList();
        Gson gson = new Gson();
        Log.i("JsonExplantion","数据:" + resultData);
        NewsBean newsBean = gson.fromJson(resultData, NewsBean.class);
        Log.i("JsonExplantion","newsBean:" + newsBean.toString());
        Log.i("JsonExplantion","newsBean.getResult():" + newsBean.getResult().toString());
        Log.i("JsonExplantion","newsBean.getResult().getData():" + newsBean.getResult().getData().toString());
        //获取data数据
        list = newsBean.getResult().getData();
        Log.i("JsonExplantion","list.size():" + list.size());
        for (NewsBean.ResultBean.DataBean dataBean : list) {
            Log.i("JsonExplantion","dataBean:" + dataBean.toString());
        }
        Log.i("JsonExplantion","list:" + list.toString());
//        NewsBean.ResultBean bean = gson.fromJson(resultData, NewsBean.ResultBean.class);
//        Log.i("JsonExplantion","bean:" + bean.toString());
        //Log.i("JsonExplantion","bean:" + list.toString());
        /*if (bean != null)
            list = bean.getData();*/
        return list;
    }

    //获取json数据中的NewsBean对象
    public NewsBean getNewsBean () {
        NewsBean newsBean = null;
        Gson gson = new Gson();
        newsBean = gson.fromJson(resultData, NewsBean.class);
        return newsBean;
    }
}

