package com.hesshicaihao.demo;


import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.root_ll)
    LinearLayout root_ll;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        root_ll.setVisibility(View.GONE);
    }


}
