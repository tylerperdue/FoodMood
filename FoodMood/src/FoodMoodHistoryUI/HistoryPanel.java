/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodHistoryUI;

import FoodMoodHistoryController.HistoryController;
import FoodMoodHistoryModel.FoodMoodMasterList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Jake
 */
public final class HistoryPanel extends JPanel{
    
    HistoryController historyCtrl;
    
    public HistoryPanel(ArrayList<FoodMoodMasterList> foodmoodlist, HistoryController historyCtrl){
        System.out.println("HistoryPanel Class Initialized. Test Passed.");
        this.historyCtrl = historyCtrl;
    }
    
    private class Handler implements ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
    
    
}
