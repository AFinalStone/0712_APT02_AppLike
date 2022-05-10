package com.afs.modulec;

import android.content.Context;

import com.afs.applike.lifecycle.IAppLike;

public class ModelCAppLike implements IAppLike {
    @Override
    public int getPriority() {
        return NORM_PRIORITY;
    }

    @Override
    public void onCreate(Context context) {
        System.out.println("ModelCAppLike的onCreate方法被执行");
    }

    @Override
    public void onDestroy() {
        System.out.println("ModelCAppLike的onDestroy方法被执行");
    }
}
