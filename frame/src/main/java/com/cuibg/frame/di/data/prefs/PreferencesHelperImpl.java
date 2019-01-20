package com.cuibg.frame.di.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.cuibg.frame.di.annotation.ApplicationContext;
import com.cuibg.frame.di.annotation.PreferenceFileName;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class PreferencesHelperImpl implements PreferencesHelper {
    private final SharedPreferences mPrefs;

    @Inject
    public PreferencesHelperImpl(@ApplicationContext Context context,
                                 @PreferenceFileName String prefFileName) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }
}
