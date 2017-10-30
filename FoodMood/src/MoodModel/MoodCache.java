/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodModel;

import java.util.Hashtable;
import java.util.ArrayList;

/**
 *
 * @author tylerperdue
 */
public class MoodCache {
    
    private static Hashtable<Integer, Mood> moodMap = new Hashtable<Integer, Mood>();
    
    public static Mood getMood(int moodId) {
        Mood cachedMood = moodMap.get(moodId);
        System.out.println("MoodCache - getMood method called.");
        return (Mood) cachedMood.clone();
    }
    
    public static ArrayList<Mood> getMoodList() {
        ArrayList<Mood> moodlist = new ArrayList();
        
        for(int i = 0;i <= moodMap.size();i++) {
           Mood cachedMood = moodMap.get(i);
           moodlist.add((Mood) cachedMood.clone());
        }
        System.out.println("MoodCache - getMoodList method called.");
        return moodlist;
    }
    
    public static void loadCache() {
        // Eventually run database query and create Food objects for each
        // For now, just going to use text file
        // Add each shape to Hashtable
        Mood test1 = new Mood(1, "Angry", 10);
        moodMap.put(test1.getId(), test1);
        Mood test2 = new Mood(2, "Sad", 8);
        moodMap.put(test2.getId(), test2);
        System.out.println("MoodCache - loadCache method called.");
    }
    
}