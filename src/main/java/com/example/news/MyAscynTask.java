package com.example.news;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ListView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 付旺辉 on 2017/3/14.
 */

public class MyAscynTask extends AsyncTask<String, NewsBean , String> {


    private List<NewsBean.ResultBean.DataBean> datas;
    private ListView lv;
    private Context context;
    private MainActivity mainActivity;
    private NewsBean newsBean;
    private List<Bitmap> bitmaps;
    private List<BasicValue<String,String>> basicValues;
    private ProgressDialog progressDialog;

    public MyAscynTask (Context context, ListView lv, MainActivity mainActivity) {
        this.context = context;
        this.lv = lv;
        this.mainActivity = mainActivity;
    }

    /**
     * 执行连接网络获取数据
     * @param params
     * @return
     */
    @Override
    protected String doInBackground(String... params) {

        Log.i("MyAscynTask","doInBackground");
        basicValues = new ArrayList<>();
        basicValues.add(new BasicValue<String, String>("type",params[0]));
        basicValues.add(new BasicValue<String, String>("key", "34eefeb7c004448730215c8b7128e29c"));
        //获取连接
        MyHttpURLConnectionUtil.sendRequest("http://v.juhe.cn/toutiao/index", basicValues, new ResponseListener() {
            @Override
            public String onResult(String s) {
                Log.i("MyAscynTask","response得到的数据:" + s);
                JsonExplantion explantion = new JsonExplantion(s);

                newsBean = explantion.getNewsBean();
                mainActivity.setNewsBean(newsBean);
                datas = explantion.getList();
                Log.i("MyAscynTask","datas:" + datas.toString());
                Log.i("MyAscynTask","datas:" + newsBean.toString());
                return s;
            }

            @Override
            public void onError(String message) {

            }
        });
        bitmaps = getBitMaps(newsBean);
        publishProgress(newsBean);
        Log.i("MyAscynTask","publishProgress,datas:" + datas.toString());
        return "加载完毕";
    }

    /**
     * 更新ui
     * @param values
     */
    @Override
    protected void onProgressUpdate(NewsBean... values) {
        Log.i("MyAscynTask","onProgressUpdate");
        //Log.i("MyAscynTask","" + values[0].toString());
        //Log.i("MyAscynTask","" + datas.toString());
        //为listview加载适配器
        lv.setAdapter(new MyListviewAdapter(context, values[0], bitmaps));
        progressDialog.setProgress(99);
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String s) {
        progressDialog.dismiss();
    }

    /**
     * 准备工作
     */
    @Override
    protected void onPreExecute() {
        progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("怪蜀黍News");
        progressDialog.setMessage("正在加载,请耐心等待...");
        progressDialog.setCancelable(false);
        progressDialog.setMax(100);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.show();
    }

    //获取图片
    private List<Bitmap> getBitMaps (NewsBean newsBean) {
        //从网络中加载图片
        List<Bitmap> bitmaps = new ArrayList<>();
        InputStream is = null;
        try {
            for (int i =0; i<newsBean.getResult().getData().size();i++) {
                URL url = new URL(newsBean.getResult().getData().get(i).getThumbnail_pic_s());
                //字节流读取图片资源
                is = url.openStream();
                Bitmap bitmap = BitmapFactory.decodeStream(is);
                bitmaps.add(bitmap);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return bitmaps;
    }

}
