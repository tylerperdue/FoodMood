package FoodController;

import NavigationController.NavController;
import FoodModel.Food;
import FoodModel.FoodCache;
import NotificationsModel.Notification;
import UserProfileModel.User;
import java.util.ArrayList;
/**
 *
 * Last Updated By: Tyler
 */
public class FoodController {
    
    NavController navCntrl;
    
    public FoodController(NavController navCntrl){
        System.out.println("FoodController Class Instantiated.");
        this.navCntrl= navCntrl;
    }
   
    public void createFood(String name, String type, String description){
        Food food = new Food(1, name, type, description, "time", User.loggedInUser);
        Notification notefic = new Notification(name);
        FoodCache.addFood(food);
        System.out.println("FoodController - Successfully created Food.");
        navCntrl.switchToFoodCntrl();
    }
    public ArrayList<Food> viewFoodList(){
        ArrayList<Food> listOfFoods = FoodCache.getFoodList();
        System.out.println("FoodController - Successfully viewed FoodList.");
        return listOfFoods;
    }
    public Food getFood(String name, String timestamp){
        Food food = FoodCache.getFood(name, timestamp);
        System.out.println("FoodController - Successfully retrieved food.");
        return food;
    }
    public void updateFood(int id, String name, String timestamp, String description){
        FoodCache.updateFood(id, name, timestamp, description);
        System.out.println("FoodController - Successfully updated food.");
        navCntrl.switchToFoodCntrl();
    }
    public void deleteFood(String name, String timestamp){
        FoodCache.deleteFood(name, timestamp);
        System.out.println("FoodController - Successfully deleted food.");
    }
}
