/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecommendationModel;

import FoodModel.Food;
import java.util.ArrayList;

/**
 *
 * @author bryaningram
 */
public class RecommendationList {
    
    ArrayList<Food> recommendationList = new ArrayList();
    
    /**
     * Class constructor
     */
    public RecommendationList(){
        
        
    }
    
    /**
     * Getter for the recommendation list. 
     * @return 
     */
    public ArrayList getRecList(){
        
        return recommendationList;
    }
    
    /**
     * Setter for the recommendation list. 
     */
    public void setRecList(){
        
        
    }
}
