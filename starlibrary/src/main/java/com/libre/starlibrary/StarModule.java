package com.libre.starlibrary;

import android.content.Context;
import android.content.Intent;

import com.alibaba.fastjson.JSONObject;

import io.dcloud.feature.uniapp.annotation.UniJSMethod;
import io.dcloud.feature.uniapp.bridge.UniJSCallback;
import io.dcloud.feature.uniapp.common.UniModule;

public class StarModule extends UniModule {

    @UniJSMethod(uiThread = false)
    public void startStar(UniJSCallback callback) {
        JSONObject data = new JSONObject();
        Context context = mUniSDKInstance.getContext();
        Intent intent = new Intent();
        intent.setClass(context, com.google.android.stardroid.activities.DynamicStarMapActivity.class);
        context.startActivity(intent);
        callback.invoke(data);
    }

}
