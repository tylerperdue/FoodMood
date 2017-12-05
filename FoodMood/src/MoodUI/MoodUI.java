/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodUI;

import MoodController.MoodController;
import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 *
 * @author jro5165
 */
public class MoodUI extends JFrame {
    
    public MoodUI(MoodController moodCntrl) {
        System.out.println("MoodUI Class Instantiated.");
        MoodPanel moodPanel = new MoodPanel(moodCntrl);
        this.setLayout(new BorderLayout());
        this.setSize(500, 500);
        this.setTitle("Mood");
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.add(moodPanel);
        this.setVisible(true);  
        this.setLayout(new BorderLayout());
    }
}
