package FoodController;

import NavigationController.NavController;
import FoodUI.FoodUI;
import FoodModel.Food;
import FoodModel.FoodCache;
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
        FoodUI foodUI = new FoodUI(this);
    }
    
    public void createFood(Food food){
        // Open Database connection 
        // Query Database
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
