package edu.whut.cs.chende.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnnectionManager {

    private static final ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>();

    private static final String BETADBURL = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8&autoReconnect=true&user=root&password=root";


    public static Connection getConnectionFromThreadLocal() {
        Connection conn = connectionHolder.get();
        try {
            if (conn == null || conn.isClosed()) {
                Connection con = ConnnectionManager.getConnection();
                connectionHolder.set(con);
                System.out.println("[Thread]" + Thread.currentThread().getName());
                return con;
            }
            return conn;
        } catch (Exception e) {
            System.out.println("[ThreadLocal Get Connection Error]" + e.getMessage());
        }
        return null;


    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(BETADBURL);
        } catch (Exception e) {
            System.out.println("[Get Connection Error]" + e.getMessage());
        }
        return conn;
    }
}