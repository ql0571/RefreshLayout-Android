package com.ql0571.refreshlayout.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ql0571.refreshlayout.IHeaderWrapper;
import com.ql0571.refreshlayout.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class SimpleRefreshView extends LinearLayout implements IHeaderWrapper {

    private TextView lvHeaderTipsTv;
    private TextView lvHeaderLastUpdatedTv;
    private SimpleDateFormat MINUTE;

    public SimpleRefreshView(Context context) {
        this(context, null);
    }

    public SimpleRefreshView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SimpleRefreshView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        MINUTE = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_refresh_header, this, true);
        lvHeaderTipsTv = (TextView) view.findViewById(R.id.lvHeaderTipsTv);
        lvHeaderLastUpdatedTv = (TextView) view.findViewById(R.id.lvHeaderLastUpdatedTv);
    }

    @Override
    public void pullDown() {
        lvHeaderTipsTv.setText("下拉刷新");
    }

    @Override
    public void pullDownReleasable() {
        lvHeaderTipsTv.setText("松开刷新");
    }

    @Override
    public void pullDownRelease() {
        lvHeaderTipsTv.setText("正在刷新");
    }

    @Override
    public void pullDownFinish() {

        lvHeaderLastUpdatedTv.setText("最近更新" + MINUTE.format(new Date()));
    }
}
