package MoodModel;

/**
 *
 * Last Updated By: Tyler
 */
public class Mood implements Cloneable {
    int id;
    String name;
    int rating;
    String timestamp;
    int userId;
    
    public Mood(int id, String name, int rating, String timestamp, int userId){
        System.out.println("Mood Class Instantiated.");
        this.id = id;
        this.name = name;
        this.rating = rating;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int timestamp) {
        this.rating = rating;
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
