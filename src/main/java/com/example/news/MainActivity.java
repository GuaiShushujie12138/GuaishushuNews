package com.example.news;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ListView mLv_show = null;
    private MyAscynTask ascynTask;
    private NewsBean newsBean;
    private boolean isClick = false;//是否点击了右上角按钮
    private Button mBtn_show, mBtn_keji, mBtn_location, mBtn_toutiao, mBtn_shehui, mBtn_yule, mBtn_guoji, mBtn_junshi, mBtn_fashion, mBtn_caijing, mBtn_tiyu;
    private List<Button> buttons = new ArrayList<>();
    private ImageView mIv_seek;
    private EditText mEd_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化控件
        initView();
        //初始化数据
        initData();
        //初始化监听
        initListener();

    }

    //初始化监听
    private void initListener() {

        //对listview监听
        mLv_show.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /**
                 * 把当前点击的listview条目的id和json对象传给webview
                 */
                Log.i("MainActivity", "你点击了第" + position + "个item");
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("url", newsBean.getResult().getData().get(position).getUrl());
                startActivity(intent);
            }
        });

        mIv_seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String seek = mEd_input.getText().toString();
                switch (seek) {
                    case "科技":
                    case "keji":
                        mBtn_show.setText("科技");
                        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, MainActivity.this);
                        ascynTask.execute("keji");
                        initListener();
                        break;
                    case "军事":
                    case "junshi":
                        mBtn_show.setText("军事");
                        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, MainActivity.this);
                        ascynTask.execute("junshi");
                        initListener();
                        break;
                    case "国内":
                    case "guonei":
                        mBtn_show.setText("国内");
                        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, MainActivity.this);
                        ascynTask.execute("guonei");
                        initListener();
                        break;
                    case "国际":
                    case "guoji":
                        mBtn_show.setText("国际");
                        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, MainActivity.this);
                        ascynTask.execute("guoji");
                        initListener();
                        break;
                    case "体育":
                    case "tiyu":
                        mBtn_show.setText("体育");
                        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, MainActivity.this);
                        ascynTask.execute("tiyu");
                        initListener();
                        break;
                    case "财经":
                    case "caijing":
                        mBtn_show.setText("财经");
                        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, MainActivity.this);
                        ascynTask.execute("caijing");
                        initListener();
                        break;
                    case "娱乐":
                    case "yule":
                        mBtn_show.setText("娱乐");
                        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, MainActivity.this);
                        ascynTask.execute("yule");
                        initListener();
                        break;
                    case "时尚":
                    case "shishang":
                    case "fashion":
                        mBtn_show.setText("时尚");
                        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, MainActivity.this);
                        ascynTask.execute("shishang");
                        initListener();
                        break;
                    case "头条":
                    case "toutiao":
                        mBtn_show.setText("头条");
                        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, MainActivity.this);
                        ascynTask.execute("toutiao");
                        initListener();
                        break;
                    case "社会":
                    case "shehui":
                        mBtn_show.setText("社会");
                        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, MainActivity.this);
                        ascynTask.execute("shehui");
                        initListener();
                        break;
                    default:
                        mBtn_show.setText("科技");
                        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, MainActivity.this);
                        ascynTask.execute("keji");
                        initListener();
                        break;
                }
            }
        });

    }

    //初始化数据
    private void initData() {
        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, this);
        buttons.add(mBtn_show);
        buttons.add(mBtn_keji);
        buttons.add(mBtn_location);
        buttons.add(mBtn_toutiao);
        buttons.add(mBtn_shehui);
        buttons.add(mBtn_yule);
        buttons.add(mBtn_guoji);
        buttons.add(mBtn_junshi);
        buttons.add(mBtn_tiyu);
        buttons.add(mBtn_caijing);
        buttons.add(mBtn_fashion);
        for (int i =0;i<buttons.size();i++) {
            Button button = buttons.get(i);
            button.setOnClickListener(MainActivity.this);
        }
        ascynTask = new MyAscynTask(MainActivity.this, mLv_show, this);
        ascynTask.execute("keji");
    }

    //初始化控件
    private void initView() {
        mLv_show = (ListView) findViewById(R.id.main_lv_show);
        mBtn_show = (Button) findViewById(R.id.main_btn_show);
        mBtn_keji = (Button) findViewById(R.id.main_btn_keji);
        mBtn_location = (Button) findViewById(R.id.main_btn_location);
        mBtn_toutiao = (Button) findViewById(R.id.main_btn_toutiao);
        mBtn_shehui = (Button) findViewById(R.id.main_btn_shehui);
        mBtn_yule = (Button) findViewById(R.id.main_btn_yule);
        mBtn_guoji = (Button) findViewById(R.id.main_btn_guoji);
        mBtn_junshi = (Button) findViewById(R.id.main_btn_junshi);
        mBtn_tiyu = (Button) findViewById(R.id.main_btn_tiyu);
        mBtn_caijing = (Button) findViewById(R.id.main_btn_caijing);
        mBtn_fashion = (Button) findViewById(R.id.main_btn_fashion);
        mIv_seek = (ImageView) findViewById(R.id.main_iv_seek);
        mEd_input = (EditText) findViewById(R.id.main_et_input);
    }

