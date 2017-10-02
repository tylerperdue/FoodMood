/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChartController;
import ChartUI.ChartUI;
import FoodMoodHistoryModel.FoodMoodMasterList;
import NavigationController.NavController;
/**
 *
 * @author Jake
 */
public class ChartController {
    
    
    FoodMoodMasterList masterList;
    private ChartUI chartUI;
    
    /**
     * History Controller class constructor
     */
    public ChartController(NavController navCntrl){
        System.out.println("ChartController Class Instantiated. Test Passed.");
        chartUI = new ChartUI(this);
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

