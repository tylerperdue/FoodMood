/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodStatsUI;

import FoodModel.Food;
import FoodModel.FoodList;
import FoodMoodStatsController.FoodMoodStatsController;
import MoodModel.Mood;
import MoodModel.MoodList;
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
        ArrayList<Food> foodlist = FoodList.getFoodList();
        ArrayList<Mood> moodlist = MoodList.getMoodList();
        foodMoodCntrl.computeFoodMoodStats(foodlist, moodlist);
        this.add(foodMoodPanel);
    }
}
