package com.icaboalo.devfapp.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.icaboalo.devfapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by icaboalo on 6/04/16.
 */
public class EventListFragment extends Fragment {

    @Bind(R.id.recycler_view)
    RecyclerView mEventRecycler;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }


}
