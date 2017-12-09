
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorrelationController;

import FoodModel.Food;
import FoodModel.FoodCache;
import MoodModel.Mood;
import MoodModel.MoodCache;
import NavigationController.NavController;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jake
 */
public class CorrelationController {
    
    /**
     * Correlation Controller class constructor
     */
    public CorrelationController(NavController navCntrl){
        System.out.println("CorrelationController Class Instantitated. Test Passed.");
    }
    
    public ArrayList<ArrayList> getFoodNameCorrelations(){
        System.out.println("CorrelatinController - getFoodNameCorrelations()");
        ArrayList<ArrayList> correlations = new ArrayList<ArrayList>();
        ArrayList<String> foodNames = getDistinctFoodNames(FoodCache.getFoodList());
        for(int i = 0; i < foodNames.size(); i++){
            ArrayList<String> correlation = new ArrayList<String>();
            String name = foodNames.get(i);
            String mood = getAvgMoodForUniqueFoodName(name);
            String rating = getAvgMoodRatingForUniqueFoodName(name, mood);
            correlation.add(name);
            correlation.add(mood);
            correlation.add(rating);
            correlations.add(correlation);
        }
        System.out.println(correlations);
        return correlations;
    }
    
    public ArrayList<ArrayList> getFoodTypeCorrelations(){
        System.out.println("CorrelatinController - getFoodTypeCorrelations()");
        ArrayList<ArrayList> correlations = new ArrayList<ArrayList>();
        ArrayList<String> foodTypes = getDistinctFoodTypes(FoodCache.getFoodList());
        for(int i = 0; i < foodTypes.size(); i++){
            ArrayList<String> correlation = new ArrayList<String>();
            String type = foodTypes.get(i);
            String mood = getAvgMoodForUniqueFoodType(type);
            String rating = getAvgMoodRatingForUniqueFoodType(type, mood);
            correlation.add(type);
            correlation.add(mood);
            correlation.add(rating);
            correlations.add(correlation);
        }
        System.out.println(correlations);
        return correlations;
    }
    
    public ArrayList<String> getDistinctFoodNames(ArrayList<Food> foods){
        ArrayList<String> distinctFoodNames = new ArrayList<String>();
        for(int i = 0; i < foods.size(); i++){
            String name = foods.get(i).getName();
            if(!distinctFoodNames.contains(name)){
                distinctFoodNames.add(name);
            }
        }
        System.out.println("Distinct Food Names: " + distinctFoodNames);
        return distinctFoodNames;
    }
    
    public ArrayList<String> getDistinctFoodTypes(ArrayList<Food> foods){
        ArrayList<String> distinctFoodTypes = new ArrayList<String>();
        for(int i = 0; i < foods.size(); i++){
            String type = foods.get(i).getType();
            if(!distinctFoodTypes.contains(type)){
                distinctFoodTypes.add(type);
            }
        }
        System.out.println("Distinct Food Types: " + distinctFoodTypes);
        return distinctFoodTypes;
    }
    
    public String getAvgMoodForUniqueFoodName(String foodName) {
        System.out.println("FoodMoodStatsController - getAvgMoodForUniqueFoodName()");
        ArrayList<Mood> moods = MoodCache.viewMoodList();
        ArrayList<String> moodNames = new ArrayList<String>();
        for(int i =0; i < moods.size(); i++){
            System.out.println("Food Name from Mood: " + FoodCache.getFoodWithId(moods.get(i).getFoodId()).getName());
            System.out.println("Inputted Food Name: " + foodName);
            if(FoodCache.getFoodWithId(moods.get(i).getFoodId()).getName().contains(foodName)){
                moodNames.add(moods.get(i).getName());
            }
        }
        System.out.println("Mood Names: " + moodNames);
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
            if(mostRepeated == null || mostRepeated.getValue() < e.getValue()){
                mostRepeated = e;
            }
        }
        if(mostRepeated == null){
            mostRepeated = new AbstractMap.SimpleEntry<String, Integer>("No Data Found", 0);
        }
        System.out.println(mostRepeated.getKey());
        return mostRepeated.getKey();
    }
    
    public String getAvgMoodForUniqueFoodType(String foodType) {
        System.out.println("FoodMoodStatsController - getAvgMoodForUniqueFoodType()");
        ArrayList<Mood> moods = MoodCache.viewMoodList();
        ArrayList<String> moodNames = new ArrayList<String>();
        for(int i =0; i < moods.size(); i++){
            System.out.println("Food Type from Mood: " + FoodCache.getFoodWithId(moods.get(i).getFoodId()).getType());
            System.out.println("Inputted Food Type: " + foodType);
            if(FoodCache.getFoodWithId(moods.get(i).getFoodId()).getType().contains(foodType)){
                moodNames.add(moods.get(i).getName());
            }
        }
        System.out.println("Mood Names: " + moodNames);
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
            if(mostRepeated == null || mostRepeated.getValue() < e.getValue()){
                mostRepeated = e;
            }
        }
        if(mostRepeated == null){
            mostRepeated = new AbstractMap.SimpleEntry<String, Integer>("No Data Found", 0);
        }
        System.out.println(mostRepeated.getKey());
        return mostRepeated.getKey();
    }
    
    public String getAvgMoodRatingForUniqueFoodName(String foodName, String moodName) {   
        System.out.println("FoodMoodStatsController - getAvgMoodRatingForUnqiueFoodType()");
        ArrayList<Mood> moods = MoodCache.viewMoodList();
        int total = 0;
        int counter = 0;
        for(int i = 0; i < moods.size(); i++){
            if(FoodCache.getFoodWithId(moods.get(i).getFoodId()).getName().contains(foodName) && moods.get(i).getName().contains(moodName)){
                int moodRating = moods.get(i).getRating();
                total = total + moodRating;
                counter = counter + 1;
            }
        }
        if(counter != 0){
            System.out.println("Average Mood Rating: " + Integer.toString(total/counter));
            return Integer.toString(total/counter);
        }else{
            return "No Data Found";
        }
    }
    
    public String getAvgMoodRatingForUniqueFoodType(String foodType, String moodName) {   
        System.out.println("FoodMoodStatsController - getAvgMoodRatingForUniqueFoodType()");
        ArrayList<Mood> moods = MoodCache.viewMoodList();
        int total = 0;
        int counter = 0;
        for(int i = 0; i < moods.size(); i++){
            if(FoodCache.getFoodWithId(moods.get(i).getFoodId()).getType().contains(foodType) && moods.get(i).getName().contains(moodName)){
                int moodRating = moods.get(i).getRating();
                total = total + moodRating;
                counter = counter + 1;
            }
        }
        if(counter != 0){
            System.out.println("Average Mood Rating: " + Integer.toString(total/counter));
            return Integer.toString(total/counter);
        }else{
            return "No Data Found";
        }
        
    }
    
}
    