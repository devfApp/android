package com.icaboalo.devfapp.io;

import com.icaboalo.devfapp.io.constant.Endpoints;
import com.icaboalo.devfapp.io.model.AnswerAPiModel;
import com.icaboalo.devfapp.io.model.BatchApiModel;
import com.icaboalo.devfapp.io.model.ChallengeApiModel;
import com.icaboalo.devfapp.io.model.CintaApiModel;
import com.icaboalo.devfapp.io.model.EventApiModel;
import com.icaboalo.devfapp.io.model.MyUserApiModel;
import com.icaboalo.devfapp.io.model.SharedFileApiModel;
import com.icaboalo.devfapp.io.model.SkillApiModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by icaboalo on 5/04/16.
 */
public interface ApiService {

//    USER
    @POST(Endpoints.PATH_TOKEN)
    Callback<MyUserApiModel> mUser();

    @POST(Endpoints.PATH_USER)
    void createMyUser(@Body MyUserApiModel myUser, Callback<MyUserApiModel> myUserApiResponse);

    @GET(Endpoints.PATH_USER + Endpoints.PATH_MY)
    void getMyUserList(@Header("Authorization") String token, Callback<ArrayList<MyUserApiModel>> myUserApiResponse);

    @GET(Endpoints.PATH_USER + Endpoints.PATH_MY + Endpoints.PATH_ID)
    void getMyUser(@Header("Authorization") String token, @Path("id") String userId, Callback<MyUserApiModel> myUserApiResponse);

    @PUT(Endpoints.PATH_USER + Endpoints.PATH_MY + Endpoints.PATH_ID)
    void updateMyUser(@Header("Authorization") String token);


//    SKILL
    @POST(Endpoints.PATH_SKILL)
    void createSkill(@Header("Authorization") String token, @Body SkillApiModel skill, Callback<SkillApiModel> skillApiResponse);

    @GET(Endpoints.PATH_SKILL)
    void getSkillList(@Header("Authorization") String token, Callback<ArrayList<SkillApiModel>> skillApiResponse);

    @GET(Endpoints.PATH_SKILL + Endpoints.PATH_ID)
    void getSkill(@Header("Authorization") String token, @Path("id") String skillId, Callback<SkillApiModel> skillApiResponse);


//  FILE
    @POST(Endpoints.PATH_FILE)
    void createFile(@Header("Authorization") String token, @Body SharedFileApiModel file, Callback<SharedFileApiModel> fileApiResponse);

    @GET(Endpoints.PATH_FILE)
    Call<ArrayList<SharedFileApiModel>> getFileList(@Header("Authorization") String token);

    @GET(Endpoints.PATH_FILE + Endpoints.PATH_ID)
    void getFile(@Header("Authorization") String token, @Path("id") String fileId, Callback<SharedFileApiModel> fileApiResponse);

    @PUT(Endpoints.PATH_FILE + Endpoints.PATH_ID)
    void updateFile(@Header("Authorization") String token);


//    EVENT
    @POST(Endpoints.PATH_EVENT)
    void createEvent(@Header("Authorization") String token, @Body EventApiModel file, Callback<EventApiModel> eventApiResponse);

    @GET(Endpoints.PATH_EVENT)
    Call<ArrayList<EventApiModel>> getEventList(@Header("Authorization") String token);

    @GET(Endpoints.PATH_EVENT + Endpoints.PATH_ID)
    void getEvent(@Header("Authorization") String token, @Path("id") String eventId, Callback<EventApiModel> eventApiResponse);

    @PUT(Endpoints.PATH_EVENT + Endpoints.PATH_ID)
    void updateEvent(@Header("Authorization") String token);


//    BATCH
    @GET(Endpoints.PATH_BATCH)
    void getBatchList(@Header("Authorization") String token, Callback<ArrayList<BatchApiModel>> batchApiResponse);

    @GET(Endpoints.PATH_BATCH + Endpoints.PATH_ID)
    void getBatch(@Header("Authorization") String token, @Path("id") String id, Callback<BatchApiModel> batchApiResponse);

    @PUT(Endpoints.PATH_BATCH + Endpoints.PATH_ID)
    void updateBatch(@Header("Authorization") String token);


//  CHALLENGE
    @POST(Endpoints.PATH_CHALLENGE)
    void createChallenge(@Header("Authorization") String token, @Body ChallengeApiModel challenge, Callback<ChallengeApiModel> challengeApiResponse);

    @GET(Endpoints.PATH_CHALLENGE)
    void getChallengeList(@Header("Authorization") String token, Callback<ArrayList<ChallengeApiModel>> challengeApiResponse);

    @GET(Endpoints.PATH_CHALLENGE + Endpoints.PATH_ID)
    void getChallenge(@Header("Authorization") String token, @Path("id") String id, Callback<ChallengeApiModel> challengeApiResponse);

    @PUT(Endpoints.PATH_CHALLENGE + Endpoints.PATH_ID)
    void updateChallenge(@Header("Authorization") String token);


//    CINTA
    @GET(Endpoints.PATH_CINTA)
    void getCintaList(@Header("Authorization") String token, Callback<ArrayList<CintaApiModel>> cintaApiResponse);

    @GET(Endpoints.PATH_CINTA + Endpoints.PATH_ID)
    void getCinta(@Header("Authorization") String token, @Path("id") String id, Callback<CintaApiModel> cintaApiResponse);

    @PUT(Endpoints.PATH_CINTA + Endpoints.PATH_ID)
    void updateCinta(@Header("Authorization") String token);


//    ANSWER
    @POST(Endpoints.PATH_ANSWER)
    void createAnswer(@Header("Authorization") String token, @Body AnswerAPiModel answer, Callback<AnswerAPiModel> answerApiResponse);

    @GET(Endpoints.PATH_ANSWER)
    void getAnswerList(@Header("Authorization") String token, Callback<ArrayList<AnswerAPiModel>> answerApiResponse);

    @GET(Endpoints.PATH_ANSWER + Endpoints.PATH_ID)
    void getAnswer(@Header("Authorization") String token, @Path("id") String id, Callback<AnswerAPiModel> answerApiResponse);

    @PUT(Endpoints.PATH_ANSWER + Endpoints.PATH_ID)
    void updateAnswer(@Header("Authorization") String token);
}
