package com.cuibg.frame.di.component;

import com.cuibg.frame.di.moudle.DataMoudle;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DataMoudle.class)
public interface DataComponent {
}
