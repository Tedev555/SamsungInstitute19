package com.tedory.samsunglab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifecycleActivity extends AppCompatActivity {
    private static String LOG_TAG = "LifeCycleLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        Log.d(LOG_TAG, "State: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e(LOG_TAG, "State: onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(LOG_TAG, "State: onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(LOG_TAG, "State: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(LOG_TAG, "State: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(LOG_TAG, "State: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(LOG_TAG, "State: onDestroy");
    }
}
