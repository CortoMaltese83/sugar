package com.example.activities;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.R;

/**
 * Created by francesco.lombardi on 22/09/16.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {

    private static final String TAG = SingleFragmentActivity.class.getSimpleName();


    public abstract Fragment createFragment();

    public abstract String getFragmentTag();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);
        commitFragment();
    }

    /**
     * This method commits the fragment at the specified position
     *
     */
    protected void commitFragment() {
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = createFragment();
        fm.beginTransaction().replace(R.id.fragment_container, fragment, getFragmentTag()).commit();
    }
}
