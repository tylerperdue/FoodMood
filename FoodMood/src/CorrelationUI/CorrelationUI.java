/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorrelationUI;

import Correlation.Correlation;
import javax.swing.JFrame;

/**
 *
 * @author Jake
 */
public class CorrelationUI extends JFrame {
   /**
     * Class Constructor. Initializes all UI components on the frame, such as the CorrelationPanel
     */
    private CorrelationPanel CP;
    public CorrelationUI(){
        CP = new CorrelationPanel();
        System.out.println("CorrelationUI Class Instantiated. Test Passed.");
        
    }
        
}