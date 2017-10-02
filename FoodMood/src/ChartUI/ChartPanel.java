/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChartUI;

import ChartModel.Chart;
import javax.swing.JPanel;

/**
 *
 * @author jro5165
 */
public class ChartPanel extends JPanel{
    
    /**
     * Class constructor. Initializes components on the JPanel.
     */
    private Chart CM;
    public ChartPanel(){
        System.out.println("ChartPanel Instantiated. Test Passed.");
        initComponents();
        CM = new Chart();
    }
    
    /** 
     * Initiate components method for the class.
     */
    public void initComponents(){
     
        
    }
}
