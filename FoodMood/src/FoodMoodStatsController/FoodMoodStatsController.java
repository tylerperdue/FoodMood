/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodStatsController;
import FoodModel.Food;
import FoodModel.FoodCache;
import MoodModel.Mood;
import MoodModel.MoodCache;
import NavigationController.NavController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bryaningram
 */
public class FoodMoodStatsController {
    
    NavController navCntrl;
    /**
     * Food Mood Stats Controller Class Constructor
     */
    public FoodMoodStatsController(NavController navCntrl){
        System.out.println("FoodMoodStatsController Class Instantiated.");
        this.navCntrl= navCntrl;
    }
     
    public String getNumberOfFoods() {
        System.out.println("FoodMoodStatsController - getNumberOfFoods()");
        ArrayList<Food> foods =  FoodCache.getFoodList();
        System.out.println(Integer.toString(foods.size()));
        return Integer.toString(foods.size());
    }
    
    public String getNumberOfMoods() {
        System.out.println("FoodMoodStatsController = getNumberOfMoods()");
        ArrayList<Mood> moods = MoodCache.viewMoodList();
        System.out.println(Integer.toString(moods.size()));
        return Integer.toString(moods.size());
    }
    
    public String getAvgFood() {
        System.out.println("FoodMoodStatsController - getAvgFood()");
        ArrayList<Food> foods = FoodCache.getFoodList();
        ArrayList<String> foodNames = new ArrayList<String>();
        for(int i =0; i < foods.size(); i++){
            foodNames.add(foods.get(i).getName());
        }
        Map<String, Integer> stringsCount = new HashMap<>();
        for(int i = 0; i < foodNames.size(); i++){
            String foodName = foodNames.get(i);
            Integer c = stringsCount.get(foodName);
            if(c == null){
                c = new Integer(0);
            }
            c++;
            stringsCount.put(foodName,c);
        }
        Map.Entry<String,Integer> mostRepeated = null;
        for(Map.Entry<String, Integer> e: stringsCount.entrySet())
        {
            if(mostRepeated == null || mostRepeated.getValue() < e.getValue())
                mostRepeated = e;
        }
        System.out.println(mostRepeated.getKey());
        return mostRepeated.getKey();
    }
    
    public String getAvgMood() {
        System.out.println("FoodMoodStatsController - getAvgMood()");
        ArrayList<Mood> moods = MoodCache.viewMoodList();
        ArrayList<String> moodNames = new ArrayList<String>();
        for(int i =0; i < moods.size(); i++){
            moodNames.add(moods.get(i).getName());
        }
        Map<String, Integer> stringsCount = new HashMap<>();
        for(int i = 0; i < moodNames.size(); i++){
            String moodName = moodNames.get(i);
            Integer c = stringsCount.get(moodName);
            if(c == null){
                c = new Integer(0);
            }
            c++;
            stringsCount.put(moodName,c);
        }
        Map.Entry<String,Integer> mostRepeated = null;
        for(Map.Entry<String, Integer> e: stringsCount.entrySet())
        {
            if(mostRepeated == null || mostRepeated.getValue() < e.getValue())
                mostRepeated = e;
        }
        System.out.println(mostRepeated.getKey());
        return mostRepeated.getKey();
    }
        
    public String getAvgFoodType() {   
        System.out.println("FoodMoodStatsController - getAvgFoodType()");
        ArrayList<Food> foods = FoodCache.getFoodList();
        ArrayList<String> foodTypes = new ArrayList<String>();
        for(int i =0; i < foods.size(); i++){
            foodTypes.add(foods.get(i).getType());
        }
        Map<String, Integer> stringsCount = new HashMap<>();
        for(int i = 0; i < foodTypes.size(); i++){
            String foodType = foodTypes.get(i);
            Integer c = stringsCount.get(foodType);
            if(c == null){
                c = new Integer(0);
            }
            c++;
            stringsCount.put(foodType,c);
        }
        Map.Entry<String,Integer> mostRepeated = null;
        for(Map.Entry<String, Integer> e: stringsCount.entrySet())
        {
            if(mostRepeated == null || mostRepeated.getValue() < e.getValue())
                mostRepeated = e;
        }
        System.out.println(mostRepeated.getKey());
        return mostRepeated.getKey();
    }
    
    public String getAvgMoodRating() {   
        System.out.println("FoodMoodStatsController - getAvgMoodRating()");
        ArrayList<Mood> moods = MoodCache.viewMoodList();
        int total = 0;
        for(int i = 0; i < moods.size(); i++){
            int moodRating = moods.get(i).getRating();
            total = total + moodRating;
        }
        System.out.println(Integer.toString((total/moods.size())));
        return Integer.toString((total/moods.size()));
    }
    
}