//    public void get (View view) {
//        //ascynTask.execute(1000);
//    }

    public NewsBean getNewsBean() {
        return newsBean;
    }

    public void setNewsBean(NewsBean newsBean) {
        this.newsBean = newsBean;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_btn_show:
                if (!isClick) {
                    isClick = true;
                    startAnimation();
                }else {
                    isClick = false;
                    endAnimation();
                }
                break;
            case R.id.main_btn_keji:
                mBtn_show.setText("科技");
                endAnimation();
                ascynTask = new MyAscynTask(MainActivity.this, mLv_show, this);
                ascynTask.execute("keji");
                initListener();
                break;
            case R.id.main_btn_location:
                mBtn_show.setText("国内");
                endAnimation();
                ascynTask = new MyAscynTask(MainActivity.this, mLv_show, this);
                ascynTask.execute("guonei");
                initListener();
                break;
            case R.id.main_btn_toutiao:
                mBtn_show.setText("头条");
                endAnimation();
                ascynTask = new MyAscynTask(MainActivity.this, mLv_show, this);
                ascynTask.execute("toutiao");
                initListener();
                break;
            case R.id.main_btn_shehui:
                mBtn_show.setText("社会");
                endAnimation();
                ascynTask = new MyAscynTask(MainActivity.this, mLv_show, this);
                ascynTask.execute("shehui");
                initListener();
                break;
            case R.id.main_btn_yule:
                mBtn_show.setText("娱乐");
                endAnimation();
                ascynTask = new MyAscynTask(MainActivity.this, mLv_show, this);
                ascynTask.execute("yule");
                initListener();
                break;
            case R.id.main_btn_guoji:
                mBtn_show.setText("国际");
                endAnimation();
                ascynTask = new MyAscynTask(MainActivity.this, mLv_show, this);
                ascynTask.execute("guoji");
                initListener();
                break;
            case R.id.main_btn_junshi:
                mBtn_show.setText("军事");
                endAnimation();
                ascynTask = new MyAscynTask(MainActivity.this, mLv_show, this);
                ascynTask.execute("junshi");
                initListener();
                break;
            case R.id.main_btn_tiyu:
                mBtn_show.setText("体育");
                endAnimation();
                ascynTask = new MyAscynTask(MainActivity.this, mLv_show, this);
                ascynTask.execute("tiyu");
                initListener();
                break;
            case R.id.main_btn_caijing:
                mBtn_show.setText("财经");
                endAnimation();
                ascynTask = new MyAscynTask(MainActivity.this, mLv_show, this);
                ascynTask.execute("caijing");
                initListener();
                break;
            case R.id.main_btn_fashion:
                mBtn_show.setText("时尚");
                endAnimation();
                ascynTask = new MyAscynTask(MainActivity.this, mLv_show, this);
                ascynTask.execute("shishang");
                initListener();
                break;
            default:
        }
    }

    private void endAnimation() {
        for (int i=0; i<buttons.size();i++) {
            ObjectAnimator animator = ObjectAnimator.ofFloat(buttons.get(i), "translationY", -80F*i, 0);
            animator.setDuration(50);
            animator.setStartDelay(20*i);
            animator.start();
        }
    }

    private void startAnimation() {

        for (int i=0; i<buttons.size();i++) {
            ObjectAnimator animator = ObjectAnimator.ofFloat(buttons.get(i), "translationY", 0F, 80F*i);
            animator.setDuration(80);
            animator.setStartDelay(50*i);
            animator.start();
        }
    }

}
