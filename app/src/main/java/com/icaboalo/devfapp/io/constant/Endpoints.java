package com.icaboalo.devfapp.io.constant;

/**
 * Created by icaboalo on 4/04/16.
 */
public class Endpoints {
    public static final String BASE_URL = "https://devf-network.herokuapp.com/api";
    public static final String PATH_VERSION = "/v1";

//    USER PATHS
    //Path to register a new user
    public static final String PATH_USER = "/user";
    //Path to get users
    public static final String PATH_MY = "/my";
    //Path for to obtain user token
    public static final String PATH_TOKEN = "/api-token-auth";

//    SKILL PATHS
    //Path to get list of skills
    public static final String PATH_SKILL = "/skill";

//    FILE PATHS
    //Path to get files
    public static final String PATH_FILE = "/file";

//    EVENT PATHS
    //Path to get events
    public static final String PATH_EVENT = "/event";

//    BATCH PATHS
    //Path to get events
    public static final String PATH_BATCH = "/batch";

//    CHALLENGE PATHS
    //Path to get challenges
    public static final String PATH_CHALLENGE = "/challenge";

//    CINTA PATHS
    //Path to get cintas
    public static final String PATH_CINTA = "/cinta";

//    ANSWER PATHS
    //Path to get answers
    public static final String PATH_ANSWER = "/answer";

    //Path to get specific object
    public static final String PATH_ID = "/{id}";

    public static final String ENDPOINT = BASE_URL + PATH_VERSION;
}
