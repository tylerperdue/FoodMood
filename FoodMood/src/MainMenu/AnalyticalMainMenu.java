/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import NavigationController.NavController;

/**
 *
 * @author Jake
 */
public class AnalyticalMainMenu extends javax.swing.JPanel {
    private NavController navCtrl;
    /**
     * Creates new form MainMenuPane
     */
    public AnalyticalMainMenu(NavController navCtrl) {
        this.setSize(500, 500);
        this.navCtrl = navCtrl;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        historyButton = new javax.swing.JButton();
        correlationButton = new javax.swing.JButton();
        chartButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        historyButton.setText("History");
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        correlationButton.setText("Correlation");
        correlationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correlationButtonActionPerformed(evt);
            }
        });

        chartButton.setText("Chart");
        chartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Food Mood Analytical");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(correlationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(historyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(historyButton)
                .addGap(18, 18, 18)
                .addComponent(correlationButton)
                .addGap(18, 18, 18)
                .addComponent(chartButton)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        // TODO add your handling code here:
        navCtrl.switchToHistoryCntrl();
    }//GEN-LAST:event_historyButtonActionPerformed

    private void correlationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correlationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correlationButtonActionPerformed

    private void chartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chartButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chartButton;
    private javax.swing.JButton correlationButton;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
