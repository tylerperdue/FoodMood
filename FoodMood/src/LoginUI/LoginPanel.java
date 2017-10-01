/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginUI;

import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author jro5165
 */
public class LoginPanel extends JPanel {
    public LoginPanel(){
        System.out.println("LoginPanel Class Initialized. Test Passed.");
    }
    
    private class Handler implements ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
