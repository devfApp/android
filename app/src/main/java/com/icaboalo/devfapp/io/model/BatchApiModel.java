package com.icaboalo.devfapp.io.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by icaboalo on 5/04/16.
 */
public class BatchApiModel {

//    Constructor for creating batch
    public BatchApiModel(String batchName) {
        mBatchName = batchName;
    }

    @SerializedName("id")
    int mBatchId;

    @SerializedName("batch")
    String mBatchName;

    @SerializedName("my_users")
    ArrayList<MyUserApiModel> mMyUserList;

    public int getBatchId() {
        return mBatchId;
    }

    public String getBatchName() {
        return mBatchName;
    }

    public ArrayList<MyUserApiModel> getMyUserList() {
        return mMyUserList;
    }
}
