package edu.whut.cs.chende.util;

import edu.whut.cs.chende.dao.Zhou256Mapper;
import edu.whut.cs.chende.entity.Zhou256;
import edu.whut.cs.chende.entity.Zhou256Example;
import edu.whut.cs.chende.service.TestService;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class TaskThread implements Runnable {
    String url = "http://mt.wtulip.com/student/api/get-all-reports";
    //    String task = "set每周心得"; 课前心得
    String task="set课前心得";
    int taskType	=1;  //课后作业=2   每周心得=4  课前预习 =1
    Zhou256Mapper zhou256Mapper;
    int start;
    int limit;

    public TaskThread(Zhou256Mapper zhou256Mapper, int start, int limit) {
        this.zhou256Mapper = zhou256Mapper;
        this.start = start;
        this.limit = limit;
     //   System.out.println("新建线程处理"+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("新建线程处理"+Thread.currentThread().getName());
        func(start,limit);
    }


    /**
     *
     * 需要修改获取数据的http请求的 taskType
     * 分数字段 score以及 experienceScore 区分
     * @param start
     * @param limit
     */
    public void func(int start, int limit) {

        JSONObject jsonObjectTemp = new JSONObject();
        JSONObject[] jsonArrayTemp = new JSONObject[1];
        JSONArray jsonResultArrayTemp = null;
        String StringTemp;
        OkHttpClient client = new OkHttpClient();
        JSONObject jsonObjectRequest = new JSONObject();
        try {
            jsonObjectRequest.put("limit", limit);
            jsonObjectRequest.put("offset", start);
            jsonObjectRequest.put("taskType", taskType);
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
                StringTemp = response.body().string();
                jsonObjectTemp = new JSONObject(StringTemp);
                JSONArray rows = jsonObjectTemp.getJSONArray("rows");
                JSONObject j;
                for (int i = 0; i < rows.length(); i++) {
                    //获取每一个JsonObject对象
                    j = rows.getJSONObject(i);
                    Integer week = j.getInt("week");
                    String stuId = j.getString("stuId");
                    String name = j.getString("name");
                    String stu_class = j.getString("class");
                    String groupId = j.getString("groupId");
                    //      int score = j.getInt("score");
                    int score = j.getInt("experienceScore");
                    // System.out.println(name + " " + stuId + " " + stu_class + groupId + " at week" + week + "get score" + score);
               //     System.out.println(name + " " + stuId + " " + stu_class + groupId + " at week" + week + "get experienceScore" + score);
                    Zhou256Example example = new Zhou256Example();
                    Zhou256Example.Criteria criteria = example.createCriteria();
                    criteria.and姓名EqualTo(name);
                    criteria.and学号EqualTo(stuId);

                    Zhou256 record = new Zhou256();
                    record.set专业班级(stu_class);
                    try {
                        record.getClass().getMethod(task + week, String.class).invoke(record, score + "");
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
         //           System.out.println("线程开始更新数据");
                   if (zhou256Mapper.updateByExampleSelective(record, example)!=0)
                       System.out.println("更新数据成功");;
                       System.out.println(name + " " + stuId + " " + stu_class + groupId + " at week" + week + "get experienceScore" + score);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
