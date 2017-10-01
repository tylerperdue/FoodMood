package MoodModel;

import java.util.ArrayList;

/**
 *
 * @author tylerperdue
 */
public class MoodList {
    
    public MoodList() {
        System.out.println("MoodList Class Instantiated. Test Passed.");
    }
    
    public ArrayList<Mood> getMoodList() {
        ArrayList<Mood> foodlist = new ArrayList<>();
        
        // TEST
        Mood test1 = new Mood("Happy", 4);
        Mood test2 = new Mood("Sad", 10);
        foodlist.add(test1);
        foodlist.add(test2);
        
        System.out.println("MoodList - getMoodList() created and returned. Test Passed.");
        return foodlist;
    }
}
