package com.icaboalo.devfapp.io.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by icaboalo on 5/04/16.
 */
public class MyUserApiModel {

//    Constructor for register
    public MyUserApiModel(String myUserFirstName, String myUserLastName, String myUserUsername, String myUserPassword, String myUserEmail) {
        mMyUserFirstName = myUserFirstName;
        mMyUserLastName = myUserLastName;
        mMyUserUsername = myUserUsername;
        mMyUserPassword = myUserPassword;
        mMyUserEmail = myUserEmail;
    }

    public MyUserApiModel(String myUserFirstName, String myUserLastName, String myUserUsername, String myUserPassword, String myUserEmail, String myUserProfilePic, String myUserPhoneNumber, String myUserJob, String myUserDescription, String myUserType) {
        mMyUserFirstName = myUserFirstName;
        mMyUserLastName = myUserLastName;
        mMyUserUsername = myUserUsername;
        mMyUserPassword = myUserPassword;
        mMyUserEmail = myUserEmail;
        mMyUserProfilePic = myUserProfilePic;
        mMyUserPhoneNumber = myUserPhoneNumber;
        mMyUserJob = myUserJob;
        mMyUserDescription = myUserDescription;
        mMyUserType = myUserType;
    }

    @SerializedName("id")
    int mMyUserId;

    @SerializedName("first_name")
    String mMyUserFirstName;

    @SerializedName("last_name")
    String mMyUserLastName;

    @SerializedName("username")
    String mMyUserUsername;

    @SerializedName("password")
    String mMyUserPassword;

    @SerializedName("email")
    String mMyUserEmail;

    @SerializedName("profile_pic")
    String mMyUserProfilePic;

    @SerializedName("phone_number")
    String mMyUserPhoneNumber;

    @SerializedName("job")
    String mMyUserJob;

    @SerializedName("description")
    String mMyUserDescription;

    @SerializedName("user_type")
    String mMyUserType;

    @SerializedName("skill")
    ArrayList<SkillApiModel> mSkillList;

    @SerializedName("batch")
    ArrayList<BatchApiModel> mBatchList;

    @SerializedName("cinta")
    ArrayList<CintaApiModel> mCintaList;

    public int getMyUserId() {
        return mMyUserId;
    }

    public String getMyUserFirstName() {
        return mMyUserFirstName;
    }

    public String getMyUserLastName() {
        return mMyUserLastName;
    }

    public String getMyUserUsername() {
        return mMyUserUsername;
    }

    public String getMyUserPassword() {
        return mMyUserPassword;
    }

    public String getMyUserEmail() {
        return mMyUserEmail;
    }

    public String getMyUserProfilePic() {
        return mMyUserProfilePic;
    }

    public String getMyUserPhoneNumber() {
        return mMyUserPhoneNumber;
    }

    public String getMyUserJob() {
        return mMyUserJob;
    }

    public String getMyUserDescription() {
        return mMyUserDescription;
    }

    public String getMyUserType() {
        return mMyUserType;
    }
}
