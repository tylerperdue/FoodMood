/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodStatsModel;

import java.util.ArrayList;

/**
 *
 * @author bryaningram
 */
public class FoodMoodStatsModel {
    ArrayList<String> masterList = new ArrayList<>();
    
    /**
     * FoodMoodStatsModel Constructor. Creates the arrayList for all past FoodMood
     * entries. 
     * <br>
     * 
     */
    public FoodMoodStatsModel(){
        
    }
    
    /** 
     * Getter method for the arrayList. 
     * <br>
     * @return 
     */
    public ArrayList getMasterList(){
        return masterList;
    }
    
    /**
     * Setter method for the arrayList.
     */
    public void setMasterList(){
        
    }
}
