/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodUI;

import FoodController.FoodController;
import FoodModel.Food;
import NavigationController.NavController;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author bryaningram
 */
public class FoodPanel extends javax.swing.JPanel {
    
    FoodController foodCtrl;

    /**
     * Creates new form FoodPanel
     */
      @Override
    public Dimension getPreferredSize() {
        return new Dimension(360, 480);
    }
    public FoodPanel(FoodController foodCtrl) {
        System.out.println("FoodPanel Class Instantiated.");
        this.foodCtrl = foodCtrl;
        initComponents();
        readFoodList();
    }

    public void readFoodList() {
        try {
            ArrayList<Food> foods = foodCtrl.viewFoodList();
            DefaultTableModel model = (DefaultTableModel) foodTable.getModel();
            model.setColumnIdentifiers(new String[]{"Food Consumed", "Type", "Description", "Timestamp"});
            for (int i = 0; i < foods.size(); i++) {
                Food food = foods.get(i);
                String[] data = {food.getName(), food.getType(), food.getDescription(), food.getTimestamp()};
                model.addRow(data);
            }
        } catch (Exception e) {
            System.out.println("Error has occurred in FoodPanel - readFoodList(): " + e);
        }
    }

    private void filter(String sort) {
        DefaultTableModel model = (DefaultTableModel) foodTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        foodTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + sort));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        addFoodBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        filterText = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        jScrollPane1.setViewportView(foodTable);

        addFoodBtn.setText("Add Food");
        addFoodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFoodBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Filter:");

        filterText.setColumns(8);
        filterText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterTextKeyReleased(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addFoodBtn)
                        .addGap(77, 77, 77)
                        .addComponent(refreshBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFoodBtn)
                    .addComponent(refreshBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addFoodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFoodBtnActionPerformed
        JFrame newFoodUI = new JFrame();
        newFoodUI.setBounds(0, 0, 360, 480);
        newFoodUI.setTitle("Add Food");
        newFoodUI.setResizable(true);
        newFoodUI.setLocationRelativeTo(null);
        CreateFoodPanel foodPanel = new CreateFoodPanel(this.foodCtrl, newFoodUI);
        newFoodUI.add(foodPanel);
        newFoodUI.setVisible(true);
    }//GEN-LAST:event_addFoodBtnActionPerformed

    private void filterTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterTextKeyReleased
        String sort = filterText.getText();
        filter(sort);
    }//GEN-LAST:event_filterTextKeyReleased

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int viewIndex = foodTable.getSelectedRow();
        String name = foodTable.getValueAt(viewIndex, 0).toString();
        String timestamp = foodTable.getValueAt(viewIndex, 3).toString();
        foodCtrl.deleteFood(name, timestamp);
        DefaultTableModel model = (DefaultTableModel) foodTable.getModel();
        model.getDataVector().removeAllElements();
        readFoodList();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        JFrame newFoodUI = new JFrame();
        newFoodUI.setBounds(0, 0, 360, 480);
        newFoodUI.setTitle("Update Food");
        newFoodUI.setResizable(true);
        newFoodUI.setLocationRelativeTo(null);
        int viewIndex = foodTable.getSelectedRow();
        String name = foodTable.getValueAt(viewIndex, 0).toString();
        String timestamp = foodTable.getValueAt(viewIndex, 3).toString();
        Food food = foodCtrl.getFood(name, timestamp);
        UpdateFoodPanel foodPanel = new UpdateFoodPanel(this.foodCtrl, newFoodUI, food);
        newFoodUI.add(foodPanel);
        newFoodUI.setVisible(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) foodTable.getModel();
        model.getDataVector().removeAllElements();
        readFoodList();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFoodBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField filterText;
    public javax.swing.JTable foodTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

}
