package com.adityaladwa.dagger2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences mSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Dagger%COMPONENT_NAME%
        mSharedPreferences = DaggerSharedPrerenceComponent.builder()
                .sharedPreferenceModule(new SharedPreferenceModule(getApplication()))
                .build().getSharedPreference();

        String messgage = mSharedPreferences.getString("key", "Hello");
        Toast.makeText(this, messgage, Toast.LENGTH_SHORT).show();

    }
}
