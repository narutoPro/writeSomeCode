package edu.whut.cs.chende.util;

import edu.whut.cs.chende.entity.Zhou256;
import org.json.JSONObject;

import java.lang.reflect.InvocationTargetException;

// userId:401   taskId:10
//myobject:{"finishTime":"2018-10-11 23:14:27","experienceScore":null,"week":1,"stuId":"0121810880422","groupId":"周五5-6节","experience":null,"title":"预习第1章","type":1,"userId":401,"content":"{\"content\":{\"2\":0,\"3\":0,\"4\":1,\"5\":0,\"6\":2},\"randomStartLoc\":0}","score":5,"name":"张深","time":11,"class":"计算机类m1804","taskId":10}
//{"error":0}
public class TestJson {
  //  private static final Object String = ;

    public static void main(String[] args) {
        String jsonStr="{\"finishTime\":\"2018-10-11 23:14:27\",\"experienceScore\":null,\"week\":1,\"stuId\":\"0121810880422\",\"groupId\":\"周五5-6节\",\"experience\":null,\"title\":\"预习第1章\",\"type\":1,\"userId\":401,\"content\":\"{\\\"content\\\":{\\\"2\\\":0,\\\"3\\\":0,\\\"4\\\":1,\\\"5\\\":0,\\\"6\\\":2},\\\"randomStartLoc\\\":0}\",\"score\":5,\"name\":\"张深\",\"time\":11,\"class\":\"计算机类m1804\",\"taskId\":10}" ;
        String jsonStr2="{\"error\":\"0\"}";
        JSONObject j=new JSONObject(jsonStr);
        Integer week= j.getInt("week");
        String stuId=j.getString("stuId");
        String name=j.getString("name");
        String stu_class=j.getString("class");
        String groupId=j.getString("groupId");
        int  score=j.getInt("score");
        System.out.println("String week:"+week+score);
        Zhou256 zhou256=new Zhou256();
        //zhou256.getClass()
        try {
            Zhou256.class.getMethod("set每周心得"+week,String.class).invoke(zhou256,score+"");
            System.out.println("zhou5   "+zhou256.get每周心得1());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        //Object objScore=j.get("experienceScore");
//     if(j.isNull("experienceScore"))
//         System.out.println("experienceScore is null");

      //  System.out.println(j.toString());
     //   int error=(int)j.get("error");
      //  System.out.println("error:"+error);
    }
}
