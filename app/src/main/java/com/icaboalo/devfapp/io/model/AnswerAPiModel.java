package com.icaboalo.devfapp.io.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by icaboalo on 5/04/16.
 */
public class AnswerAPiModel {

    public AnswerAPiModel(String answerLink, Date answerDate, int challengeId, int myUserId) {
        mAnswerLink = answerLink;
        mAnswerDate = answerDate;
        mChallengeId = challengeId;
        mMyUserId = myUserId;
    }

    @SerializedName("id")
    int mAnswerId;

    @SerializedName("file_link")
    String mAnswerLink;

    @SerializedName("date_added")
    Date mAnswerDate;

    @SerializedName("challenge")
    ChallengeApiModel mChallenge;

    @SerializedName("challenge_id")
    int mChallengeId;

    @SerializedName("my_user_id")
    int mMyUserId;

    public int getAnswerId() {
        return mAnswerId;
    }

    public String getAnswerLink() {
        return mAnswerLink;
    }

    public Date getAnswerDate() {
        return mAnswerDate;
    }

    public ChallengeApiModel getChallenge() {
        return mChallenge;
    }
}
