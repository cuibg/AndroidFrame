package com.cuibg.frame.di.component;

import android.app.Application;

import com.cuibg.frame.di.moudle.ApplicationModule;

import dagger.Component;

@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(Application application);
}
