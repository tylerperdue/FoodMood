package FoodModel;

import java.util.ArrayList;

/**
 *
 * @author tylerperdue
 */
public class FoodList {
    
    public FoodList () {
        System.out.println("FoodList Class Instantiated. Test Passed.");
    }
    
    public ArrayList<Food> getFoodList() {
        ArrayList<Food> foodlist = new ArrayList<Food>();
        
        // TEST
        Food test1 = new Food("Strawberry", "A red fruit.");
        Food test2 = new Food("Blueberry", "A blue fruit.");
        foodlist.add(test1);
        foodlist.add(test2);
        
        System.out.println("FoodList - getFoodList() created and returned. Test Passed.");
        return foodlist;
    }
}
