package edu.whut.cs.chende.util;

import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
*  bug 分数没改，userId296 taskId3
{"error":"db_update_fail"} //todo
* */

public class GetReprot {


    static String url = "http://mt.wtulip.com/student/api/get-all-reports";
    static String auth = "";   //   eyJzdWIiOjIsImlzcyI6Imh0dHA6XC9cL210Lnd0dWxpcC5jb21cL3N0dWRlbnRcL2FwaVwvc2lnbi1pbi1vZi10ZWFjaGVyIiwiaWF0IjoxNTQ2ODQ2OTIxLCJleHAiOjE1NDc0NTE3MjEsIm5iZiI6MTU0Njg0NjkyMSwianRpIjoiNmMwZTZhMjJkZGM0OGQyNTFiMjk3NTc5YzhiZTY5NzQifQ

    public static void main(String[] args) {
        getDataAndChangeScore(0, 35, 100);

    }

    //
    public static void getDataAndChangeScore(int start, int totalPage, int pageSize) {
        int offset = start;
        for (int i = 0; i < totalPage; i++) {
            func(offset, pageSize);
            offset = offset + pageSize;
        }
    }

    public static void func(int start, int limit) {
        //  ThreadPoolExecutor.execute(Runnable command)
        ThreadPoolExecutor executor = new ThreadPoolExecutor(50, 100, 500, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(25));
        JSONObject jsonObjectTemp = new JSONObject();
        JSONObject[] jsonArrayTemp = new JSONObject[1];
        JSONArray jsonResultArrayTemp = null;
        String StringTemp;
        OkHttpClient client = new OkHttpClient();
        JSONObject jsonObjectRequest = new JSONObject();
        try {
            jsonObjectRequest.put("limit", limit);
            jsonObjectRequest.put("offset", start);
            jsonObjectRequest.put("taskType", 4);
            jsonObjectRequest.put("search", "");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(mediaType, jsonObjectRequest.toString());
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("authorization", "bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjIsImlzcyI6Imh0dHA6XC9cL210Lnd0dWxpcC5jb21cL3N0dWRlbnRcL2FwaVwvc2lnbi1pbi1vZi10ZWFjaGVyIiwiaWF0IjoxNTQ2ODU1MDY0LCJleHAiOjE1NDc0NTk4NjQsIm5iZiI6MTU0Njg1NTA2NCwianRpIjoiM2I0YjYwYjdmNzJlYTE1ZGM2NzRhNmMzMDdjNGM4ZGIifQ.aD-GVApsnwyiyM75w-JKFnx07GjxblDTo3kuwaTqhLs")
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "0fe448a8-2fa5-7764-a7f9-b6e9f53757a5")
                .build();
        Response response;
        {
            try {
                response = client.newCall(request).execute();
                //   System.out.println(response.body().string());
                StringTemp = response.body().string();
                jsonObjectTemp = new JSONObject(StringTemp);
                JSONArray rows = jsonObjectTemp.getJSONArray("rows");
                JSONObject myjObject;
                for (int i = 0; i < rows.length(); i++) {
                    //获取每一个JsonObject对象
                    myjObject = rows.getJSONObject(i);
                    //获取每一个对象中的值 taskId
                    int userId = myjObject.getInt("userId");
                    int taskId = myjObject.getInt("taskId");
                    //       int experienceScore = myjObject.getInt("experienceScore");//experienceScore
                    //      String exp=myjObject.getString("experience");
                   // System.out.println("userId:" + userId + "   taskId:" + taskId);
                //    System.out.println("myobject:" + myjObject.toString());
                    int score = 0;
                    score = HttpCall.getRandomScore();
            //        System.out.println(HttpCall.changeScore(userId, taskId, score));
                    //多线程
                    //   executor.execute(new HttpCall(userId,taskId));
                    //单线程
                    if (myjObject.isNull("score")) {
                        //检查空值
                        System.out.println("分数没改，userId"+userId+" taskId"+taskId);
                        System.out.println(HttpCall.changeScore(userId, taskId, score));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}

