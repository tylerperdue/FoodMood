package UserProfileController;
import LoginController.LoginController;
import NavigationController.NavController;
import UserProfileModel.User;
import UserProfileModel.UserList;

/**
 *
 * Last Updated By: Tyler
 */
public class ProfileController {
    NavController navCtrl;
    LoginController loginCtrl;
    public User currUser;
    
    public ProfileController(NavController navCntrl, User currUser){
        System.out.println("ProfileController class Instantiated.");
        this.navCtrl = navCntrl;
        this.currUser = currUser;
    }
    public void createAccount(User user){
        /**
         * Accepts a User object and records an entry in the database. 
         */
        //Open DB Connection
        //Query
        System.out.println("Profile Controller - User account created.");
    }
    public User readAccount(){
        /**
         * Reads and returns a User object from the database. 
         */
        //Open DB Connection
        //Query to read target user account
        User example = new User(1, "john", "password", "John", "Doe", 45);
        System.out.println("Profile Controller - User account read.");
        return example;
    }
    
    public void updateAccount(String firstname, String lastname, String username, String password, int age){
        /**
         * Accepts a User object, parses the database for that user, and updates
         * that record with new user information. 
         */
        UserList.updateUser(firstname, lastname, username, password, age);
        System.out.println("Profile Controller - Account updated.");
        navCtrl.switchToProfileCntrl();
    }
    public void deleteAccount(User user){
        /**
         * Accepts a User object, parses the database for that user, and deletes
         * that record. 
         */   
        System.out.println("Profile Controller - Account deleted successfully.");
    }

    /**
     * @return the currUser
     */
    public User getCurrUser() {
        return currUser;
    }

    /**
     * @param currUser the currUser to set
     */
    public void setCurrUser(User currUser) {
        this.currUser = currUser;
    }
}
