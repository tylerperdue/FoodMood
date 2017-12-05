/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodUI;

import MoodController.MoodController;
import MoodModel.Mood;
import NavigationController.NavController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author bryaningram
 */
public class MoodPanel extends javax.swing.JPanel {

    NavController navCtrl;
    MoodController moodCtrl;

    /**
     * Creates new form FoodPanel
     */
    public MoodPanel(MoodController moodCtrl) {
        System.out.println("MoodPanel Class Instantiated.");
        this.moodCtrl = moodCtrl;
        initComponents();
        readMoodList();
    }

    public void readMoodList() {
        try {
            ArrayList<Mood> moods = moodCtrl.viewMoodList();
            DefaultTableModel model = (DefaultTableModel) moodTable.getModel();
            model.setColumnIdentifiers(new String[]{"Mood", "Rating", "Timestamp"});
            for (int i = 0; i < moods.size(); i++) {
                Mood mood = moods.get(i);
                String[] data = {mood.getName(), Integer.toString(mood.getRating()), mood.getTimestamp()};
                model.addRow(data);
            }
        } catch (Exception e) {
            System.out.println("Error has occurred in MoodPanel - readMoodList(): " + e);
        }
    }

    private void filter(String sort) {
        DefaultTableModel model = (DefaultTableModel) moodTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        moodTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(sort));
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
        moodTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        filterText = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        addMoodBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        moodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mood Consumed", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(moodTable);

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

        addMoodBtn.setText("Add Mood");
        addMoodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMoodBtnActionPerformed(evt);
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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addMoodBtn)
                        .addGap(59, 59, 59)
                        .addComponent(refreshBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMoodBtn)
                    .addComponent(refreshBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(filterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void filterTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterTextKeyReleased
        String sort = filterText.getText();
        filter(sort);
    }//GEN-LAST:event_filterTextKeyReleased

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int viewIndex = moodTable.getSelectedRow();
        String name = moodTable.getValueAt(viewIndex, 0).toString();
        String timestamp = moodTable.getValueAt(viewIndex, 2).toString();
        moodCtrl.deleteMood(name, timestamp);
        DefaultTableModel model = (DefaultTableModel) moodTable.getModel();
        model.getDataVector().removeAllElements();
        readMoodList();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        JFrame newMoodUI = new JFrame();
        newMoodUI.setBounds(0, 0, 360, 480);
        newMoodUI.setTitle("Update Mood");
        newMoodUI.setResizable(true);
        newMoodUI.setLocationRelativeTo(null);
        int viewIndex = moodTable.getSelectedRow();
        String name = moodTable.getValueAt(viewIndex, 0).toString();
        String timestamp = moodTable.getValueAt(viewIndex, 2).toString();
        Mood mood = moodCtrl.getMood(name, timestamp);
        UpdateMoodPanel moodPanel = new UpdateMoodPanel(this.moodCtrl, newMoodUI, mood);
        newMoodUI.add(moodPanel);
        newMoodUI.setVisible(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) moodTable.getModel();
        model.getDataVector().removeAllElements();
        readMoodList();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void addMoodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMoodBtnActionPerformed
        JFrame newMoodUI = new JFrame();
        newMoodUI.setBounds(0, 0, 360, 480);
        newMoodUI.setTitle("Add Mood");
        newMoodUI.setResizable(true);
        newMoodUI.setLocationRelativeTo(null);
        CreateMoodPanel moodPanel = new CreateMoodPanel(this.moodCtrl, newMoodUI);
        newMoodUI.add(moodPanel);
        newMoodUI.setVisible(true);
    }//GEN-LAST:event_addMoodBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMoodBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField filterText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable moodTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

}
