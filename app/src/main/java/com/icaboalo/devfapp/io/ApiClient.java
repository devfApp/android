package com.icaboalo.devfapp.io;

import com.icaboalo.devfapp.io.constant.Endpoints;
import com.icaboalo.devfapp.io.model.MyUserApiModel;
import com.icaboalo.devfapp.io.model.SharedFileApiModel;
import com.icaboalo.devfapp.io.model.SkillApiModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by icaboalo on 5/04/16.
 */
public class ApiClient {

    public static ApiService mApiService;
    public static ApiService getApiService(){
        if (mApiService == null){
            Retrofit nRetrofit = new Retrofit.Builder()
                    .baseUrl(Endpoints.ENDPOINT)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            mApiService = nRetrofit.create(ApiService.class);
        }
        return mApiService;
    }

    /*---------USER---------*/
//    @POST REGISTER A NEW USER
    public static void createMyUser(MyUserApiModel myUser, Callback<MyUserApiModel> myUserApiResponse){
        getApiService().createMyUser(myUser, myUserApiResponse);
    }

//    @GET LIST OF USERS
    public static void getMyUserList(String token, Callback<ArrayList<MyUserApiModel>> myUserApiResponse){
        getApiService().getMyUserList(token, myUserApiResponse);
    }

//    @GET SINGLE USER
    public static void getMyUser(String token, String userId, Callback<MyUserApiModel> myUserApiResponse){
        getApiService().getMyUser(token, userId, myUserApiResponse);
    }


    /*---------SKILL---------*/
//    @POST CREATE NEW SKILL
    public static void createSkill(String token, SkillApiModel skill, Callback<SkillApiModel> skillApiResponse){
        getApiService().createSkill(token, skill, skillApiResponse);
    }

//    @GET LIST OF SKILLS
    public static void getSkillList(String token, Callback<ArrayList<SkillApiModel>> skillApiResponse){
        getApiService().getSkillList(token, skillApiResponse);
    }

//    @GET SINGLE SKILL
    public static void getSkill(String token, String skillId, Callback<SkillApiModel> skillApiResponse){
        getApiService().getSkill(token, skillId, skillApiResponse);
    }


    /*---------FILE---------*/
//    @GET LIST OF FILES
    public static void getFileList(String token){
        getApiService().getFileList(token);
    }


}
