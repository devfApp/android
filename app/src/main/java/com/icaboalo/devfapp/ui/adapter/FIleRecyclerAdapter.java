package com.icaboalo.devfapp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.icaboalo.devfapp.R;
import com.icaboalo.devfapp.io.model.SharedFileApiModel;

import java.util.ArrayList;

/**
 * Created by icaboalo on 6/04/16.
 */
public class FIleRecyclerAdapter extends RecyclerView.Adapter<FIleRecyclerAdapter.FileViewHolder> {

    Context mContext;
    LayoutInflater mInflater;
    ArrayList<SharedFileApiModel> mFileList;
    LinearLayoutManager mLinearLayoutManager;
    RecyclerView.Adapter mSkillRecyclerAdapter;

    public FIleRecyclerAdapter(Context context, ArrayList<SharedFileApiModel> fileList, RecyclerView.Adapter skillRecyclerAdapter, LinearLayoutManager linearLayoutManager) {
        mContext = context;
        mFileList = fileList;
        mSkillRecyclerAdapter = skillRecyclerAdapter;
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
        holder.setSkillRecycler(mSkillRecyclerAdapter, mLinearLayoutManager);
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

        public void setSkillRecycler(RecyclerView.Adapter skillRecyclerAdapter, LinearLayoutManager linearLayoutManager) {
            mSkillRecycler.setAdapter(skillRecyclerAdapter);
            mSkillRecycler.setLayoutManager(linearLayoutManager);
        }
    }
}
