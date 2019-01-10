package edu.whut.cs.chende.util;

import java.io.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DataUpdaterMain {


    private LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();

    private QunarThreadPoolExecutor qunarThreadPoolExecutor = new QunarThreadPoolExecutor(5, 8, 5, TimeUnit.MINUTES, queue);


    public void shutThreadPool(ThreadPoolExecutor executor) {
        if (executor != null) {
            executor.shutdown();
            try {
                if (!executor.awaitTermination(20 , TimeUnit.MINUTES)) {
                    executor.shutdownNow();
                }
            } catch (Exception e) {
                System.err.println("[ThreadPool Close Error]" + e.getMessage());
            }

        }
    }

    public void close(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("[Close Io Error]" + e.getMessage());
            }
        }
    }

    public void closeConnection(Connection conn , Statement st) {
        try {
            if (conn != null) {
                conn.close();
            }
            if (st != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.err.println("[Close MySQL Error]" + e.getMessage());
        }
    }


    public boolean update(String file ,int logday) {
//        long start = System.currentTimeMillis();
//        BufferedReader br = null;
//        int num = 0;
//        try {
//            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//            String line = null;
//            List<UserProfileItem> userProfiles = new LinkedList<UserProfileItem>();
//            while ((line = br.readLine()) != null) {
//                ++num;
//                String []items = line.split("\t");
//                if (items.length == 2) {
//                    String uid = items[0];
//                    String profile = items[1];
//                    userProfiles.add(new UserProfileItem(uid, profile, logday));
//                    if (userProfiles.size() >= 100) {
//                        qunarThreadPoolExecutor.execute(new DataUpdater(userProfiles));
//                        userProfiles = new LinkedList<UserProfileItem>();
//                    }
//                } else {
//                    System.err.println("[Data Error]" + line);
//                }
//            }
//            qunarThreadPoolExecutor.execute(new DataUpdater(userProfiles));;
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.err.println("[Read File Error]" + e.getMessage());
//            return false;
//        }  finally {
//            System.err.println("[Update] take time " + (System.currentTimeMillis() - start) + ".ms");
//            System.err.println("[Update] update item " + num);
//            shutThreadPool(qunarThreadPoolExecutor);;
//            close(br);
//        }
        return true;
    }

    public static void main(String []args) {
        String file = "D:\\workspaces\\promotionwordData.log";
        int logday = Integer.parseInt("20150606");
        DataUpdaterMain dataUpdaterMain = new DataUpdaterMain();
        dataUpdaterMain.update(file, logday);
    }
}
