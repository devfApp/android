package com.icaboalo.devfapp.io.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by icaboalo on 5/04/16.
 */
public class CintaApiModel {

//    Constructor for creating new cinta
    public CintaApiModel(boolean cintaActive, String cintaName) {
        mCintaActive = cintaActive;
        mCintaName = cintaName;
    }

    @SerializedName("id")
    int mCintaId;

    @SerializedName("is_active")
    boolean mCintaActive;

    @SerializedName("name")
    String mCintaName;

    @SerializedName("my_users")
    ArrayList<MyUserApiModel> mMyUserList;

    public int getCintaId() {
        return mCintaId;
    }

    public boolean isCintaActive() {
        return mCintaActive;
    }

    public String getCintaName() {
        return mCintaName;
    }

    public ArrayList<MyUserApiModel> getMyUserList() {
        return mMyUserList;
    }
}
