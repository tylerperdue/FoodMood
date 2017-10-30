/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginUI;

import LoginController.LoginController;
import UserProfileModel.User;
import UserProfileModel.UserList;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jake
 */
public class LoginPanel extends javax.swing.JPanel {

   

    LoginController loginCtrl;
    UserList userList;
    
    /**
     * Creates new form LoginPanel
     * @param userlist
     * @param loginCtrl
     */
    public LoginPanel(ArrayList<User> userlist, LoginController loginCtrl) {
        System.out.println("LoginPanel Class Instantiated. Test Passed.");
        initComponents();
        this.loginCtrl= loginCtrl; 
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userTextField = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        passwordField = new javax.swing.JTextField();
        createUserButton = new javax.swing.JButton();

        userTextField.setText("User");

        userLabel.setText("Username:");

        passLabel.setText("Password:");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        passwordField.setText("Pass");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        createUserButton.setText("Create New User");
        createUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addGap(18, 18, 18)
                        .addComponent(okButton)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel)
                            .addComponent(passLabel))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(passwordField))
                        .addContainerGap(113, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton)
                    .addComponent(createUserButton))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("OK Button Pressed");
        
        if(loginCtrl.authenticate(userTextField.getText(), passwordField.getText())){
            loginCtrl.getLoginUI().setVisible(false);     
            loginCtrl.switchToNavCtrl();
            loginCtrl.getNavCntrl().switchToMainMenuCtrl();
            
                
                
        }
        else
            JOptionPane.showMessageDialog(new JFrame(), "wrong password you suck. ", "Dialog",
                 JOptionPane.ERROR_MESSAGE);
        
            
            
        }
    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        JFrame newUserUI = new JFrame();
        newUserUI.setBounds(0, 0, 400, 400);
        newUserUI.setTitle("Login");
        newUserUI.setResizable(true);
        newUserUI.setLocationRelativeTo(null);
        //newUserUI.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        JPanel newUserPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        JLabel firstnameLabel = new JLabel("First Name:");
        c.gridx =0;
        c.gridy = 0;
        c.ipadx = 20;
        newUserPanel.add(firstnameLabel, c);
        
        JLabel lastnameLabel = new JLabel("Last Name:");
        c.gridx =0;
        c.gridy = 1;
        c.ipadx = 20;
        newUserPanel.add(lastnameLabel, c);
        
        JLabel usernameLabel = new JLabel("Username:");
        c.gridx =0;
        c.gridy = 2;
        c.ipadx = 20;
        newUserPanel.add(usernameLabel, c);
        
        JLabel passwordLabel = new JLabel("Password:");
        c.gridx =0;
        c.gridy = 3;
        c.ipadx = 20;
        newUserPanel.add(passwordLabel, c);
        
        JLabel ageLabel = new JLabel("Age:");
        c.gridx =0;
        c.gridy = 4;
        c.ipadx = 20;
        newUserPanel.add(ageLabel, c);
        
        JTextField firstnameText = new JTextField("Enter First Name: ");
        c.gridx = 1;
        c.gridy = 0;
        c.ipadx = 20;
        newUserPanel.add(firstnameText, c);
       
        JTextField lastnameText = new JTextField("Enter Last Name: ");
        c.gridx = 1;
        c.gridy = 1;
        newUserPanel.add(lastnameText, c);
        
        JTextField usernameText = new JTextField("Enter Username: ");
        c.gridx = 1;
        c.gridy = 2;
        newUserPanel.add(usernameText, c);

        JTextField passwordText = new JTextField("Enter Password: ");
        c.gridx = 1;
        c.gridy = 3;
        newUserPanel.add(passwordText, c);
        
        JTextField ageText = new JTextField("Enter Age: ");
        c.gridx = 1;
        c.gridy = 4;
        newUserPanel.add(ageText, c);
        
        JButton submitButton = new JButton("Create New User");
        c.gridheight = 5;
        c.insets = new Insets(25,25,25,25);
        c.gridx = 1;
        c.gridy = 5;
        newUserPanel.add(submitButton, c);
      
        
        newUserUI.add(newUserPanel);
        newUserUI.setVisible(true);
        
        
       
      
        


        
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        loginCtrl.closeApp();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

 /**
     * @return the userList
     */
    public UserList getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(UserList userList) {
        this.userList = userList;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createUserButton;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel passLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
