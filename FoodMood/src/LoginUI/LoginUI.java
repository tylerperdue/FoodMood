/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginUI;

import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 *
 * @author jro5165
 */
public class LoginUI extends JFrame {

    public LoginUI() {
        System.out.println("LoginUI Class Instantiated. Test Passed.");
        LoginPanel loginPanel = new LoginPanel();
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.add(loginPanel);
    }
}
