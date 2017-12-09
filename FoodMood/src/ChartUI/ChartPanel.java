/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChartUI;

import ChartController.ChartController;
import ChartModel.Chart;
import javax.swing.JPanel;

/**
 *
 * @author jro5165
 */
public class ChartPanel extends JPanel{
    
    private ChartController chartCtrl;
    
    /**
     * Class constructor. Initializes components on the JPanel.
     */
    public ChartPanel(ChartController chartCtrl){
        System.out.println("ChartPanel Instantiated.");
        this.chartCtrl = chartCtrl;
        initComponents();
    }
    
    /** 
     * Initiate components method for the class.
     */
    public void initComponents(){
     
        
    }
}
