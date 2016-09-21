package com.orm;

import android.app.Application;

import net.sqlcipher.database.SQLiteDatabase;


public class SugarApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        InitializeSQLCipher();
        SugarContext.init(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        SugarContext.terminate();
    }

    private void InitializeSQLCipher() {
        SQLiteDatabase.loadLibs(this);
    }

}
