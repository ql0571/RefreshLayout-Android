package com.ql0571.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ql0571.refreshlayout.RefreshLayout;
import com.ql0571.refreshlayout.view.SimpleBottomView;
import com.ql0571.refreshlayout.view.SimpleLoadView;
import com.ql0571.refreshlayout.view.SimpleRefreshView;

import java.util.ArrayList;
import java.util.List;

public class NestedScrollViewActivity extends AppCompatActivity {


    RefreshLayout mSimpleRefreshLayout;
    private Button bt_refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refresh2);
        mSimpleRefreshLayout = (RefreshLayout) findViewById(R.id.simple_refresh);
        bt_refresh = (Button) findViewById(R.id.bt_refresh);
        bt_refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSimpleRefreshLayout.autoRefresh();
            }
        });

        mSimpleRefreshLayout.setScrollEnable(true);
        mSimpleRefreshLayout.setPullUpEnable(true);
        mSimpleRefreshLayout.setPullDownEnable(true);
        mSimpleRefreshLayout.setHeaderView(new SimpleRefreshView(this));
        mSimpleRefreshLayout.setFooterView(new SimpleLoadView(this));
        mSimpleRefreshLayout.setBottomView(new SimpleBottomView(this));

        mSimpleRefreshLayout.setOnSimpleRefreshListener(new RefreshLayout.OnSimpleRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mData.add(0, "我是刷新的数据");
                        mSimpleRefreshLayout.onRefreshComplete();

                    }
                }, 3000);
            }

            @Override
            public void onLoadMore() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mData.add(mData.size(), "我是加载的数据");
                        mSimpleRefreshLayout.onLoadMoreComplete();

                        if (mData.size() >= 13) {
                            mSimpleRefreshLayout.showNoMore(true);
                        }
                    }
                }, 1500);
            }
        });

        initData();
    }

    List<String> mData = new ArrayList<>();

    private void initData() {
        for (int i = 0; i < 10; i++) {
            mData.add("第" + i + "个");
        }
    }
}
