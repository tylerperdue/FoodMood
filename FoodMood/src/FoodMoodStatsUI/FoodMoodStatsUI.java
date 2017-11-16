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
import java.util.Hashtable;

/**
 *
 * @author jro5165
 */

public class FoodMoodStatsUI extends JFrame {
    
    public FoodMoodStatsUI(FoodMoodStatsController foodMoodCntrl) {
        System.out.println("FoodMoodStatsUI Class Instantiated. Test Passed.");
        FoodMoodStatsPanel foodMoodPanel = new FoodMoodStatsPanel(foodMoodCntrl);
        this.setBounds(0, 0, 360, 485);
        this.setTitle("FoodMoodStats");
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.add(foodMoodPanel);
        this.setVisible(true);  
//        this.setLayout(new BorderLayout());
//        // TEST
//        Hashtable<Integer, Food> foodlist = FoodCache.getFoodList();
//        Hashtable<Integer, Mood> moodlist = MoodCache.getMoodList();
//        foodMoodCntrl.computeFoodMoodStats(foodlist, moodlist);
//        this.add(foodMoodPanel);
    }
}
