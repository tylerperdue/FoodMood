package UserProfileUI;

import LoginController.LoginController;
import UserProfileController.ProfileController;
import UserProfileModel.User;
import UserProfileModel.UserList;
import javax.swing.JFrame;

/**
 *
 * Last Updated By: Tyler
 */
public class ProfileUI extends JFrame{
   
    
    ProfileController pc;
    public ProfileUI(ProfileController pc, LoginController loginCtrl){
        System.out.println("ProfileUI Class Instantiated.");
        ProfilePanel crudProfile = new ProfilePanel(pc, UserList.getUser());
        crudProfile.setVisible(true);
        this.setBounds(0, 0, 420, 450);
        this.setTitle("User Profile");
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.add(crudProfile);
        this.setVisible(true);   
        
    }
}
