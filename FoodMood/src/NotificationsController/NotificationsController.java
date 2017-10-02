/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotificationsController;

/**
 *
 * @author bryaningram
 */
public class NotificationsController {
    
    /**
     * 
     */
    int notificationTime = 0;
    public NotificationsController(){
        this.notificationTime = notificationTime;
        
    }
    
   
    /**
     * 
     * @param notificationText takes a string to display text on notification.
     */
    public void displayNotification(String notificationText){
        
        System.out.println("Notification Displayed");
    }
    
    public void setNotificationTime(int notificationTime){
        
       System.out.println("Notification time is: " + notificationTime);
       
       
    }
    
    
    
}
