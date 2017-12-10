/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmood;

import LoginController.LoginController;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;


/**
 *
 * @author Jake
 */
public class FoodMood {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception e) {
    // If Nimbus is not available, you can set the GUI to another look and feel.
}
        LoginController loginCtrl = new LoginController();
        loginCtrl.authenticate("john", "password");
        
        
    }
    
}
