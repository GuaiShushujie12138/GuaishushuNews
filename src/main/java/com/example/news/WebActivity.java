package com.example.news;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

/**
 * Created by 付旺辉 on 2017/3/15.
 */

public class WebActivity extends AppCompatActivity {

    private WebView mWv_show;
    private ImageView mIv_back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        initView();
        initData();
        initListener();

    }

    private void initListener() {
        //对返回监听
        mIv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebActivity.this.finish();
            }
        });
    }

    private void initData() {
        //获取从MainActivity中传过来的数据
        Intent intent = getIntent();
        /*Bundle bundle = intent.getExtras();
        NewsBean newsBean = (NewsBean) bundle.getSerializable("newsBean");
        int position = bundle.getInt("position");*/
       // Log.i("WebActivity", "position:" + position + "newsBean" + newsBean.toString());
        mWv_show.getSettings().setJavaScriptEnabled(true);
        String url = intent.getStringExtra("url");
        Log.i("WebActivity", url + "");
        //加载页面
        mWv_show.loadUrl(url);
        mWv_show.setWebViewClient(new MyWebViewClient());
    }

    private void initView() {
        mWv_show = (WebView) findViewById(R.id.web_wv);
        mIv_back = (ImageView) findViewById(R.id.web_iv_back);
    }

    /**
     * 设置回退
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) || mWv_show.canGoBack()) {
            mWv_show.goBack(); //goBack()表示返回WebView的上一页面
            return true;
        }
        return false;
    }

    //Web视图
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}
