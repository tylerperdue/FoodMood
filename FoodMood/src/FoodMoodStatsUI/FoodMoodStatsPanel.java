/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodStatsUI;

import FoodMoodStatsController.FoodMoodStatsController;

/**
 *
 * @author tylerperdue
 */
public class FoodMoodStatsPanel extends javax.swing.JPanel {

    private FoodMoodStatsController foodMoodStatsCtrl;
    
    /**
     * Creates new form FoodMoodStatsPanel
     */
    public FoodMoodStatsPanel(FoodMoodStatsController foodMoodStatsCtrl) {
        System.out.println("FoodMoodStatsPanel Class Instantiated.");
        this.foodMoodStatsCtrl = foodMoodStatsCtrl;
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

        foodMoodStatsLbl = new javax.swing.JLabel();
        numFoodsLbl = new javax.swing.JLabel();
        avgFoodLbl = new javax.swing.JLabel();
        numMoodsLbl = new javax.swing.JLabel();
        avgMoodLbl = new javax.swing.JLabel();
        avgFoodTypeLbl = new javax.swing.JLabel();
        avgMoodRatingLbl = new javax.swing.JLabel();
        numFoodTxt = new javax.swing.JLabel();
        avgFoodTxt = new javax.swing.JLabel();
        avgFoodTypeTxt = new javax.swing.JLabel();
        numMoodsTxt = new javax.swing.JLabel();
        avgMoodTxt = new javax.swing.JLabel();
        avgMoodRatingTxt = new javax.swing.JLabel();

        foodMoodStatsLbl.setText("Food Mood Stats");

        numFoodsLbl.setText("Number of Foods:");

        avgFoodLbl.setText("Average Food:");

        numMoodsLbl.setText("Number of Moods:");

        avgMoodLbl.setText("Average Mood:");

        avgFoodTypeLbl.setText("Average Food Type:");

        avgMoodRatingLbl.setText("Average Mood Rating:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(foodMoodStatsLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(avgMoodLbl)
                            .addComponent(avgFoodLbl)
                            .addComponent(numFoodsLbl)
                            .addComponent(avgFoodTypeLbl)
                            .addComponent(numMoodsLbl)
                            .addComponent(avgMoodRatingLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numFoodTxt)
                            .addComponent(avgFoodTxt)
                            .addComponent(avgFoodTypeTxt)
                            .addComponent(numMoodsTxt)
                            .addComponent(avgMoodTxt)
                            .addComponent(avgMoodRatingTxt))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(foodMoodStatsLbl)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numFoodsLbl)
                    .addComponent(numFoodTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avgFoodLbl)
                    .addComponent(avgFoodTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avgFoodTypeLbl)
                    .addComponent(avgFoodTypeTxt))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numMoodsLbl)
                    .addComponent(numMoodsTxt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avgMoodLbl)
                    .addComponent(avgMoodTxt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avgMoodRatingLbl)
                    .addComponent(avgMoodRatingTxt))
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avgFoodLbl;
    private javax.swing.JLabel avgFoodTxt;
    private javax.swing.JLabel avgFoodTypeLbl;
    private javax.swing.JLabel avgFoodTypeTxt;
    private javax.swing.JLabel avgMoodLbl;
    private javax.swing.JLabel avgMoodRatingLbl;
    private javax.swing.JLabel avgMoodRatingTxt;
    private javax.swing.JLabel avgMoodTxt;
    private javax.swing.JLabel foodMoodStatsLbl;
    private javax.swing.JLabel numFoodTxt;
    private javax.swing.JLabel numFoodsLbl;
    private javax.swing.JLabel numMoodsLbl;
    private javax.swing.JLabel numMoodsTxt;
    // End of variables declaration//GEN-END:variables
}
