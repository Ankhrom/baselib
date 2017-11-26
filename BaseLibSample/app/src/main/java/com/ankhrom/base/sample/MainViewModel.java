package com.ankhrom.base.sample;

import com.ankhrom.base.viewmodel.BaseViewModel;

/**
 * Created by R' on 11/26/2017.
 */

public class MainViewModel extends BaseViewModel {
    @Override
    public int getLayoutResource() {
        return R.layout.main_page;
    }

    @Override
    public int getBindingResource() {
        return BR.VM;
    }
}
