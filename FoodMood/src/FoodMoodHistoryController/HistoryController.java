/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodHistoryController;
import FoodMoodHistoryModel.FoodMoodMasterList;
import java.util.ArrayList;

/**
 *
 * @author Jake
 */



public class HistoryController {
    
    FoodMoodMasterList masterList;
   
    
    /**
     * History Controller class constructor
     */
    public HistoryController(){
        
    }
    
    
    /**
     * Sort method for the History List.
     * @return 
     */
    public FoodMoodMasterList sortHistory(){
        
        return masterList;
    }
    
    
    /**
     * Search method for the History List.
     * @return returns the masterList arrayList 
     */
    public FoodMoodMasterList searchHistory(){
        
        return masterList;
    }
    
}
