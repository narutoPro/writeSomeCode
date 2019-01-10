package edu.whut.cs.chende.util;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DataUpdate {
    private PreparedStatement pst;

    private List<UserProfileItem> userProfiles;

  //  private final String SQL = "insert into userprofile (`uid` ,`profile` , `logday`) VALUES (?, ? ,?) ON DUPLICATE KEY UPDATE `profile`= ? ";
     private final String SQL = "update  zhou256  SET 课前心得?=?  WHERE name=? and stuId=?  ";

    public DataUpdate(List<UserProfileItem> userProfiles) {
        this.userProfiles = userProfiles;
    }

    public void run() {
        try {
            pst = ConnnectionManager.getConnectionFromThreadLocal().prepareStatement(SQL);
            for (UserProfileItem userProfile : userProfiles) {
                if(userProfile.getName() != null && !userProfile.getName().isEmpty() &&
                        userProfile.getStuId() != null && !userProfile.getStuId().isEmpty()) {
                    pst.setString(1, userProfile.getWeek());
                    pst.setString(2, userProfile.getScore());
                    pst.setString(3, userProfile.getName());
                    pst.setString(4, userProfile.getStuId());
                    pst.addBatch();
                }
            }
            pst.executeBatch();
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

