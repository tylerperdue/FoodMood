/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import NavigationController.NavController;
import java.awt.Font;

/**
 *
 * @author tylerperdue
 */
public class AnalyticMainMenuPanel extends javax.swing.JPanel {
    private NavController navCtrl;
    /**
     * Creates new form MainMenuPane
     */
    public AnalyticMainMenuPanel(NavController navCtrl) {
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

        titleLbl = new javax.swing.JLabel();
        historyBtn = new javax.swing.JButton();
        correlationBtn = new javax.swing.JButton();
        chartBtn = new javax.swing.JButton();

        titleLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titleLbl.setText("Welcome to Food Mood!");

        historyBtn.setText("History");
        historyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtnActionPerformed(evt);
            }
        });

        correlationBtn.setText("Correlation");
        correlationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correlationBtnActionPerformed(evt);
            }
        });

        chartBtn.setText("Chart");
        chartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correlationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLbl))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(titleLbl)
                .addGap(103, 103, 103)
                .addComponent(historyBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(correlationBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chartBtn)
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void historyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtnActionPerformed
        navCtrl.switchToHistoryCntrl();
    }//GEN-LAST:event_historyBtnActionPerformed

    private void correlationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correlationBtnActionPerformed
        navCtrl.switchToCorrelationCntrl();
    }//GEN-LAST:event_correlationBtnActionPerformed

    private void chartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartBtnActionPerformed
        navCtrl.switchToChartCntrl();
    }//GEN-LAST:event_chartBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chartBtn;
    private javax.swing.JButton correlationBtn;
    private javax.swing.JButton historyBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
