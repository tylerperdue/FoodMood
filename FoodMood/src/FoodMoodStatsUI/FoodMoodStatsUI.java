/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodStatsUI;

import FoodModel.Food;
import FoodModel.FoodCache;
import FoodMoodStatsController.FoodMoodStatsController;
import MoodModel.Mood;
import MoodModel.MoodCache;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.util.ArrayList;

/**
 *
 * @author jro5165
 */

public class FoodMoodStatsUI extends JFrame {
    
    public FoodMoodStatsUI(FoodMoodStatsController foodMoodCntrl) {
        System.out.println("FoodMoodStatsUI Class Instantiated. Test Passed.");
        FoodMoodStatsPanel foodMoodPanel = new FoodMoodStatsPanel(foodMoodCntrl);
        this.setLayout(new BorderLayout());
        // TEST
        ArrayList<Food> foodlist = FoodCache.getFoodList();
        ArrayList<Mood> moodlist = MoodCache.getMoodList();
        foodMoodCntrl.computeFoodMoodStats(foodlist, moodlist);
        this.add(foodMoodPanel);
    }
}
