/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodUI;

import MoodController.MoodController;
import MoodModel.Mood;
import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 *
 * @author jro5165
 */
public class MoodUI extends JFrame {
    
    public MoodUI(MoodController moodCntrl) {
        System.out.println("MoodUI Class Instantiated. Test Passed.");
        MoodListPanel moodListPanel = new MoodListPanel(moodCntrl.getMoodList(), moodCntrl);
        CreateMoodPanel createMoodPanel = new CreateMoodPanel(moodCntrl);
        this.setLayout(new BorderLayout());
        // TEST
        this.add(moodListPanel);
        this.add(createMoodPanel);
        Mood mood = new Mood(1, "TEST", 4);
        moodCntrl.deleteMood(mood);
        moodCntrl.updateMood(mood);
    }
}
