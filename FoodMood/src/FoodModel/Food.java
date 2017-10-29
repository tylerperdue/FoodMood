package FoodModel;

/**
 * Last Updated By: Tyler
 */
public class Food implements Cloneable {
    int id;
    String name;
    String description;
    
    public Food(int id, String name, String description){
        System.out.println("Food Class Instantiated. Test Passed.");
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   
}
