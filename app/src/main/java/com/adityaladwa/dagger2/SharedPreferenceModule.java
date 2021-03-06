package com.adityaladwa.dagger2;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Aditya on 07-May-16.
 */
@Module
public class SharedPreferenceModule {
    Application mApplication;

    public SharedPreferenceModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    //Application is required for shared preference
    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }

    //Application context is injected using the above menthd
    @Provides
    @Singleton
    SharedPreferences providesSharedPreferences(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
}
