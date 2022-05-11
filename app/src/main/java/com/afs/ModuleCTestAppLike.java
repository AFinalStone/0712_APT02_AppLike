package com.afs;

import android.content.Context;

import com.afs.applike.annotation.AppLikeLifeCycle;
import com.afs.applike.lifecycle.IAppLike;

@AppLikeLifeCycle
public class ModuleCTestAppLike implements IAppLike {
    @Override
    public int getPriority() {
        return NORM_PRIORITY;
    }

    @Override
    public void onCreate(Context context) {
        System.out.println("ModuleCTestAppLike的onCreate方法被执行");
    }

    @Override
    public void onDestroy() {
        System.out.println("ModuleCTestAppLike的onDestroy方法被执行");
    }
}
