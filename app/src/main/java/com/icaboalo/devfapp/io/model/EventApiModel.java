package com.icaboalo.devfapp.io.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by icaboalo on 5/04/16.
 */
public class EventApiModel {

    public EventApiModel(String eventTitle, String eventDescription, String eventPlace, Date eventDate, String eventLink, int addedBy, ArrayList<SkillApiModel> skillList) {
        mEventTitle = eventTitle;
        mEventDescription = eventDescription;
        mEventPlace = eventPlace;
        mEventDate = eventDate;
        mEventLink = eventLink;
        mAddedById = addedBy;
        mSkillList = skillList;
    }

    @SerializedName("id")
    int mEventId;

    @SerializedName("title")
    String mEventTitle;

    @SerializedName("description")
    String mEventDescription;

    @SerializedName("place")
    String mEventPlace;

    @SerializedName("event_date")
    Date mEventDate;

    @SerializedName("event_link")
    String mEventLink;

    @SerializedName("added_by")
    MyUserApiModel mMyUser;

    @SerializedName("added_by_id")
    int mAddedById;

    @SerializedName("skill")
    ArrayList<SkillApiModel> mSkillList;

    public int getEventId() {
        return mEventId;
    }

    public String getEventTitle() {
        return mEventTitle;
    }

    public String getEventDescription() {
        return mEventDescription;
    }

    public String getEventPlace() {
        return mEventPlace;
    }

    public Date getEventDate() {
        return mEventDate;
    }

    public String getEventLink() {
        return mEventLink;
    }

    public MyUserApiModel getMyUser() {
        return mMyUser;
    }

    public ArrayList<SkillApiModel> getSkillList() {
        return mSkillList;
    }
}
