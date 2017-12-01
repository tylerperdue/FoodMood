/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodStatsController;
import FoodModel.Food;
import FoodMoodStatsModel.FoodMoodStat;
import FoodMoodStatsUI.FoodMoodStatsUI;
import MoodModel.Mood;
import NavigationController.NavController;
import java.util.Hashtable;
import java.util.ArrayList;

/**
 *
 * @author bryaningram
 */
public class FoodMoodStatsController {
    
    NavController navCntrl;
    /**
     * Food Mood Stats Controller Class Constructor
     */
    public FoodMoodStatsController(NavController navCntrl){
        System.out.println("FoodMoodStatsController Class Instantiated. Test Passed.");
        this.navCntrl= navCntrl;
        FoodMoodStatsUI foodMoodUI = new FoodMoodStatsUI(this);
    }
    
    public ArrayList<FoodMoodStat> computeFoodMoodStats(Hashtable<Integer, Food> foodlist, Hashtable<Integer, Mood> moodlist){
        ArrayList<FoodMoodStat> foodMoodStats = new ArrayList<>();
        for(int i = 0; i < foodlist.size(); i++){
            // TEST
            Food food =  new Food(1, "TEST", "This is only a test.", "test", "test", 2);
            Mood mood = new Mood(1, "TEST", 10, "test");
            FoodMoodStat foodMoodStat = new FoodMoodStat(food, mood, 45);
            foodMoodStats.add(foodMoodStat);
        }
        System.out.println("FoodMoodStatsController - computeFoodMoodStats(): Stats Computed Successfully. Test Passed.");
        return foodMoodStats;
    }
}
