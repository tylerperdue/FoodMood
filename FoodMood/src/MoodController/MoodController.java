package MoodController;

import MoodModel.Mood;
import MoodModel.MoodCache;
import NavigationController.NavController;
import UserProfileModel.User;
import java.util.ArrayList;

/**
 *
 * Last Updated By: Tyler
 */
public class MoodController {
    
    NavController navCntrl;
    
    public MoodController(NavController navCntrl){
        System.out.println("MoodController Class Instantiated.");
        this.navCntrl = navCntrl;
    }
    
    public void createMood(String name, int rating, int foodId){
        Mood mood = new Mood(1, name, rating, "time", User.loggedInUser, foodId);
        MoodCache.addMood(mood);
        System.out.println("MoodController - Successfully created Mood.");
        navCntrl.switchToMoodCntrl();
    }
    
    public ArrayList<Mood> viewMoodList(){
        ArrayList<Mood> listOfMoods = MoodCache.viewMoodList();
        System.out.println("Mood Controller - Successfully viewed MoodList.");
        return listOfMoods;
    }
    
    public Mood getMood(String name, String timestamp){
        Mood mood = MoodCache.getMood(name, timestamp);
        System.out.println("MoodController - Successfully retrieved mood.");
        return mood;
    }
    
    public void updateMood(int id, String name, int rating, int foodId){
        MoodCache.updateMood(id, name, rating, foodId);
        System.out.println("MoodController - Successfully updated Mood.");
        navCntrl.switchToMoodCntrl();
    }
    
    public void deleteMood(String name, String timestamp){
        MoodCache.deleteMood(name, timestamp);
        System.out.println("MoodController - Successfully deleted Mood."); 
    }
}
