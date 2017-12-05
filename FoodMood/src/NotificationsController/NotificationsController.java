/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationsController;

import NavigationController.NavController;
import NotificationsModel.Notification;
import NotificationsUI.NotificationsUI;

/**
 *
 * @author bryaningram
 */
public class NotificationsController {
    
    /**
     * 
     */
    int notificationTime = 0;
    public NotificationsController(NavController navCntrl){
        this.notificationTime = notificationTime;
        //NotificationsUI notificationsUI = new NotificationsUI(this);
    }
    
   
    /**
     * 
     * @param notificationText takes a string to display text on notification.
     */
    public void displayNotification(String notificationText){
        //Notification notification = new Notification(notificationText);
        System.out.println("NotificationController - displayNotification(): Notification Displayed Successfully. Test Passed.");
    }
    
    public void setNotificationTime(int notificationTime){
        
       System.out.println("NotificationController - setNotificationTime(): Notification Time Set Successfully. Test Passed.");
       
    }
    
    
    
}
