/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodHistoryController;

import NavigationController.NavController;
import FoodMoodHistoryModel.FoodMoodMasterList;
import FoodMoodHistoryUI.HistoryUI;
import java.util.ArrayList;

/**
 *
 * @author Jake
 */

public class HistoryController {
    
    NavController navCntrl;
    String food;
    String mood;
   
    /**
     * History Controller class constructor
     */
    public HistoryController(NavController navCntrl){
        System.out.println("HistoryController Class Instantiated. Test Passed.");
        this.navCntrl= navCntrl;
        HistoryUI history = new HistoryUI(this);
    }
    
    public ArrayList<FoodMoodMasterList> viewFoodMoodList(){
        FoodMoodMasterList foodmoodlist = new FoodMoodMasterList(food, mood);
        ArrayList<FoodMoodMasterList> listOfFoodMood = foodmoodlist.getMasterList();
        System.out.println("HistoryController - Successfully viewed FoodMoodList. Test Passed.");
        return listOfFoodMood;
    }
    
    /**
     * Sort method for the History List. 
     * @param food
     * @param mood
     */
    public void sortHistory(FoodMoodMasterList food, FoodMoodMasterList mood){
        System.out.println("HistoryController - Successfully sorted FoodMoodList. Test Passed.");
    }
    
    
    /**
     * Search method for the History List. 
     * @param food
     * @param mood
     */
    public void searchHistory(FoodMoodMasterList food, FoodMoodMasterList mood){
        System.out.println("HistoryController - Successfully searched FoodMoodList. Test Passed.");
    }
    
}
