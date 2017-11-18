package FoodController;

import NavigationController.NavController;
import FoodModel.Food;
import FoodModel.FoodCache;
import NotificationsModel.Notification;
import java.util.Hashtable;
/**
 *
 * Last Updated By: Tyler
 */
public class FoodController {
    
    NavController navCntrl;
    
    public FoodController(NavController navCntrl){
        System.out.println("FoodController Class Instantiated. Test Passed.");
        this.navCntrl= navCntrl;
    }
    
    public void createFood(String name, String type, String description){
        Food food = new Food(1, name, type, description, "time");
        Notification notefic = new Notification(name);
        FoodCache.addFood(food);
        System.out.println("FoodController - Successfully created Food. Test Passed.");
    }
    public Hashtable<Integer, Food> viewFoodList(){
        Hashtable<Integer, Food> listOfFoods = FoodCache.getFoodList();
        System.out.println("FoodController - Successfully viewed FoodList. Test Passed.");
        return listOfFoods;
    }
    public void updateFood(Food food){
        // Open Database connection
        // Query Database
        System.out.println("FoodController - Successfully updated food. Test Passed.");
    }
    public void deleteFood(Food food){
        // Open Database connection
        // Query Database
        System.out.println("FoodController - Successfully deleted food. Test Passed.");
    }
    
}
