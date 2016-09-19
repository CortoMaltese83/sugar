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
/*        File databaseFile = getDatabasePath("demo.db");
        databaseFile.mkdirs();
        databaseFile.delete();
        SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase(databaseFile, "test123", null);
        database.execSQL("create table t1(a, b)");
        database.execSQL("insert into t1(a, b) values(?, ?)", new Object[]{"one for the money", "two for the show"});*/
    }

}
