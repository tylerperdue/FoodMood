/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChartController;
import FoodMoodHistoryModel.FoodMoodMasterList;
import java.util.ArrayList;
/**
 *
 * @author Jake
 */
public class ChartController {
    
    
    FoodMoodMasterList masterList;
   
    
    /**
     * History Controller class constructor
     */
    public ChartController(){
        
    }
    
    
    /**
     * getter for the history of the chart
     * @return 
     */
    public FoodMoodMasterList chartHistory(){
        
        return masterList;
    }
    
    
    /**
     * Adds to the Chart
     * @return returns the masterList arrayList 
     */
    public FoodMoodMasterList addtoChart(){
        
        return masterList;
    }
    
}

