package com.icaboalo.devfapp.io.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by icaboalo on 5/04/16.
 */
public class SkillApiModel {

//    Constructor to create new skill
    public SkillApiModel(String skillName) {
        mSkillName = skillName;
    }

    @SerializedName("id")
    int mSkillId;

    @SerializedName("skill")
    String mSkillName;

    @SerializedName("my_users")
    ArrayList<MyUserApiModel> mMyUserList;

    @SerializedName("events")
    ArrayList<EventApiModel> mEventList;

    @SerializedName("shared_files")
    ArrayList<SharedFileApiModel> mSharedFileList;

    public int getSkillId() {
        return mSkillId;
    }

    public String getSkillName() {
        return mSkillName;
    }

    public ArrayList<MyUserApiModel> getMyUserList() {
        return mMyUserList;
    }

    public ArrayList<EventApiModel> getEventList() {
        return mEventList;
    }

    public ArrayList<SharedFileApiModel> getSharedFileList() {
        return mSharedFileList;
    }
}
