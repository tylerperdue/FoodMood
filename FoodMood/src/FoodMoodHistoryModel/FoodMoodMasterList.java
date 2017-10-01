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
    
    String food;
    String mood;
    
    /**
     * FoodMoodMasterList Constructor. Creates the arrayList for all past FoodMood
     * entries. 
     * <br>
     * 
     * @param food
     * @param mood
     */
    public FoodMoodMasterList(String food, String mood){
        System.out.println("FoodMoodMasterList Class Instantiated. Test Passed.");
        this.food = food;
        this.mood = mood;
    }
    
    public void setFood(String food) {
        this.food = food;
    }
    
    public String getFood() {
        return food;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
    
    /** 
     * Getter method for the arrayList. 
     * <br>
     * @return 
     */
    public ArrayList getMasterList(){
        ArrayList foodmoodlist = new ArrayList();
        
        //Test
        FoodMoodMasterList test1 = new FoodMoodMasterList("Burger", "Happy");
        FoodMoodMasterList test2 = new FoodMoodMasterList("Pizza", "Sad");
        foodmoodlist.add(test1);
        foodmoodlist.add(test2);
        System.out.println("FoodMoodMasterList - getMasterList() created and returned. Test Passed.");
        return foodmoodlist;
    }
}
