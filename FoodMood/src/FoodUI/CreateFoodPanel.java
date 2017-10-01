/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodUI;

import FoodController.FoodController;
import FoodModel.Food;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author jro5165
 */
public class CreateFoodPanel extends JPanel {
    public CreateFoodPanel(FoodController foodCntrl){
        System.out.println("FoodListPanel Class Instantiated. Test Passed.");
        // TEST
        Food food = new Food("TEST", "This is a test food item.");
        foodCntrl.createFood(food);
    }
    
    private class Handler implements ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
