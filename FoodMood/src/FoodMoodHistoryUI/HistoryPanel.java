/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodHistoryUI;

import DatabaseController.DatabaseController;
import FoodMoodHistoryController.HistoryController;
import UserProfileModel.User;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bryaningram
 */
public class HistoryPanel extends javax.swing.JPanel {

    private HistoryController historyCtrl;
    
    /**
     * Creates new form HistoryPanel
     */
    public HistoryPanel(HistoryController historyCtrl) {
        this.historyCtrl = historyCtrl;
        initComponents();
        readFoodHistoryList();
    }

    /**
     * Reads from database and writes to JTable
     */
    public void readFoodHistoryList() {
        try {
            Connection con = DriverManager.getConnection(DatabaseController.getHost());
            Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            String SQL = "SELECT FOOD.NAME AS FOODNAME, MOOD.NAME AS MOODNAME FROM FOOD, MOOD WHERE FOOD.USER = "+User.loggedInUser+" AND MOOD.USER = "+User.loggedInUser+" AND MOOD.FOOD = FOOD.ID;";
            ResultSet rs = stmt.executeQuery(SQL);
            DefaultTableModel model = (DefaultTableModel) historyTable.getModel();
            while (rs.next()) {
                String foodName = rs.getString("FOODNAME");
                String moodName = rs.getString("MOODNAME");
                String[] data = {foodName, moodName};
                model.addRow(data);
            }
        } catch (SQLException e) {
            System.err.println("SQLException: History - readFoodHistoryList()");
            System.err.println(e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser1.setDate(new Date());
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser1.addPropertyChangeListener("date", new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                Date date = (Date)evt.getNewValue();
                jDateChooser2.setMinSelectableDate(date);
            }
        });

        jLabel1.setText("From:");

        jLabel2.setText("To:");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food", "Mood"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(historyTable);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setMinSelectableDate(jDateChooser1.getDate());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        Timestamp time1 = new Timestamp(jDateChooser1.getDate().getTime());
        Timestamp time2 = new Timestamp(jDateChooser2.getDate().getTime());
        DefaultTableModel model = (DefaultTableModel) historyTable.getModel();
        if (jDateChooser1.getDate() == null || jDateChooser2.getDate() == null) {
            System.out.println("Enter both dates to search");
        } else {
            model.setRowCount(0);
            try {
                Connection con = DriverManager.getConnection(DatabaseController.getHost());
                Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                String SQL = "SELECT FOOD.NAME AS FOODNAME, MOOD.NAME AS MOODNAME FROM FOOD, MOOD WHERE FOOD.TIMESTAMP >= '" + time1 + "' AND FOOD.TIMESTAMP <= '" + time2 + "' AND FOOD.USER = "+User.loggedInUser+" AND MOOD.USER = "+User.loggedInUser+" AND MOOD.FOOD = FOOD.ID;";
                ResultSet rs = stmt.executeQuery(SQL);
                while (rs.next()) {
                    String foodName = rs.getString("FOODNAME");
                    String moodName = rs.getString("MOODNAME");
                    String[] data = {foodName, moodName};
                    model.addRow(data);
                }
            } catch (SQLException e) {
                System.err.println("SQLException: History - searchBtnActionPerformed()");
                System.err.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable historyTable;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
