/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationsModel;

import DatabaseController.DatabaseController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Zack
 */
public class Notification {
    private static int time = 1800000; 
    private String message;
    ArrayList<String> notificationHistory;
    public Notification(String foodname){
           
        Timer timer = new Timer(time, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message = "";
                
                message = "It has been " + time/60000 + " minutes...please enter a mood for " + foodname;
                JOptionPane.showMessageDialog(null,message);
                
            }
        });
        timer.setRepeats(false);
        timer.start(); 
    
        try{
            Connection con = DriverManager.getConnection(DatabaseController.getHost());
            Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Date date = new Date();
            String SQL = "INSERT INTO NOTIFICATION VALUES (" +message+","+date+")";
            ResultSet rs = stmt.executeQuery(SQL);
            
                
                
            }
        catch (SQLException e) {
            System.err.println("SQLException: History - readNotification()");
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
    
}
