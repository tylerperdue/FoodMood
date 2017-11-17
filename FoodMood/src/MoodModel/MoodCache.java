/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodModel;

import DatabaseController.DatabaseController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;

/**
 *
 * @author tylerperdue
 */
public class MoodCache {
    
    private static Hashtable<Integer, Mood> moodMap = new Hashtable<Integer, Mood>();
    
    public static Mood getMood(int moodId) {
        Mood cachedMood = moodMap.get(moodId);
        System.out.println("MoodCache - getMood method called.");
        return (Mood) cachedMood.clone();
    }
    
    public static Hashtable<Integer, Mood> getMoodList() {
        loadCache();
        System.out.println("MoodCache - getMoodList method called.");
        return moodMap;
    }
    
    public static void loadCache() {
        try
        {
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL = "SELECT * FROM MOOD";
          ResultSet rs = stmt.executeQuery(SQL);
          while (rs.next()) {
              int id = rs.getInt("ID");
              String name = rs.getString("NAME");
              int rating = rs.getInt("RATING");
              String timestamp = rs.getString("TIMESTAMP");
              Mood mood = new Mood(id, name, rating, timestamp);
              moodMap.put(mood.getId(), mood);
          }
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: MoodCache - loadCache()");
          System.err.println(e.getMessage());
        }
        System.out.println("MoodCache - loadCache method called.");
    }
    
}