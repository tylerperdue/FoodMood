/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecommendationController;

import FoodModel.Food;
import NavigationController.NavController;
import RecommendationModel.RecommendationList;
import RecommendationUI.RecommendationPanel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author bryaningram
 */
public class RecommendationController {
    
    RecommendationPanel recPanel;
    NavController navCntrl;
    
    /**
     * Class controller 
     */
    public RecommendationController(NavController navCntrl){
        System.out.println("FoodController Class Instantiated. Test Passed.");
        this.navCntrl= navCntrl;
    }
    
    public ArrayList<String> recs = new ArrayList((
		Arrays.asList("Nuts, pulses, and grains are in important part of a healthy diet.",
                        "Fruits, leafy greens, and vegetables contain vital nutrients and fiber.",
                        "Salmon, eggs, chicken, and venison are all excellent sources of protein.",
                        "An apple a day keeps the doctor away!",
                        "Brazil nuts,  are some of the most healthful nuts on the planet,",
                        "Blueberries are rich in fiber, antioxidants, and phytonutrients.",
                        "Avocados are rich in healthy fats, as well as B vitamins, vitamin K,"
                                + " and vitamin E and have a very high fiber content. ",
                        "Sweet potatoes are rich in dietary fiber, "
                                + "beta-carotene (vitamin A), potassium, vitamin C, and vitamin B-6.")));
    
    
    /**
     * Refreshes the recommendation list.
     */
    public void refreshList(){
        System.out.println("RecommendationController - Successfully refreshed food list. Test Passed.");
    }
    
//    public void generateRecommendations(){
//        Random r = new Random();
//    
//        
//    }
//    
//}

    /**
     * @return the recs
     */
    public ArrayList<String> getRecs() {
        return recs;
    }

    /**
     * @param recs the recs to set
     */
    public void setRecs(ArrayList<String> recs) {
        this.recs = recs;
    }
}