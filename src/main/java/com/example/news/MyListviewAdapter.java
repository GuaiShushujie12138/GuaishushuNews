package com.example.news;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/**
 * Created by 付旺辉 on 2017/3/14.
 */

public class MyListviewAdapter extends BaseAdapter {

    private Context context = null;
    private List datas;
    private NewsBean newsBean;
    private List<Bitmap> bitmaps;

    public MyListviewAdapter(Context context, NewsBean newsBean, List<Bitmap> bitmaps) {
        this.context = context;
        //this.datas = datas;
        this.newsBean = newsBean;
        this.bitmaps = bitmaps;
    }

    @Override
    public int getCount() {
        return newsBean.getResult().getData().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            //将布局文件加载到java代码中
            convertView = View.inflate(context, R.layout.listview_item, null);
            holder = new ViewHolder();
            holder.title = (TextView) convertView.findViewById(R.id.lv_tv_title);
            holder.image = (ImageView) convertView.findViewById(R.id.lv_iv_midst);
            holder.date = (TextView) convertView.findViewById(R.id.lv_tv_down);
            //存放
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Log.i("MyListViewAdapter", "bitmaps.size():" + bitmaps.size());
        //holder.image.setImageURI(Uri.parse(newsBean.getResult().getData().get(position).getThumbnail_pic_s()));
        //holder.image.setImageBitmap(getBitMap(newsBean.getResult().getData().get(position).getThumbnail_pic_s02()));
        holder.image.setImageBitmap(bitmaps.get(position));
        holder.title.setText(newsBean.getResult().getData().get(position).getTitle());
        holder.date.setText("蜀黍资讯\t " + newsBean.getResult().getData().get(position).getDate().toString());

        return convertView;
    }

    //存放控件的静态内部类
    static class ViewHolder {
        TextView title;
        ImageView image;
        TextView date;
    }

    //获取json文件中的图片
    private Bitmap getBitMap (String imageUrl) {
        //从网络中加载图片
        Bitmap bitmap = null;
        InputStream is = null;
                try {

                    URL url = new URL(imageUrl);
                    //字节流读取图片资源
                    is = url.openStream();
                    bitmap = BitmapFactory.decodeStream(is);

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
        return bitmap;
    }

}
