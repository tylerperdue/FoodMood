/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodHistoryController;

import NavigationController.NavController;

/**
 *
 * @author Jake
 */

public class HistoryController {
    
    NavController navCntrl;
   
    /**
     * History Controller class constructor
     */
    public HistoryController(NavController navCntrl){
        System.out.println("HistoryController Class Instantiated.");
        this.navCntrl= navCntrl;
    }
    
}
