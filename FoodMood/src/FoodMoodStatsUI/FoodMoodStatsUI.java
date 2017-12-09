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
    
    FoodMoodStatsPanel foodMoodStatsPanel;
    
    public FoodMoodStatsUI(FoodMoodStatsController foodMoodStatsCntrl) {
        System.out.println("FoodMoodStatsUI Class Instantiated.");
        this.foodMoodStatsPanel = new FoodMoodStatsPanel(foodMoodStatsCntrl);
        this.setSize(500, 400);
        this.setTitle("Food");
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.add(foodMoodStatsPanel);
        this.setVisible(true);   
    }
}
