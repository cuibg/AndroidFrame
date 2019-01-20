package com.cuibg.frame.di.moudle;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.cuibg.frame.di.annotation.ActivityContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    AppCompatActivity mAppCompactActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mAppCompactActivity = activity;
    }

    @Provides
    Activity providesActivity() {
        return mAppCompactActivity;
    }

    @Provides
    @ActivityContext
    Context providesActivityContext() {
        return mAppCompactActivity;
    }

    @Provides
    FragmentManager providesSupportFragmentManager() {
        return mAppCompactActivity.getSupportFragmentManager();
    }
}
