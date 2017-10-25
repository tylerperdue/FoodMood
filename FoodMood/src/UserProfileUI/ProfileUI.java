package UserProfileUI;

import LoginController.LoginController;
import UserProfileController.ProfileController;
import UserProfileModel.User;
import javax.swing.JFrame;

/**
 *
 * Last Updated By: Tyler
 */
public class ProfileUI extends JFrame{
   
    
    ProfileController pc;
    public ProfileUI(ProfileController pc, LoginController loginCtrl){
        System.out.println("CreateProfileUI class instantiated. Test Passed.");
        crudProfilePanel crudProfile = new crudProfilePanel(pc);
        //User user = new User("Test", "Test", "Test", "Test", 1);
        crudProfile.setVisible(true);
       // pc.createAccount(user);
        this.setBounds(0, 0, 420, 450);
        this.setTitle("User Profile");
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.add(crudProfile);
        this.setVisible(true);   
        
    }
}
