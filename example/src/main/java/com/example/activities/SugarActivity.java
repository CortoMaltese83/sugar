package com.example.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.fragment.SugarFragment;

public class SugarActivity extends SingleFragmentActivity {

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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
