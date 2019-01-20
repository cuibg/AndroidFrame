package com.cuibg.frame.di.data.manager;

import com.cuibg.frame.di.data.cache.CacheHelper;
import com.cuibg.frame.di.data.db.DbHelper;
import com.cuibg.frame.di.data.prefs.PreferencesHelper;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class DataManagerHelperImpl implements DataManager {
    @Inject
    public DataManagerHelperImpl(CacheHelper cacheHelper,
                                 DbHelper dbHelper,
                                 PreferencesHelper preferencesHelper) {
    }
}
