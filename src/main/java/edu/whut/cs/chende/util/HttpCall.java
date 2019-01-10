package edu.whut.cs.chende.util;

import okhttp3.*;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Random;

//改为多线程 单线程太慢了！
public class HttpCall implements Runnable {
    static String url = "http://mt.wtulip.com/student/api/update-report-of-experienceScore";
    static String url2 = "http://mt.wtulip.com/student/api/update-report-of-score";
    //http://mt.wtulip.com/student/api/update-report-of-score
//分数没改，userId296 taskId3
//{"error":"db_update_fail"}

    public static void main(String[] args) {
        System.out.println(changeScore(296 , 3, 50));
    }

    public HttpCall() {
    }

    public HttpCall(int userId, int taskId) {
        this.taskId = taskId;
        this.userId = userId;
    }

    public HttpCall(int userId, int taskId, int score) {
        this.taskId = taskId;
        this.userId = userId;
        this.score = score;
    }

    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        changeScore(userId, taskId, getRandomScore());
    }

    public static int getRandomScore() {
        int max = 100;
        int min = 75;
        Random random = new Random();
        int s = random.nextInt(max) % (max - min + 1) + min;
        //System.out.println("random score :"+s);
        return s;
    }


    /**
     * 修改分数的参数
     *
     * @param userId
     * @param taskId
     * @return
     */
    public static String changeScore(int userId, int taskId, int score) {
        OkHttpClient client = new OkHttpClient();
        JSONObject jsonObjectRequest = new JSONObject();
        try {
            jsonObjectRequest.put("userId", userId);
            jsonObjectRequest.put("taskId", taskId);
            //experienceScore
            //    jsonObjectRequest.put("score", score);
            jsonObjectRequest.put("score", score);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(mediaType, jsonObjectRequest.toString());
        Request request = new Request.Builder()
                .url(url2)
                .post(body)
                .addHeader("authorization", "bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjIsImlzcyI6Imh0dHA6XC9cL210Lnd0dWxpcC5jb21cL3N0dWRlbnRcL2FwaVwvc2lnbi1pbi1vZi10ZWFjaGVyIiwiaWF0IjoxNTQ2ODU1MDY0LCJleHAiOjE1NDc0NTk4NjQsIm5iZiI6MTU0Njg1NTA2NCwianRpIjoiM2I0YjYwYjdmNzJlYTE1ZGM2NzRhNmMzMDdjNGM4ZGIifQ.aD-GVApsnwyiyM75w-JKFnx07GjxblDTo3kuwaTqhLs")
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "0fe448a8-2fa5-7764-a7f9-b6e9f53757a5")
                .build();

        Response response;
        String res = "";

        {
            try {
                response = client.newCall(request).execute();
                Thread.currentThread().sleep(100);
                System.out.println(response.body().string());
                //    res=response.body().string();
                //数据库有可能更新失败
//                if ("{\"error\":0}".equals(response.body().toString())){
//                    System.out.println("更新分数成功");
//                }
//                else {
//                    new Thread(new HttpCall(userId,taskId,score)).start();
//                }

            } catch (IOException e) {
                System.out.println("请求出问题，catch快 ");
                //  new Thread(new HttpCall(userId,taskId,score)).start();

                //   changeScore(userId,taskId,getRandomScore()); {"error":0}
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    int userId;
    int taskId;
    int score;
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
}
