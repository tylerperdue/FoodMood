/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodUI;

import MoodController.MoodController;
import MoodModel.Mood;
import javax.swing.JFrame;

/**
 *
 * @author tylerperdue
 */
public class UpdateMoodPanel extends javax.swing.JPanel {

    MoodController moodCtrl;
    JFrame moodUI;
    Mood mood;
    
    
    /**
     * Creates new form UpdateMoodPanel
     */
    public UpdateMoodPanel(MoodController moodCtrl, JFrame moodUI, Mood mood) {
        System.out.println("UpdateMoodPanel Class Instantiated.");
        initComponents();
        this.moodCtrl = moodCtrl;
        this.moodUI = moodUI;
        this.mood = mood;
        addRatingItemsToComboBox(ratingComboBox);
        addNameItemsToComboBox(nameComboBox);
        setSelectedIndexCombobox(nameComboBox, mood.getName());
        setSelectedIndexCombobox(ratingComboBox, Integer.toString(mood.getRating()));
    }
    
    private void addRatingItemsToComboBox(javax.swing.JComboBox typeComboBox){
        String[] options = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(options));
    }
    
    private void addNameItemsToComboBox(javax.swing.JComboBox typeComboBox){
        String[] options = {"Happy", "Energetic", "Mellow", "Peaceful", "Blissful", "Angry", "Restless", "Depressed", "Grumpy", "Tired"};
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(options));
    }
    
    private void setSelectedIndexCombobox(javax.swing.JComboBox comboBox, String type){
        for (int i = 0; i < comboBox.getItemCount(); i++)
        {
            if (comboBox.getItemAt(i).toString().contains (type)) 
            { 
                comboBox.setSelectedIndex(i);
                System.out.println(comboBox.getSelectedItem());
                break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLbl = new javax.swing.JLabel();
        nameComboBox = new javax.swing.JComboBox();
        ratingLbl = new javax.swing.JLabel();
        ratingComboBox = new javax.swing.JComboBox();
        updateMoodBtn = new javax.swing.JButton();

        nameLbl.setText("Mood You're Experiencing");

        nameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ratingLbl.setText("Strength of Mood");

        ratingComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        updateMoodBtn.setText("Update Mood");
        updateMoodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMoodBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLbl)
                    .addComponent(nameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ratingLbl)
                    .addComponent(ratingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(updateMoodBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(nameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(ratingLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(updateMoodBtn)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateMoodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMoodBtnActionPerformed
        String name = nameComboBox.getSelectedItem().toString();
        int rating = Integer.parseInt(ratingComboBox.getSelectedItem().toString());
        moodCtrl.updateMood(mood.getId(),name, rating);
        moodUI.setVisible(false);
    }//GEN-LAST:event_updateMoodBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox nameComboBox;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JComboBox ratingComboBox;
    private javax.swing.JLabel ratingLbl;
    private javax.swing.JButton updateMoodBtn;
    // End of variables declaration//GEN-END:variables
}
