package FoodModel;

import NotificationsModel.Notification;
import javax.swing.Timer;

/**
 * Last Updated By: Zack
 */
public class Food implements Cloneable {
    int id;
    String name;
    String type;
    String description;
    String timestamp;
    Notification notefic;
    int userId;
    
    public Food(int id, String name, String type, String description, String timestamp, int userId){
        System.out.println("Food Class Instantiated. Test Passed.");
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.timestamp = timestamp;
        this.userId = userId;
    }
    
    public Object clone() {
      Object clone = null;
      
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      
      return clone;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
       
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
   
}
