
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorrelationController;

import CorrelationUI.CorrelationUI;
import FoodMoodHistoryModel.FoodMoodMasterList;
import NavigationController.NavController;

/**
 *
 * @author Jake
 */
public class CorrelationController {
    CorrelationUI ui;
    //test
    FoodMoodMasterList masterList;
   
    
    /**
     * Correlation Controller class constructor
     */
    public CorrelationController(NavController navCntrl){
        System.out.println("CorrelationController Class Instantitated. Test Passed.");
        iniateUI();
    }
    
    
    public void iniateUI() {
    
            CorrelationUI ui = new CorrelationUI();
    }
    
    
   
    
    
    /**
     * Search method for the History List.
     * @return returns the masterList arrayList 
     */
    public FoodMoodMasterList searchHistory(){
        
        return masterList;
    }
    
}
    