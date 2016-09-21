package com.example.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.R;
import com.example.persistence.entity.BookEntity;
import com.example.utils.FileUtil;

import net.sqlcipher.database.SQLiteDatabase;

import java.io.File;
import java.util.List;


public class SugarActivity extends Activity
{

    private static final String TAG = SugarActivity.class.getSimpleName();
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        BookEntity book = new BookEntity("Title here", "2nd edition");
        book.save();

        List<BookEntity> books = book.listAll(BookEntity.class);
        for(BookEntity tmp: books){
            Log.e(TAG, tmp.getTitle());
        }

        FileUtil.saveDataBaseBackUp(getApplicationContext());

    }
}
