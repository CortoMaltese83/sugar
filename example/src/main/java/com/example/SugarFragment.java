package com.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by francesco.lombardi on 22/09/16.
 */

public class SugarFragment extends Fragment {

    public static final String TAG = SugarFragment.class.getSimpleName();

    public static Fragment newInstance(){
        return new SugarFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sugar, container, false);

        return rootView;
    }


}
