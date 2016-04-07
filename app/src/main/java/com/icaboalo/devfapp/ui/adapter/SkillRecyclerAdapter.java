package com.icaboalo.devfapp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.icaboalo.devfapp.R;
import com.icaboalo.devfapp.io.model.SkillApiModel;

import java.util.ArrayList;

/**
 * Created by icaboalo on 6/04/16.
 */
public class SkillRecyclerAdapter extends RecyclerView.Adapter<SkillRecyclerAdapter.SkillViewHolder> {

    ArrayList<SkillApiModel> mSkillList;
    Context mContext;
    LayoutInflater mInflater;

    public SkillRecyclerAdapter(Context context, ArrayList<SkillApiModel> skillList) {
        mSkillList = skillList;
        mContext = context;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public SkillViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_file_skill_list, parent, false);
        SkillViewHolder nViewHolder = new SkillViewHolder(view, R.id.skill_text);
        return nViewHolder;
    }

    @Override
    public void onBindViewHolder(SkillViewHolder holder, int position) {
        SkillApiModel skill = mSkillList.get(position);
        holder.setSkillText(skill.getSkillName());
    }

    @Override
    public int getItemCount() {
        return mSkillList.size();
    }

    class SkillViewHolder extends RecyclerView.ViewHolder{

        TextView mSkillText;

        public SkillViewHolder(View itemView, int skillTextId) {
            super(itemView);
            mSkillText = (TextView) itemView.findViewById(skillTextId);
        }

        public void setSkillText(String skillText) {
            mSkillText.setText(skillText);
        }
    }
}
