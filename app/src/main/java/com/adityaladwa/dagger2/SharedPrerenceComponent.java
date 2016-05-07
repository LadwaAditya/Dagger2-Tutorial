package com.adityaladwa.dagger2;

import android.content.SharedPreferences;

import dagger.Component;

/**
 * Created by Aditya on 07-May-16.
 */
@Component(modules = {SharedPreferenceModule.class})
public interface SharedPrerenceComponent {
    SharedPreferences getSharedPreference();
}
