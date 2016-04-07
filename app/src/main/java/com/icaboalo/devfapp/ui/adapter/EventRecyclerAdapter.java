package com.icaboalo.devfapp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.icaboalo.devfapp.R;
import com.icaboalo.devfapp.io.model.EventApiModel;

import java.util.ArrayList;

/**
 * Created by icaboalo on 6/04/16.
 */
public class EventRecyclerAdapter extends RecyclerView.Adapter<EventRecyclerAdapter.EventViewHolder> {

    Context mContext;
    LayoutInflater mInflater;
    ArrayList<EventApiModel> mEventList;


    public EventRecyclerAdapter(Context context, ArrayList<EventApiModel> eventList) {
        mContext = context;
        mEventList = eventList;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_event_list, parent, false);
        EventViewHolder nViewHolder = new EventViewHolder(view, R.id.title_text, R.id.link_text, R.id.place_text, R.id.date_text, R.id.skill_list);
        return nViewHolder;
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        EventApiModel event = mEventList.get(position);
        holder.setTitle(event.getEventTitle());
        holder.setLink(event.getEventLink());
        holder.setPlace(event.getEventPlace());
        holder.setDate(event.getEventDate());

        SkillRecyclerAdapter nSkillRecyclerAdapter = new SkillRecyclerAdapter(mContext, event.getSkillList());
        CustomLinearLayoutManager nCustomLinearLayoutManager = new CustomLinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        holder.setSkillRecycler(nSkillRecyclerAdapter, nCustomLinearLayoutManager);
    }

    @Override
    public int getItemCount() {
        return mEventList.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder{

        TextView mTitle, mLink, mPlace, mDate;
        RecyclerView mSkillRecycler;

        public EventViewHolder(View itemView, int eventTitleId, int eventLinkId, int eventPlaceId, int eventDateId, int skillListId) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(eventTitleId);
            mLink = (TextView) itemView.findViewById(eventLinkId);
            mPlace = (TextView) itemView.findViewById(eventPlaceId);
            mDate = (TextView) itemView.findViewById(eventDateId);
            mSkillRecycler = (RecyclerView) itemView.findViewById(skillListId);
        }

        public void setTitle(String title) {
            mTitle.setText(title);
        }

        public void setLink(String link) {
            mLink.setText(link);
        }

        public void setPlace(String place) {
            mPlace.setText(place);
        }

        public void setDate(String date) {
            mDate.setText(date);
        }

        public void setSkillRecycler(SkillRecyclerAdapter skillRecyclerAdapter, RecyclerView.LayoutManager skillLayoutManager) {
            mSkillRecycler.setAdapter(skillRecyclerAdapter);
            mSkillRecycler.setLayoutManager(skillLayoutManager);
        }
    }
}
