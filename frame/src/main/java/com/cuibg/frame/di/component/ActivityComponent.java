package com.cuibg.frame.di.component;

import com.cuibg.frame.di.moudle.ActivityModule;

import dagger.Component;

@Component(modules = ActivityModule.class,
dependencies = ApplicationComponent.class)
public interface ActivityComponent {
}
