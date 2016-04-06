package com.icaboalo.devfapp.io.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by icaboalo on 5/04/16.
 */
public class ChallengeApiModel {

//    Constructor for creating a new challenge
    public ChallengeApiModel(String challengeTitle, String challengeDescription, String challengeDemoLink, Date challengeDate, int senseiId, int batchId, ArrayList<AnswerAPiModel> answerList) {
        mChallengeTitle = challengeTitle;
        mChallengeDescription = challengeDescription;
        mChallengeDemoLink = challengeDemoLink;
        mChallengeDate = challengeDate;
        mSenseiId = senseiId;
        mBatchId = batchId;
        mAnswerList = answerList;
    }

    @SerializedName("id")
    int mChallengeId;

    @SerializedName("title")
    String mChallengeTitle;

    @SerializedName("description")
    String mChallengeDescription;

    @SerializedName("demo_link")
    String mChallengeDemoLink;

    @SerializedName("date")
    Date mChallengeDate;

    @SerializedName("sensei")
    MyUserApiModel mSensei;

    @SerializedName("sensei_id")
    int mSenseiId;

    @SerializedName("batch")
    BatchApiModel mBatch;

    @SerializedName("batch_id")
    int mBatchId;

    @SerializedName("answers")
    ArrayList<AnswerAPiModel> mAnswerList;

    public int getChallengeId() {
        return mChallengeId;
    }

    public String getChallengeTitle() {
        return mChallengeTitle;
    }

    public String getChallengeDescription() {
        return mChallengeDescription;
    }

    public String getChallengeDemoLink() {
        return mChallengeDemoLink;
    }

    public Date getChallengeDate() {
        return mChallengeDate;
    }

    public MyUserApiModel getSensei() {
        return mSensei;
    }

    public BatchApiModel getBatch() {
        return mBatch;
    }

    public ArrayList<AnswerAPiModel> getAnswerList() {
        return mAnswerList;
    }
}
