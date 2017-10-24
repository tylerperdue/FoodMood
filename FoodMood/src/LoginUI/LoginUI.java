/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginUI;

import LoginController.LoginController;
import UserProfileModel.UserList;
import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 *
 * @author jro5165
 */
public class LoginUI extends JFrame {

    public LoginUI(LoginController loginCtrl) {
        System.out.println("LoginUI Class Instantiated. Test Passed.");
        LoginPanel loginPanel = new LoginPanel(UserList.getUserList(), loginCtrl);
        this.setBounds(0, 0, 485, 205);
        this.setTitle("Login");
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.add(loginPanel);
        this.setVisible(true);   
    }
}
