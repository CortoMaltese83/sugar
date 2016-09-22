package com.example.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.example.R;
import com.example.SugarFragment;
import com.example.persistence.entity.BookEntity;
import com.example.utils.FileUtil;

import java.util.List;


public class SugarActivity extends SingleFragmentActivity
{

    private static final String TAG = SugarActivity.class.getSimpleName();

    @Override
    public Fragment createFragment() {
        return SugarFragment.newInstance();
    }

    @Override
    public String getFragmentTag() {
        return SugarFragment.TAG;
    }

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
