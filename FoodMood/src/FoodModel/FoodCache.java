/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodModel;

import java.util.Hashtable;
import java.util.ArrayList;

/**
 *
 * @author tylerperdue
 */
public class FoodCache {
    
    private static Hashtable<Integer, Food> foodMap = new Hashtable<Integer, Food>();
    
    public static Food getFood(int foodId) {
        Food cachedFood = foodMap.get(foodId);
        System.out.println("FoodCache - getFood method called.");
        return (Food) cachedFood.clone();
    }
    
    public static ArrayList<Food> getFoodList() {
        ArrayList<Food> foodlist = new ArrayList();
        
        for(int i = 0;i <= foodMap.size();i++) {
           Food cachedFood = foodMap.get(i);
           foodlist.add((Food) cachedFood.clone());
        }
        System.out.println("FoodCache - getFoodList method called.");
        return foodlist;
    }
    
    public static void loadCache() {
        // Eventually run database query and create Food objects for each
        // For now, just going to use text file
        // Add each shape to Hashtable
        Food test1 = new Food(1, "Strawberry", "A red fruit.");
        foodMap.put(test1.getId(), test1);
        Food test2 = new Food(2, "Blueberry", "A blue fruit.");
        foodMap.put(test2.getId(), test2);
        System.out.println("FoodCache - loadCache method called.");
    }
    
}
