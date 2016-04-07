package com.icaboalo.devfapp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.icaboalo.devfapp.R;
import com.icaboalo.devfapp.io.model.SharedFileApiModel;
import com.icaboalo.devfapp.io.model.SkillApiModel;

import java.util.ArrayList;

/**
 * Created by icaboalo on 6/04/16.
 */
public class FileRecyclerAdapter extends RecyclerView.Adapter<FileRecyclerAdapter.FileViewHolder> {

    Context mContext;
    LayoutInflater mInflater;
    ArrayList<SharedFileApiModel> mFileList;
    GridLayoutManager mGridLayoutManager;
    SkillRecyclerAdapter mSkillRecyclerAdapter;


    public FileRecyclerAdapter(Context context, ArrayList<SharedFileApiModel> fileList) {
        mContext = context;
        mFileList = fileList;
        mGridLayoutManager = new GridLayoutManager(context, 5);
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public FileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_file_list, parent, false);
        FileViewHolder nViewHolder = new FileViewHolder(view, R.id.title_text, R.id.link_text, R.id.skill_list);
        return nViewHolder;
    }

    @Override
    public void onBindViewHolder(FileViewHolder holder, int position) {
        SharedFileApiModel file = mFileList.get(position);
        holder.setTitle(file.getFileTitle());
        holder.setLink(file.getFileLink());


        LayoutManager layoutManager = new CustomLinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        mSkillRecyclerAdapter = new SkillRecyclerAdapter(mContext, file.getSkillList());
        holder.setSkillRecycler(mSkillRecyclerAdapter, layoutManager);
    }

    @Override
    public int getItemCount() {
        return mFileList.size();
    }

    class FileViewHolder extends RecyclerView.ViewHolder{

        TextView mTitle, mLink;
        RecyclerView mSkillRecycler;

        public FileViewHolder(View itemView, int titleTextId, int linkTextId, int skillRecyclerId) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(titleTextId);
            mLink = (TextView) itemView.findViewById(linkTextId);
            mSkillRecycler = (RecyclerView) itemView.findViewById(skillRecyclerId);
        }

        public void setTitle(String title) {
            mTitle.setText(title);
        }

        public void setLink(String link) {
            mLink.setText(link);
        }

        public void setSkillRecycler(SkillRecyclerAdapter skillRecyclerAdapter, LayoutManager skillLayoutManager) {
            mSkillRecycler.setAdapter(skillRecyclerAdapter);
            mSkillRecycler.setLayoutManager(skillLayoutManager);
        }
    }
}
