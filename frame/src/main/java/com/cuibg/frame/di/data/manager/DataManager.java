package com.cuibg.frame.di.data.manager;

import com.cuibg.frame.di.data.cache.CacheHelper;
import com.cuibg.frame.di.data.db.DbHelper;
import com.cuibg.frame.di.data.prefs.PreferencesHelper;


public interface DataManager extends DbHelper, CacheHelper, PreferencesHelper {
}
