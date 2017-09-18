package UserProfileController;
import UserProfileModel.User;

/**
 *
 * Last Updated By: Tyler
 */
public class ProfileController {
    public void createAccount(User user){
        /**
         * Accepts a User object and records an entry in the database. 
         */
    }
    public User readAccount(){
        /**
         * Reads and returns a User object from the database. 
         */
        User example = new UserProfileModel.User();
        return example;
    }
    public void updateAccount(User user){
        /**
         * Accepts a User object, parses the database for that user, and updates
         * that record with new user information. 
         */
    }
    public void deleteAccount(User user){
        /**
         * Accepts a User object, parses the database for that user, and deletes
         * that record. 
         */   
    }
}
