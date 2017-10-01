/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodUI;

import FoodController.FoodController;
import FoodModel.Food;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author jro5165
 */
public class FoodListPanel extends JPanel {
    
    FoodController foodCntrl;
    
    public FoodListPanel(ArrayList<Food> foodlist, FoodController foodCntrl){
        System.out.println("FoodListPanel Class Initialized. Test Passed.");
        this.foodCntrl = foodCntrl;
    }
    
    private class Handler implements ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
