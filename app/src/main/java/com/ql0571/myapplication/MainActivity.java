package com.ql0571.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNestedScrollView(View v){
        startActivity(new Intent(this,NestedScrollViewActivity.class));
    }

    public void onRecycleview(View v){
        startActivity(new Intent(this,RecycleviewActivity.class));
    }

}
