package com.hesshicaihao.demo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import butterknife.ButterKnife;


//import butterknife.ButterKnife;


public abstract class BaseActivity extends Activity {
    Context mContext;
    public Bundle savedInstanceState;

    public abstract int getLayoutResId();
    public abstract void initView(Bundle savedInstanceState);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mContext = this;
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        ButterKnife.bind(this);
        this.savedInstanceState = savedInstanceState;
        initView(savedInstanceState);

    }
}
