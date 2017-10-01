/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecommendationUI;

import FoodModel.Food;
import RecommendationController.RecommendationController;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Jake
 */
public class RecommendationPanel extends JPanel{
    
    RecommendationController recommendCtrl;
    
    /**
     * class constructor
     * @param foodlist
     * @param recommendCtrl
     */
    public RecommendationPanel(ArrayList<Food> foodlist, RecommendationController recommendCtrl){
        System.out.println("RecommendationPanel Class Instantiated. Test Passed.");
        this.recommendCtrl = recommendCtrl;
    }
}
