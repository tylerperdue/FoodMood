/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodStatsUI;

import DatabaseController.DatabaseController;
import FoodModel.Food;
import FoodMoodStatsController.FoodMoodStatsController;
import MoodController.MoodController;
import MoodModel.Mood;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bryaningram
 */
public class FoodMoodStatsPanel extends javax.swing.JPanel {

    Food food;
    Mood mood;
    /**
     * Creates new form FoodMoodStatsPanel
     */
    public FoodMoodStatsPanel(FoodMoodStatsController foodMoodCntrl) {
        System.out.println("FoodMoodStatsPanel Class Instantiated.");
        initComponents();
        readFoodStatList();
        readMoodStatList();
        avgFood.setText("Hoopla");
    }

    public void readFoodStatList() {
        try
        {
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL = "SELECT NAME FROM FOOD GROUP BY NAME ORDER BY COUNT(*) DESC LIMIT 1";
          ResultSet rs = stmt.executeQuery(SQL);
          while (rs.next()) {
              String foodName = rs.getString("NAME");
              avgFood.setText(foodName);
          }
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: FoodMoodStats - readFoodStatList()");
          System.err.println(e.getMessage());
        }
    }
    
//    public void readFoodStatList() {
//        HashMap<String, Integer> foods = new HashMap<>();
//        try {
//            FileReader food = new FileReader("Foods.txt");
//            BufferedReader foodBr = new BufferedReader(food);
//            String line = foodBr.readLine();
//            while (line != null) {
//                String[] string = line.toLowerCase().split("/");
//                for (String word : string) {
//                    if (foods.containsKey(word)) {
//                        foods.put(word, foods.get(word) + 1);
//                    } else {
//                        foods.put(word, 1);
//                    }
//                }
//                line = foodBr.readLine();
//            }
//            String mostRepeated = null;
//            int count = 0;
//            Set<Entry<String, Integer>> entrySet = foods.entrySet();
//            for (Entry<String, Integer> entry : entrySet) {
//                if (entry.getValue() > count) {
//                    mostRepeated = entry.getKey();
//                    count = entry.getValue();
//                }
//            }
//            avgFood.setText(mostRepeated);
//            foodBr.close();
//            food.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    
    public void readMoodStatList() {
        try
        {
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL = "SELECT NAME FROM MOOD GROUP BY NAME ORDER BY COUNT(*) DESC LIMIT 1";
          ResultSet rs = stmt.executeQuery(SQL);
          while (rs.next()) {
              String moodName = rs.getString("NAME");
              avgMood.setText(moodName);
          }
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: FoodMoodStats - readMoodStatList()");
          System.err.println(e.getMessage());
        }
    }
    
//    public void readMoodStatLists() {
//        HashMap<String, Integer> moods = new HashMap<>();
//        try {
//            FileReader mood = new FileReader("Moods.txt");
//            BufferedReader moodBr = new BufferedReader(mood);
//            String line = moodBr.readLine();
//            while (line != null) {
//                String[] string = line.toLowerCase().split("/");
//                for (String word : string) {
//                    if (moods.containsKey(word)) {
//                        moods.put(word, moods.get(word) + 1);
//                    } else {
//                        moods.put(word, 1);
//                    }
//                }
//                line = moodBr.readLine();
//            }
//            String mostRepeated = null;
//            int count = 0;
//            Set<Entry<String, Integer>> entrySet = moods.entrySet();
//            for (Entry<String, Integer> entry : entrySet) {
//                if (entry.getValue() > count) {
//                    mostRepeated = entry.getKey();
//                    count = entry.getValue();
//                }
//            }
//            avgMood.setText(mostRepeated);
//            moodBr.close();
//            mood.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        avgFood = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        avgMood = new javax.swing.JLabel();

        jLabel1.setText("Average Food Consumed:");

        jLabel2.setText("Average Mood:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(avgFood))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(avgMood))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(avgFood)
                .addGap(18, 18, 18)
                .addComponent(avgMood)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avgFood;
    private javax.swing.JLabel avgMood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
