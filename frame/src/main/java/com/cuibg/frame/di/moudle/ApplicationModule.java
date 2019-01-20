package com.cuibg.frame.di.moudle;

import android.app.Application;
import android.content.Context;

import com.cuibg.frame.di.annotation.ApplicationContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    Application providesApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context providesApplicationContext() {
        return mApplication;
    }
}
