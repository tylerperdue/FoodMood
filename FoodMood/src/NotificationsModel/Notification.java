/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationsModel;

import DatabaseController.DatabaseController;
import UserProfileModel.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Zack
 */
public class Notification {
    private static int time = 450; 
    private String message;
    ArrayList<String> notificationHistory;
    public Notification(String foodname){
           
        Timer timer = new Timer(time, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message = "It has been 30 minutes...please enter a mood for " + foodname;
                JOptionPane.showMessageDialog(null,message);
            }
        });
        timer.setRepeats(false);
        timer.start(); 
    
        message = "It has been 30 minutes...please enter a mood for " + foodname;
        
        try
        {
            Connection con = DriverManager.getConnection(DatabaseController.getHost());
            Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            stmt.executeUpdate("INSERT INTO NOTIFICATION (MESSAGE, TIME, USER) VALUES ('"+message+"', datetime('now', 'localtime'), "+User.loggedInUser+")");
            System.out.println("Successfully added notification to database.");
            con.close();
        }
        catch (SQLException e) {
            System.err.println("SQLException: Notification - readNotification()");
            System.err.println(e.getMessage());
        }
    }
    
    public int getTime()
    {
        return time;
    }
    
    public static void setTime(int t)
    {
        time = t *60000;
    }
    
    public static ArrayList<ArrayList> getNotifications() {
        ArrayList<ArrayList> notifications = new ArrayList<ArrayList>();
        try
        {
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL = "SELECT * FROM NOTIFICATION WHERE USER = "+User.loggedInUser+";";
          ResultSet rs = stmt.executeQuery(SQL);
          while (rs.next()) {
              int id = rs.getInt("ID");
              String message = rs.getString("MESSAGE");
              String time = rs.getString("TIME");
              int userId = rs.getInt("USER");
              ArrayList<String> notification = new ArrayList<String>();
              notification.add(message);
              notification.add(time);
              notifications.add(notification);
          }
          con.close();
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: Notification - getNotifications()");
          System.err.println(e.getMessage());
        }
        return notifications;
    }
    
}
