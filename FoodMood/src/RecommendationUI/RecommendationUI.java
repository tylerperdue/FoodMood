/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecommendationUI;

import RecommendationController.RecommendationController;
import FoodController.FoodController;
import FoodModel.Food;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author bryaningram
 */
public class RecommendationUI extends JFrame{
    
    
    /**
     * Class Constructor
     * @param recommendCtrl
     */
   public RecommendationUI(RecommendationController recommendCtrl){
        System.out.println("RecommendationUI Class Instantiated. Test Passed.");
        RecommendationPanel recommendationPanel = new RecommendationPanel(recommendCtrl.findRecommedation(), recommendCtrl);
        this.setLayout(new BorderLayout());
        // TEST
        this.add(recommendationPanel);
    }
   
   
    
    
    
}
