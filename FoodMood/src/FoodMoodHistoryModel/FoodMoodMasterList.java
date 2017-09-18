/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodHistoryModel;

import java.util.ArrayList;

/**
 *
 * @author Jake
 */
public class FoodMoodMasterList {
    
    ArrayList<String> masterList = new ArrayList<>();
    
    /**
     * FoodMoodMasterList Constructor. Creates the arrayList for all past FoodMood
     * entries. 
     * <br>
     * 
     */
    public FoodMoodMasterList(){
        
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
