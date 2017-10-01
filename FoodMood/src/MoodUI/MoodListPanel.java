/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodUI;

import MoodController.MoodController;
import MoodModel.Mood;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author jro5165
 */
public class MoodListPanel extends JPanel {
    
    MoodController moodCntrl;
    
    public MoodListPanel(ArrayList<Mood> moodlist, MoodController moodCntrl){
        System.out.println("MoodListPanel Class Instantiated. Test Passed.");
        this.moodCntrl = moodCntrl;
    }
    
    private class Handler implements ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
