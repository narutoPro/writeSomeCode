package edu.whut.cs.chende.util;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DataUpdate implements Runnable{
    private PreparedStatement pst;

    private List<UserProfileItem> userProfiles;

  //  private final String SQL = "insert into userprofile (`uid` ,`profile` , `logday`) VALUES (?, ? ,?) ON DUPLICATE KEY UPDATE `profile`= ? ";
    // private final String SQL = "update  zhou256  SET ?=?  WHERE name=? and stuId=?  ";

    public DataUpdate(List<UserProfileItem> userProfiles) {
        this.userProfiles = userProfiles;
    }

    public void run() {
        try {

            for (UserProfileItem userProfile : userProfiles) {
                if(userProfile.getName() != null && !userProfile.getName().isEmpty() &&
                        userProfile.getStuId() != null && !userProfile.getStuId().isEmpty()) {
                    String SQL = "update  zhou256  SET 课前心得"+userProfile.getWeek()+"=?  WHERE 姓名=? and 学号=?  ";
                    System.out.println(userProfile.getName()+"第"+userProfile.getWeek()+"周,"+"执行sql："+SQL);

                    pst = ConnnectionManager.getConnectionFromThreadLocal().prepareStatement(SQL);
                //    pst.setString(1, userProfile.getWeek());
                    pst.setString(1, userProfile.getScore());
                    pst.setString(2, userProfile.getName());
                    pst.setString(3, userProfile.getStuId());
                    pst.execute();
                }
            }
       //     pst.executeBatch();
        } catch (Exception e) {
            System.err.println("[SQL ERROR MESSAGE]" + e.getMessage());
        } finally {
            close(pst);
        }

    }

    public void close(PreparedStatement pst) {
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                System.err.println("[Close Statement Error]" + e.getMessage());
            }
        }
    }
}

