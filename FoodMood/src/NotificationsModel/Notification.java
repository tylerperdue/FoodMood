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
    
    ArrayList<String> notificationHistory;
    public Notification(String foodname){
            
        Timer timer = new Timer(1800000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "";
                message = "It has been 30 minutes...please enter a mood for " + foodname;
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
    
}
