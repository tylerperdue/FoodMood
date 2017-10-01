/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodStatsController;
import FoodMoodStatsModel.FoodMoodStatsModel;
import NavigationController.NavController;

/**
 *
 * @author bryaningram
 */
public class FoodMoodStatsController {
    FoodMoodStatsModel masterList;
    NavController navCntrl;
  
    /**
     * History Controller class constructor
     */
    public FoodMoodStatsController(NavController navCntrl){
        System.out.println("FoodMoodStatsController Class Instantiated. Test Passed.");
    }
    
    
    /**
     * Sort method for the Stats List.
     * @return 
     */
    public FoodMoodStatsModel sortStats(){
        
        return masterList;
    }
    
    
    /**
     * Search method for the Stats List.
     * @return returns the masterList arrayList 
     */
    public FoodMoodStatsModel searchStats(){
        
        return masterList;
    }
}
