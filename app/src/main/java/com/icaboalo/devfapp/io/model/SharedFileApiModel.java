package com.icaboalo.devfapp.io.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by icaboalo on 5/04/16.
 */
public class SharedFileApiModel {

//    Constructor for creating new file
    public SharedFileApiModel(String fileTitle, String fileDescription, String fileLink, int addedById, ArrayList<SkillApiModel> skillList) {
        mFileTitle = fileTitle;
        mFileDescription = fileDescription;
        mFileLink = fileLink;
        mAddedById = addedById;
        mSkillList = skillList;
    }

    @SerializedName("id")
    int mFileId;

    @SerializedName("title")
    String mFileTitle;

    @SerializedName("description")
    String mFileDescription;

    @SerializedName("file_link")
    String mFileLink;

    @SerializedName("added_by")
    MyUserApiModel mMyUser;

    @SerializedName("added_by_id")
    int mAddedById;

    @SerializedName("skill")
    ArrayList<SkillApiModel> mSkillList;

    public int getFileId() {
        return mFileId;
    }

    public String getFileTitle() {
        return mFileTitle;
    }

    public String getFileDescription() {
        return mFileDescription;
    }

    public String getFileLink() {
        return mFileLink;
    }

    public MyUserApiModel getMyUser() {
        return mMyUser;
    }

    public ArrayList<SkillApiModel> getSkillList() {
        return mSkillList;
    }
}
