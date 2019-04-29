package com.example.mainlibrary;

import android.content.Context;

import com.example.commonlibrary.IStartMainContainer;
import com.google.auto.service.AutoService;

/**
 * Created by lijie on 2019/4/17.
 */
@AutoService(IStartMainContainer.class)
public class StartMainContainer implements IStartMainContainer {
    @Override
    public void startMainActivity(Context context) {
        MainContainerActivity.start(context);
    }
}
