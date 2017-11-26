package com.ankhrom.base.sample;

import android.support.v7.widget.Toolbar;

import com.ankhrom.base.Base;
import com.ankhrom.base.BaseActivity;
import com.ankhrom.base.BaseFactory;
import com.ankhrom.base.interfaces.viewmodel.ViewModelObserver;
import com.ankhrom.base.viewmodel.BaseViewModelObserver;

public class MainActivity extends BaseActivity {

    @Override
    protected boolean onPreInit() {

        Base.debug = true;

        return super.onPreInit();
    }

    @Override
    protected ViewModelObserver init() {
        return BaseViewModelObserver.with(BaseFactory.init(this), R.id.root_container)
                .setViewModel(MainViewModel.class)
                .build();
    }

    @Override
    protected int getMainLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected Toolbar getToolbar() {
        return null;
    }
}
