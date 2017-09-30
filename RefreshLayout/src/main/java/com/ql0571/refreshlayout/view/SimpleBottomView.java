package com.ql0571.refreshlayout.view;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.ql0571.refreshlayout.IBottomWrapper;
import com.ql0571.refreshlayout.R;


public class SimpleBottomView extends LinearLayout implements IBottomWrapper {

    public SimpleBottomView(Context context) {
        this(context, null);
    }

    public SimpleBottomView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SimpleBottomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView(){
        setBackgroundColor(Color.parseColor("#F5F8F9"));
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_refresh_bottom,this,true);
    }

    @Override
    public void showBottom() {

    }
}
