package edu.whut.cs.chende.util;

/**
 * 处理链接失败的线程
 */
public class HandleThread implements Runnable {

    //重新请求  最多10次 直到 {"error":0}
    @Override
    public void run() {

    }

    int userId;
    int taskId;
    int score;

    public HandleThread() {
    }

    public HandleThread(int userId, int taskId, int score) {
        this.userId = userId;
        this.taskId = taskId;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
