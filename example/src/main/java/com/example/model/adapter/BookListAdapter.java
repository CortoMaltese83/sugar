package com.example.model.adapter;

/**
 * Created by francesco.lombardi on 07/10/16.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.R;
import com.example.model.rv_row.SingleBookRow;

import java.util.List;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.ViewHolder> {

        private final TypedValue mTypedValue = new TypedValue();
        private int mBackground;
        private List<SingleBookRow> mValues;
        private Context mContext;

        public BookListAdapter(Context context, List<SingleBookRow> items) {
                context.getTheme().resolveAttribute(R.attr.selectableItemBackground, mTypedValue, true);
                mBackground = mTypedValue.resourceId;
                mValues = items;
                mContext = context;
        }

        public SingleBookRow getValueAt(int position) {
                return mValues.get(position);
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_book, parent, false);
                view.setBackgroundResource(mBackground);
                return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

        }


        @Override
        public int getItemCount() {
                return mValues.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            public final View mView;
            public final TextView mTitle;
            public final TextView mEdition;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                mTitle = (TextView) view.findViewById(R.id.title);
                mEdition = (TextView) view.findViewById(R.id.edition);
            }

        }


}
