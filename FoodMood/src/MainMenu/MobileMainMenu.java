/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import NavigationController.NavController;
import java.awt.Dimension;
import java.awt.Font;
/**
 *
 * @author Jake
 */
public class MobileMainMenu extends javax.swing.JPanel {
        private NavController navCtrl;

    /**
     * Creates new form MobileMainMenu
     */
      @Override
    public Dimension getPreferredSize() {
        return new Dimension(360, 480);
    }
    public MobileMainMenu(NavController navCtrl) {
        this.navCtrl = navCtrl;
        //this.setSize(360,480);
        initComponents();
        welcomeLabel.setFont(new Font("Helvetica", Font.CENTER_BASELINE, 16));
        
    }

    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        foodbutton = new javax.swing.JButton();
        moodButton = new javax.swing.JButton();
        userButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(360, 480));
        setSize(new java.awt.Dimension(360, 480));

        welcomeLabel.setText("Welcome to Food Mood! ");

        foodbutton.setText("Food");
        foodbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodbuttonActionPerformed(evt);
            }
        });

        moodButton.setText("Mood");
        moodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moodButtonActionPerformed(evt);
            }
        });

        userButton.setText("User Profile");
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(foodbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moodButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(welcomeLabel)
                .addGap(41, 41, 41)
                .addComponent(foodbutton)
                .addGap(30, 30, 30)
                .addComponent(moodButton)
                .addGap(35, 35, 35)
                .addComponent(userButton)
                .addContainerGap(248, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed
        navCtrl.switchToProfileCntrl();
    }//GEN-LAST:event_userButtonActionPerformed

    private void foodbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodbuttonActionPerformed
        navCtrl.switchToFoodCntrl();    }//GEN-LAST:event_foodbuttonActionPerformed

    private void moodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moodButtonActionPerformed
        // TODO add your handling code here:
        navCtrl.switchToMoodCntrl();                                           

    }//GEN-LAST:event_moodButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton foodbutton;
    private javax.swing.JButton moodButton;
    private javax.swing.JButton userButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
