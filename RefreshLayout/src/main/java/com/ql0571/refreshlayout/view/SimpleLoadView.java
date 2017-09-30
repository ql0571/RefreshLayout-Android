package com.ql0571.refreshlayout.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ql0571.refreshlayout.IFooterWrapper;
import com.ql0571.refreshlayout.R;


public class SimpleLoadView extends LinearLayout implements IFooterWrapper {

    private ImageView mIvLoad;
    private TextView mTvLoad;

    public SimpleLoadView(Context context) {
        this(context, null);
    }

    public SimpleLoadView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SimpleLoadView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_refresh_footer, this, true);
        mIvLoad = (ImageView) view.findViewById(R.id.iv_load_image);
        mTvLoad = (TextView) view.findViewById(R.id.tv_load_text);
    }

    @Override
    public void pullUp() {
        mTvLoad.setText("上拉加载");
    }

    @Override
    public void pullUpReleasable() {
        mTvLoad.setText("松手可加载");
    }

    @Override
    public void pullUpRelease() {
        mTvLoad.setText("正在加载");
        AnimationDrawable drawable = (AnimationDrawable) mIvLoad.getDrawable();
        drawable.start();
    }
}
