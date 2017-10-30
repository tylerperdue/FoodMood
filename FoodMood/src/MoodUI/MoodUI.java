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
        // MoodListPanel moodListPanel = new MoodListPanel(moodCntrl.getMoodList(), moodCntrl);
        // CreateMoodPanel createMoodPanel = new CreateMoodPanel(moodCntrl);
        MoodPanel moodPanel = new MoodPanel();
        this.setLayout(new BorderLayout());
        this.setSize(500, 500);
        this.setTitle("Mood");
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        //this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.add(moodPanel);
        this.setVisible(true);  
        this.setLayout(new BorderLayout());
        // TEST
        // this.add(moodListPanel);
        // this.add(createMoodPanel);
        Mood mood = new Mood(1, "TEST", 4);
        moodCntrl.deleteMood(mood);
        moodCntrl.updateMood(mood);
    }
}
