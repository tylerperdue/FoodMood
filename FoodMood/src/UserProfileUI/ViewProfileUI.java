package UserProfileUI;

import UserProfileController.ProfileController;
import UserProfileModel.User;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * Last Updated By: Tyler
 */
public class ViewProfileUI extends JFrame{
    /**
     * Receives data from ProfileController and displays information to user.
     */
    ProfileController pc;
    User user;
    JFrame viewProfile;
    JButton deleteAccountBtn;
    JTextArea accountInfo;
    
    public ViewProfileUI(){
        System.out.println("ViewProfileUI class instantiated. Test Passed.");
        pc.readAccount();
        
        
    }
    
    
   
}
