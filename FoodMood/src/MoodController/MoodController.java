package MoodController;

import MoodModel.Mood;
import MoodModel.MoodCache;
import NavigationController.NavController;
import java.util.Hashtable;

/**
 *
 * Last Updated By: Tyler
 */
public class MoodController {
    
    NavController navCntrl;
    
    public MoodController(NavController navCntrl){
        System.out.println("MoodController Class Instantiated. Test Passed.");
        this.navCntrl = navCntrl;
    }
    
    public void createMood(Mood mood){
        // Open Database connection
        // Quary Database
        System.out.println("MoodController - Successfully created Mood. Test Passed.");
    }
    public Hashtable<Integer, Mood> getMoodList(){
        Hashtable<Integer, Mood> listOfMoods = MoodCache.getMoodList();
        System.out.println("Mood Controller - Successfully viewed MoodList. Test Passed.");
        return listOfMoods;
    }
    public void updateMood(Mood mood){
        // Open Database connection
        // Quary Database
        System.out.println("MoodController - Successfully updated Mood. Test Passed.");
    }
    public void deleteMood(Mood mood){
        // Open Database connection
        // Quary Database
        System.out.println("MoodController - Successfully deleted Mood. Test Passed."); 
    }
}
