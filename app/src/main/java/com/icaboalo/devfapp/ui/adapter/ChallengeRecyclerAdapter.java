package com.icaboalo.devfapp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.icaboalo.devfapp.R;
import com.icaboalo.devfapp.io.model.ChallengeApiModel;

import java.util.ArrayList;

/**
 * Created by icaboalo on 6/04/16.
 */
public class ChallengeRecyclerAdapter extends RecyclerView.Adapter<ChallengeRecyclerAdapter.ChallengeViewHolder> {

    Context mContext;
    ArrayList<ChallengeApiModel> mChallengeList;
    LayoutInflater mInflater;

    public ChallengeRecyclerAdapter(Context context, ArrayList<ChallengeApiModel> challengeList) {
        mContext = context;
        mChallengeList = challengeList;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public ChallengeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_challenge_list, parent, false);
        ChallengeViewHolder viewHolder = new ChallengeViewHolder(view, R.id.title_text, R.id.link_text, R.id.batch_text, R.id.date_text);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ChallengeViewHolder holder, int position) {
        ChallengeApiModel challenge = mChallengeList.get(position);
        holder.setTitle(challenge.getChallengeTitle());
        holder.setDate(challenge.getChallengeDate());
        holder.setLink(challenge.getChallengeDemoLink());
        holder.setBatch(challenge.getBatch().getBatchName());
    }

    @Override
    public int getItemCount() {
        return mChallengeList.size();
    }


    class ChallengeViewHolder extends RecyclerView.ViewHolder{

        TextView mTitle, mLink, mBatch, mDate;

        public ChallengeViewHolder(View itemView, int challengeTitleId, int challengelinkId, int challengeBatchId, int challengeDateId) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(challengeTitleId);
            mLink = (TextView) itemView.findViewById(challengelinkId);
            mBatch = (TextView) itemView.findViewById(challengeBatchId);
            mDate = (TextView) itemView.findViewById(challengeDateId);
        }

        public void setTitle(String title) {
            mTitle.setText(title);
        }

        public void setLink(String link) {
            mLink.setText(link);
        }

        public void setBatch(String batch) {
            mBatch.setText(batch);
        }

        public void setDate(String date) {
            mDate.setText(date);
        }
    }
}
