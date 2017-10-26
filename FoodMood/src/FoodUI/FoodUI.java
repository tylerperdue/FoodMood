/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodUI;

import FoodController.FoodController;
import FoodModel.Food;
import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 *
 * @author jro5165
 */
public class FoodUI extends JFrame {
    
    public FoodUI(FoodController foodCntrl) {
        System.out.println("FoodUI Class Instantiated. Test Passed.");
        //FoodListPanel foodListPanel = new FoodListPanel(foodCntrl.viewFoodList(), foodCntrl);
        //CreateFoodPanel createFoodPanel = new CreateFoodPanel(foodCntrl);
        FoodPanel foodPanel = new FoodPanel();
        this.setLayout(new BorderLayout());
        this.setSize(500, 500);
        this.setTitle("Food");
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.add(foodPanel);
        this.setVisible(true);   
        // TEST
        //this.add(foodListPanel);
        //this.add(createFoodPanel);
        Food food = new Food("TEST", "This is a test food item.");
        foodCntrl.deleteFood(food);
        foodCntrl.updateFood(food);
    }
}
