package FoodUI;

import FoodController.FoodController;
import FoodModel.Food;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylerperdue
 */
public class UpdateFoodPanel extends javax.swing.JPanel {
    
    FoodController foodCtrl;
    JFrame foodUI;
    Food food;
    
    /**
     * Creates new form UpdateFoodPanel
     */
    public UpdateFoodPanel(FoodController foodCtrl, JFrame foodUI, Food food) {
        System.out.println("UpdateFoodPanel Class Instantiated.");
        initComponents();
        this.foodCtrl = foodCtrl;
        this.foodUI = foodUI;
        addItemsToComboBox(typeComboBox);
        this.food = food;
        nameTxt.setText(food.getName());
        setSelectedIndexCombobox(typeComboBox, food.getType());
        descriptionTxt.setText(food.getDescription());
    }
    
    private void addItemsToComboBox(javax.swing.JComboBox typeComboBox){
        String[] options = {"Fruit", "Vegetable", "Grain", "Junk Food", "Meat", "Other"};
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(options));
    }
    
    private void setSelectedIndexCombobox(javax.swing.JComboBox typeComboBox, String type){
        for (int i = 0; i < typeComboBox.getItemCount(); i++)
        {
            if (typeComboBox.getItemAt(i).toString ().contains (type)) 
            { 
                typeComboBox.setSelectedIndex(i);
                System.out.println(typeComboBox.getSelectedItem());
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
        nameTxt = new javax.swing.JTextField();
        typeLbl = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox();
        descriptionLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTxt = new javax.swing.JTextArea();
        updateFoodBtn = new javax.swing.JButton();

        nameLbl.setText("Name");

        typeLbl.setText("Type");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        descriptionLbl.setText("Description");

        descriptionTxt.setColumns(20);
        descriptionTxt.setRows(5);
        jScrollPane1.setViewportView(descriptionTxt);

        updateFoodBtn.setText("Update Food");
        updateFoodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFoodBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(descriptionLbl)
                    .addComponent(typeLbl)
                    .addComponent(nameLbl)
                    .addComponent(nameTxt)
                    .addComponent(typeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateFoodBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(nameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(typeLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(descriptionLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(updateFoodBtn)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateFoodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFoodBtnActionPerformed
        String name = nameTxt.getText();
        String type = typeComboBox.getSelectedItem().toString();
        String description = descriptionTxt.getText();
        foodCtrl.updateFood(food.getId(),name, type, description);
        foodUI.setVisible(false);
    }//GEN-LAST:event_updateFoodBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionLbl;
    private javax.swing.JTextArea descriptionTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JLabel typeLbl;
    private javax.swing.JButton updateFoodBtn;
    // End of variables declaration//GEN-END:variables
}
