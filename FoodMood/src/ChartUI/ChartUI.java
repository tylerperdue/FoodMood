/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChartUI;

import ChartController.ChartController;
import javax.swing.JFrame;

/**
 *
 * @author Jake
 */
public class ChartUI extends JFrame {

    /**
     * Class Constructor. Initializes all UI components on the frame, such as the ChartPanel. 
     */
    private ChartPanel CP;
    public ChartUI(ChartController ChartCtrl){
       CP = new ChartPanel();
       System.out.println("ChartUI Class Instantiated. Test Passed.");
    }
    
  
}