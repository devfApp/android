package com.icaboalo.devfapp.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.icaboalo.devfapp.R;
import com.icaboalo.devfapp.io.ApiClient;
import com.icaboalo.devfapp.io.model.MyUserApiModel;
import com.icaboalo.devfapp.io.model.SharedFileApiModel;
import com.icaboalo.devfapp.io.model.SkillApiModel;
import com.icaboalo.devfapp.ui.adapter.FileRecyclerAdapter;
import com.icaboalo.devfapp.ui.adapter.SkillRecyclerAdapter;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by icaboalo on 6/04/16.
 */
public class FileListFragment extends Fragment {

    @Bind(R.id.file_list)
    RecyclerView mFileRecycler;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_file_list, container, false);
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
        setupRecycler(createFile());
    }

    ArrayList<SharedFileApiModel> createFile(){
        ArrayList<SharedFileApiModel> fileList = new ArrayList<>();
        fileList.add(new SharedFileApiModel("Android docs", "android documentation", "https://developer.android.com", 1, createSkill()));
        return fileList;
    }

    ArrayList<SkillApiModel> createSkill(){
        ArrayList<SkillApiModel> skillList = new ArrayList<>();
        skillList.add(new SkillApiModel("Android"));
        skillList.add(new SkillApiModel("Java"));
        return skillList;
    }

    void setupRecycler(ArrayList<SharedFileApiModel> fileList){
        LinearLayoutManager nLinearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        SkillRecyclerAdapter nSkillRecyclerAdapter = new SkillRecyclerAdapter(getActivity(), createSkill());
        LinearLayoutManager nLinearLayoutManager1 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        FileRecyclerAdapter nFileRecyclerAdapter = new FileRecyclerAdapter(getActivity(), fileList, nSkillRecyclerAdapter, nLinearLayoutManager1);
        mFileRecycler.setLayoutManager( nLinearLayoutManager);
        mFileRecycler.setAdapter(nFileRecyclerAdapter);
    }

    void getFileRetrofit(String token){
        ApiClient.getFileList(token, new Callback<ArrayList<SharedFileApiModel>>() {
            @Override
            public void onResponse(Call<ArrayList<SharedFileApiModel>> call, Response<ArrayList<SharedFileApiModel>> response) {
                if (response.isSuccessful()) {
                    ArrayList<SharedFileApiModel> nSharedFileList = response.body();
                    setupRecycler(nSharedFileList);
                    for (int i = 0; i < nSharedFileList.size(); i++) {
                        int fileId = nSharedFileList.get(i).getFileId();
                        String fileTitle = nSharedFileList.get(i).getFileTitle();
                        String fileDescription = nSharedFileList.get(i).getFileDescription();
                        String fileLink = nSharedFileList.get(i).getFileLink();
                        MyUserApiModel addedBy = nSharedFileList.get(i).getMyUser();
                        Log.d("FILELIST", fileId + "");
                        Log.d("FILELIST", fileTitle);
                        Log.d("FILELIST", fileDescription);
                        Log.d("FILELIST", fileLink);
                        ArrayList<SkillApiModel> skillList = nSharedFileList.get(i).getSkillList();
                        for (int o = 0; o < skillList.size(); o++) {
                            int skillId = skillList.get(o).getSkillId();
                            String skillName = skillList.get(i).getSkillName();
                            Log.d("SKILLLIST", skillId + "");
                            Log.d("SKILLLIST", skillName);
                        }
                    }
                } else {
                    int statusCode = response.code();

                    // handle request errors yourself
                    ResponseBody errorBody = response.errorBody();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<SharedFileApiModel>> call, Throwable t) {

            }
        });
    }
}
