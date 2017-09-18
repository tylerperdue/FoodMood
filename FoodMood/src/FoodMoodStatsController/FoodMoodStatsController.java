/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodStatsController;
import FoodMoodStatsModel.FoodMoodStatsModel;
import java.util.ArrayList;

/**
 *
 * @author bryaningram
 */
public class FoodMoodStatsController {
    FoodMoodStatsModel masterList;
   
    
    /**
     * History Controller class constructor
     */
    public FoodMoodStatsController(){
        
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
