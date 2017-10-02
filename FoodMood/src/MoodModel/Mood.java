package MoodModel;

/**
 *
 * Last Updated By: Tyler
 */
public class Mood {
    String name;
    int rating;
    
    public Mood(String name, int rating){
        System.out.println("Mood Class Instantiated. Test Passed.");
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
   
}
