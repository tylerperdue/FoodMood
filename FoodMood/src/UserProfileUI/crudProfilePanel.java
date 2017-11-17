/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserProfileUI;

import FoodModel.Food;
import UserProfileController.ProfileController;
import java.awt.Color;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jake
 */
public class crudProfilePanel extends javax.swing.JPanel {
    
    /**
     * Creates new form crudProfilePanel
     * @param profileCtrl
     * @param loginCtrl
     */
    private final ProfileController profileCtrl;
    DefaultTableModel model = new DefaultTableModel();
    
    public crudProfilePanel(ProfileController profileCtrl) {
        System.out.println("Profile panel");
        this.profileCtrl = profileCtrl;
        
        initComponents();
        notificationsTable.setModel(model);
//        
//        usernameLabel.setFont(new Font("Helvetica", Font.CENTER_BASELINE, 16));
//        passwordLabel.setFont(new Font("Helvetica", Font.CENTER_BASELINE, 16));
//        ageLabel.setFont(new Font("Helvetica", Font.CENTER_BASELINE, 16));
        viewProfileTab.setBackground(Color.LIGHT_GRAY);
        editProfileTab.setBackground(Color.LIGHT_GRAY);
    }
    
    
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profileTabs = new javax.swing.JTabbedPane();
        viewProfileTab = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        editProfileTab = new javax.swing.JPanel();
        editNameLabel = new javax.swing.JLabel();
        editNameButton = new javax.swing.JButton();
        editUsernameLabel = new javax.swing.JLabel();
        editUsernameButton = new javax.swing.JButton();
        editPasswordLabel = new javax.swing.JLabel();
        editPasswordButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        notificationsTab = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        notificationsTable = new javax.swing.JTable();

        nameLabel.setText("Name: " + profileCtrl.getCurrUser().getFirstname() + " " + profileCtrl.getCurrUser().getLastname());

        usernameLabel.setText("Username: " + profileCtrl.getCurrUser().getUsername());

        passwordLabel.setText("Password: " + profileCtrl.getCurrUser().getPassword());

        ageLabel.setText("Age: " + String.valueOf(profileCtrl.currUser.getAge()));

        javax.swing.GroupLayout viewProfileTabLayout = new javax.swing.GroupLayout(viewProfileTab);
        viewProfileTab.setLayout(viewProfileTabLayout);
        viewProfileTabLayout.setHorizontalGroup(
            viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewProfileTabLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(230, 230, 230))
        );
        viewProfileTabLayout.setVerticalGroup(
            viewProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewProfileTabLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(usernameLabel)
                .addGap(26, 26, 26)
                .addComponent(passwordLabel)
                .addGap(26, 26, 26)
                .addComponent(ageLabel)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        profileTabs.addTab("View Profile", viewProfileTab);

        editNameLabel.setText("Name: " + profileCtrl.currUser.getFirstname()
            + " " + profileCtrl.currUser.getLastname());

        editNameButton.setText("Edit Name");
        editNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNameButtonActionPerformed(evt);
            }
        });

        editUsernameLabel.setText("Username: " + profileCtrl.currUser.getUsername());

        editUsernameButton.setText("Edit Username");
        editUsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUsernameButtonActionPerformed(evt);
            }
        });

        editPasswordLabel.setText("Password: " + profileCtrl.currUser.getPassword());

        editPasswordButton.setText("Edit Password");
        editPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPasswordButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Age: " + String.valueOf(profileCtrl.currUser.getAge()));

        jButton1.setText("Edit Age");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editProfileTabLayout = new javax.swing.GroupLayout(editProfileTab);
        editProfileTab.setLayout(editProfileTabLayout);
        editProfileTabLayout.setHorizontalGroup(
            editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editProfileTabLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(editPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(editUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editUsernameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editNameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editPasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        editProfileTabLayout.setVerticalGroup(
            editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editProfileTabLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editNameLabel)
                    .addComponent(editNameButton))
                .addGap(18, 18, 18)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editUsernameLabel)
                    .addComponent(editUsernameButton))
                .addGap(18, 18, 18)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPasswordButton)
                    .addComponent(editPasswordLabel))
                .addGap(18, 18, 18)
                .addGroup(editProfileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        profileTabs.addTab("Edit Profile", editProfileTab);

        notificationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(notificationsTable);

        javax.swing.GroupLayout notificationsTabLayout = new javax.swing.GroupLayout(notificationsTab);
        notificationsTab.setLayout(notificationsTabLayout);
        notificationsTabLayout.setHorizontalGroup(
            notificationsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificationsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );
        notificationsTabLayout.setVerticalGroup(
            notificationsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notificationsTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        profileTabs.addTab("Notifications", notificationsTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profileTabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profileTabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNameButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editNameButtonActionPerformed

    private void editUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUsernameButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editUsernameButtonActionPerformed

    private void editPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPasswordButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPasswordButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton editNameButton;
    private javax.swing.JLabel editNameLabel;
    private javax.swing.JButton editPasswordButton;
    private javax.swing.JLabel editPasswordLabel;
    private javax.swing.JPanel editProfileTab;
    private javax.swing.JButton editUsernameButton;
    private javax.swing.JLabel editUsernameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel notificationsTab;
    private javax.swing.JTable notificationsTable;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTabbedPane profileTabs;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JPanel viewProfileTab;
    // End of variables declaration//GEN-END:variables
}
