package com.libre.starlibrary;

import android.app.Application;

import com.google.android.stardroid.StardroidApplication;

import io.dcloud.feature.uniapp.UniAppHookProxy;

public class StarProxy implements UniAppHookProxy {

    @Override
    public void onSubProcessCreate(Application application) {

    }

    @Override
    public void onCreate(Application application) {
        StardroidApplication starApp= new StardroidApplication();
        starApp.init(application);
    }
}
