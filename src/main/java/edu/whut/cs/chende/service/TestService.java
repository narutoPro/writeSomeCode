package edu.whut.cs.chende.service;


import edu.whut.cs.chende.dao.Zhou256Mapper;
import edu.whut.cs.chende.entity.Zhou256;
import edu.whut.cs.chende.entity.Zhou256Example;
import edu.whut.cs.chende.util.*;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Service
public class TestService {
    String url = "http://mt.wtulip.com/student/api/get-all-reports";
//    String task = "set每周心得"; 课前心得
    String task="set课前心得";
    int taskType	=1;  //课后作业=2   每周心得=4  课前预习 =1
//还需要设置 总的页数
    @Autowired
    Zhou256Mapper zhou256Mapper;
    private LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();

    private QunarThreadPoolExecutor qunarThreadPoolExecutor = new QunarThreadPoolExecutor(10, 15, 500, TimeUnit.MILLISECONDS, queue);

    public static void main(String[] args) {
        new TestService().getDataAndChangeScore3(0,49,100);
    }
    public void getDataAndChangeScore3(int start, int totalPage, int pageSize) {
        int offset = start;
        for (int i = 0; i < totalPage; i++) {
            //  new Thread(new TaskThread(zhou256Mapper,start,pageSize)).start();
            qunarThreadPoolExecutor.execute(func(offset,pageSize)) ;
            offset = offset + pageSize;
        }

    }
    public void test() {
        getDataAndChangeScore(0, 49, 100);
    }

    public void test2(int totalPage,int pageSize){
        getDataAndChangeScore2(0,totalPage,pageSize);
    }


    public void getDataAndChangeScore2(int start, int totalPage, int pageSize) {
        int offset = start;
        ThreadPoolExecutor pool=new ThreadPoolExecutor(10,100,15000, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(100));
        for (int i = 0; i < totalPage; i++) {
         //  new Thread(new TaskThread(zhou256Mapper,start,pageSize)).start();
            pool.execute(new TaskThread(zhou256Mapper,start,pageSize) );
            offset = offset + pageSize;
        }
    }
    public void getDataAndChangeScore(int start, int totalPage, int pageSize) {
        int offset = start;
        for (int i = 0; i < totalPage; i++) {
            func(offset, pageSize);
            offset = offset + pageSize;
        }
    }

    /**
     *
     * 需要修改获取数据的http请求的 taskType
     * 分数字段 score以及 experienceScore 区分
     * @param start
     * @param limit
     */
    public DataUpdate func(int start, int limit) {
        List<UserProfileItem> userProfiles=new ArrayList<>();
        DataUpdate dataUpdate;
        JSONObject jsonObjectTemp = new JSONObject();
    //    JSONObject[] jsonArrayTemp = new JSONObject[1];
    //    JSONArray jsonResultArrayTemp = null;
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
                //    System.out.println(name + " " + stuId + " " + stu_class + groupId + " at week" + week + "get experienceScore" + score);
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
              //      zhou256Mapper.updateByExampleSelective(record, example);
                    UserProfileItem userProfileItem=new UserProfileItem();
                    userProfileItem.setName(name);
                    userProfileItem.setStuId(stuId);
                    userProfileItem.setWeek(week+"");
                    userProfileItem.setScore(score+"");
                    userProfiles.add(userProfileItem);

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        dataUpdate=new DataUpdate(userProfiles);
        return dataUpdate;
    }


    public void invokeMethod(String methodName, Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Zhou256.class.getMethod(methodName, null).invoke(object, null);
    }

    public Zhou256 changeScore(int week, int score, Zhou256 record) {
        switch (week) {
            case 1:
                record.set每周心得1(score + "");   //;
                break;
            case 2:
                //...;
                break;
            case 3:
                //;
                break;
            case 4:
                //;
                break;
            case 5:
                //;
                break;
            case 6:
                //;
                break;
            case 7:
                //;
                break;
            case 8:
                //;
                break;
            case 9:
                //;
                break;
            case 10:
                //;
                break;
            case 11:
                //;
                break;
            case 12:
                //;
                break;
            default:
                //...;
                break;
        }
        return null;
    }
}
