package UserProfileUI;

import UserProfileController.ProfileController;
import UserProfileModel.User;
import javax.swing.JFrame;

/**
 *
 * Last Updated By: Tyler
 */
public class CreateProfileUI extends JFrame{
   
    
    ProfileController pc;
    public CreateProfileUI(ProfileController pc){
        System.out.println("CreateProfileUI class instantiated. Test Passed.");
        CreateProfilePanel createPanel = new CreateProfilePanel();
        
        User user = new User("Test", "Test", "Test", "Test", 1);
        this.add(createPanel);
        pc.createAccount(user);
        
        
    }
}
