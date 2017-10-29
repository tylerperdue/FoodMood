/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodUI;

import MoodController.MoodController;
import MoodModel.Mood;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author jro5165
 */
public class CreateMoodPanel extends JPanel {
    public CreateMoodPanel(MoodController moodCntrl){
        System.out.println("MoodLisPanel Class Instantiated. Test Passed.");
        // TEST
        Mood mood = new Mood(1, "TEST", 4);
        moodCntrl.createMood(mood);
    }
    
    private class Handler implements ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
