package com.icaboalo.devfapp.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.icaboalo.devfapp.R;
import com.icaboalo.devfapp.io.ApiClient;
import com.icaboalo.devfapp.io.model.EventApiModel;
import com.icaboalo.devfapp.ui.adapter.EventRecyclerAdapter;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        retrofit("Token eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE0NTkzODg4MDIsInVzZXJuYW1lIjoiaWNhYm9hbG8iLCJ1c2VyX2lkIjoxLCJlbWFpbCI6ImljYWJvYWxvQGdtYWlsLmNvbSJ9.Ewkl8opcwiWJATGqNFVRboPmoCT0ZEylyQP904T-Vnw");
    }

    void setupEventRecycler(ArrayList<EventApiModel> eventList){
        EventRecyclerAdapter nEventRecyclerAdapter = new EventRecyclerAdapter(getActivity(), eventList);
        LinearLayoutManager nLinearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mEventRecycler.setAdapter(nEventRecyclerAdapter);
        mEventRecycler.setLayoutManager(nLinearLayoutManager);
    }

    void retrofit(String token){
        Call<ArrayList<EventApiModel>> call = ApiClient.getApiService().getEventList(token);
        call.enqueue(new Callback<ArrayList<EventApiModel>>() {
            @Override
            public void onResponse(Call<ArrayList<EventApiModel>> call, Response<ArrayList<EventApiModel>> response) {
                if (response.isSuccessful()){
                    ArrayList<EventApiModel> eventList = response.body();
                    setupEventRecycler(eventList);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<EventApiModel>> call, Throwable t) {

            }
        });
    }
}
