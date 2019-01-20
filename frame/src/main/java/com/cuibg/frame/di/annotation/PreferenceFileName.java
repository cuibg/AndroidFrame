package com.cuibg.frame.di.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author cuibg
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PreferenceFileName {
}
