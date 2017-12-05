/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationsModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Zack
 */
public class Notification {
    private static int time = 1800000; 
    ArrayList<String> notificationHistory;
    public Notification(String foodname){
           
        Timer timer = new Timer(time, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "";
                
                message = "It has been " + time/60000 + " minutes...please enter a mood for " + foodname;
                JOptionPane.showMessageDialog(null,message);
                notificationHistory.add(message);
            }
        });
        timer.setRepeats(false);
        timer.start(); 
    
        
         }
    public ArrayList<String> getHistory()
    {
        return notificationHistory;
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
