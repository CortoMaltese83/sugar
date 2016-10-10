package com.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.model.adapter.BookListAdapter;
import com.example.model.rv_row.SingleBookRow;

import java.util.List;

/**
 * Created by francesco.lombardi on 22/09/16.
 */

public class SugarFragment extends Fragment {

    public static final String TAG = SugarFragment.class.getSimpleName();
    private RecyclerView mRecyclerView;
    private List<SingleBookRow> mListOfBooks;

    public static Fragment newInstance(){
        return new SugarFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sugar, container, false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        setUpRecyclerView();
        return rootView;
    }

    private void setUpRecyclerView(){
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));
        mRecyclerView.setAdapter(new BookListAdapter(getActivity(), mListOfBooks));
    }



}
