/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodStatsModel;

import FoodModel.Food;
import MoodModel.Mood;

/**
 *
 * @author bryaningram
 */
public class FoodMoodStat {
    Food food;
    Mood mood;
    int strength;
    
    
    /**
     * FoodMoodStatsModel Constructor. Creates the arrayList for all past FoodMood
     * entries. 
     * <br
     * 
     */
    public FoodMoodStat(Food food, Mood mood, int strength){
        System.out.println("FoodMoodStat Class Instantiated. Test Passed.");
        this.food = food;
        this.mood = mood;
        this.strength = strength;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    

}
