package UserProfileController;
import NavigationController.NavController;
import UserProfileModel.User;
import UserProfileUI.CreateProfileUI;

/**
 *
 * Last Updated By: Tyler
 */
public class ProfileController {
    NavController navCtrl;
   
    public ProfileController(NavController navCntrl){
        System.out.println("ProfileController class Instantiated. Test Passed.");
        this.navCtrl = navCtrl;
        CreateProfileUI createProfileUI = new CreateProfileUI(this);
        navCtrl.switchToProfileCntrl();
        
    }
    public void createAccount(User user){
        /**
         * Accepts a User object and records an entry in the database. 
         */
        //Open DB Connection
        //Query
        System.out.println("Profile Controller - User account created");
    }
    public User readAccount(){
        /**
         * Reads and returns a User object from the database. 
         */
        //Open DB Connection
        //Query to read target user account
        User example = new User("john", "password", "John", "Doe", 45);
        System.out.println("Profile Controller - User account read");
        return example;
    }
    
    public void updateAccount(User user){
        /**
         * Accepts a User object, parses the database for that user, and updates
         * that record with new user information. 
         */
        System.out.println("Profile Controller - Account updated");
    }
    public void deleteAccount(User user){
        /**
         * Accepts a User object, parses the database for that user, and deletes
         * that record. 
         */   
        System.out.println("Profile Controller - Account deleted successfully");
    }
}
