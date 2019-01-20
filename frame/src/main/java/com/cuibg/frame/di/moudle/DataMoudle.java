package com.cuibg.frame.di.moudle;

import com.cuibg.frame.di.data.cache.CacheHelper;
import com.cuibg.frame.di.data.cache.CacheHelperImpl;
import com.cuibg.frame.di.data.db.DbHelper;
import com.cuibg.frame.di.data.db.DbHelperImpl;
import com.cuibg.frame.di.data.manager.DataManager;
import com.cuibg.frame.di.data.manager.DataManagerHelperImpl;
import com.cuibg.frame.di.data.prefs.PreferencesHelper;
import com.cuibg.frame.di.data.prefs.PreferencesHelperImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataMoudle {
    @Provides
    @Singleton
    PreferencesHelper providesPreferencesHelper(PreferencesHelperImpl preferencesHelperImpl) {
        return preferencesHelperImpl;
    }

    @Provides
    @Singleton
    CacheHelper providesCacheHelper(CacheHelperImpl cacheHelper) {
        return cacheHelper;
    }

    @Provides
    @Singleton
    DbHelper providesDbHelper(DbHelperImpl dbHelper) {
        return dbHelper;
    }

    @Provides
    @Singleton
    DataManager providesDataManger(DataManagerHelperImpl dataManagerHelper) {
        return dataManagerHelper;
    }
}
