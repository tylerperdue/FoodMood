/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecommendationController;

import FoodModel.Food;
import FoodModel.FoodList;
import NavigationController.NavController;
import RecommendationModel.RecommendationList;
import RecommendationUI.RecommendationUI;
import java.util.ArrayList;

/**
 *
 * @author bryaningram
 */
public class RecommendationController {
    
    NavController navCntrl;
    
    /**
     * Class controller 
     */
    public RecommendationController(NavController navCntrl){
        System.out.println("FoodController Class Instantiated. Test Passed.");
        this.navCntrl= navCntrl;
        RecommendationUI recommendation = new RecommendationUI(this);
    }
    
    
    /**
     * Refreshes the recommendation list.
     */
    public void refreshList(){
        System.out.println("RecommendationController - Successfully refreshed food list.");
    }
    
    /**
     * Method to generate a recommendation from the list based on Moods.
     * @return 
     */
    public ArrayList<Food> findRecommedation(){
        RecommendationList recommend = new RecommendationList();
        ArrayList<Food> recommendations = recommend.getRecList();
        System.out.println("RecommendationController - Successfully recommended food.");
        return recommendations;
    }
    
    
}
