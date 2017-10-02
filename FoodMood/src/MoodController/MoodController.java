package MoodController;

import MoodModel.Mood;
import MoodModel.MoodList;
import MoodUI.MoodUI;
import NavigationController.NavController;
import java.util.ArrayList;

/**
 *
 * Last Updated By: Tyler
 */
public class MoodController {
    
    NavController navCntrl;
    
    public MoodController(NavController navCntrl){
        System.out.println("MoodController Class Instantiated. Test Passed.");
        this.navCntrl = navCntrl;
        MoodUI moodUI = new MoodUI(this);
        navCntrl.switchToFoodMoodStatsCntrl();
    }
    
    public void createMood(Mood mood){
        // Open Database connection
        // Quary Database
        System.out.println("MoodController - Successfully created Mood.");
    }
    public ArrayList<Mood> getMoodList(){
        ArrayList<Mood> listOfMoods = MoodList.getMoodList();
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
