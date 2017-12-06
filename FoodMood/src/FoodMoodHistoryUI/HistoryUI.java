/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodHistoryUI;

import FoodMoodHistoryController.HistoryController;
import FoodMoodHistoryModel.FoodMoodMasterList;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Jake
 */
public class HistoryUI extends JFrame {
    
    public HistoryUI(HistoryController historyCtrl){
        System.out.println("HistoryUI Class Instantiated. Test Passed.");
        HistoryPanel historyPanel = new HistoryPanel(historyCtrl);
        this.setBounds(0, 0, 360, 485);
        this.setTitle("FoodMood History");
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.add(historyPanel);
        this.setVisible(true);  
        //FoodMoodMasterList foodmood = new FoodMoodMasterList("TEST", "This is a test foodmood item.");
    }
    
    
}
