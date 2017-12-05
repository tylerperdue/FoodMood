/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodModel;

import DatabaseController.DatabaseController;
import UserProfileModel.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author tylerperdue
 */
public class MoodCache {
    
    private static Hashtable<Integer, Mood> moodMap = new Hashtable<Integer, Mood>();
    
    public static Mood getMood(String name, String timestamp) {
        System.out.println("FoodCache - getFood() method called.");
        Mood mood = new Mood(1, "TEST", 1, "TEST", 1);
        try
        {
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL_FIND = "SELECT * FROM MOOD WHERE NAME = '"+name+"'AND TIMESTAMP = '"+timestamp+"';";
          ResultSet rs = stmt.executeQuery(SQL_FIND);
          int id = rs.getInt("ID");
          String name_ = rs.getString("NAME");
          int rating = rs.getInt("RATING");
          String timestamp_ = rs.getString("TIMESTAMP");
          mood  = new Mood(id, name_, rating, timestamp_, User.loggedInUser);
          con.close();
          System.out.println("MoodCache - getMood(): Mood (" + name + ") successfully retrieved from database.");
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: MoodCache - getMood()");
          System.err.println(e.getMessage());
        }
        return mood;
    }
    
    public static Hashtable<Integer, Mood> getMoodList() {
        loadCache();
        System.out.println("MoodCache - getMoodList method called.");
        return moodMap;
    }
    
    public static ArrayList<Mood> viewMoodList() {
        ArrayList<Mood> moods = new ArrayList<Mood>();
        try
        {
          
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL = "SELECT * FROM MOOD WHERE USER = "+User.loggedInUser+";";
          ResultSet rs = stmt.executeQuery(SQL);
          while (rs.next()) {
              int id = rs.getInt("ID");
              String name = rs.getString("NAME");
              int rating = rs.getInt("RATING");
              String timestamp = rs.getString("TIMESTAMP");
              int userId = rs.getInt("USER");
              Mood mood = new Mood(id, name, rating, timestamp, userId);
              moods.add(mood);
          }
          con.close();
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: MoodCache - loadCache()");
          System.err.println(e.getMessage());
        }
        return moods;
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
              int userId = rs.getInt("USER");
              Mood mood = new Mood(id, name, rating, timestamp, userId);
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
    
    public static void addMood(Mood mood) {
        try
        {
            Connection conn = DriverManager.getConnection(DatabaseController.getHost());
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO MOOD (NAME, RATING, TIMESTAMP, USER) VALUES ('"+mood.getName()+"', "+mood.getRating()+", datetime('now', 'localtime'), "+mood.getUserId()+")");
            System.out.println("MoodCache - addMood(): Mood (" + mood.getName() + ") successfully added to database.");
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQLException: MoodCache - addMood()");
            System.out.println(e.getMessage());
        }
    }
    
    public static void deleteMood(String name, String timestamp) {
        System.out.println("MoodCache - deleteMood() method called.");
        try
        {
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL_FIND = "SELECT ID FROM MOOD WHERE NAME = '"+name+"'AND TIMESTAMP = '"+timestamp+"';";
          ResultSet rs = stmt.executeQuery(SQL_FIND);
          int id = rs.getInt("ID");
          String SQL_DELETE = "DELETE FROM MOOD WHERE ID ="+ id+";";
          stmt.execute(SQL_DELETE);
          System.out.println("MoodCache - deleteMood(): Mood (" + name + ") successfully deleted from database.");
          con.close();
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: MoodCache - deleteMood()");
          System.err.println(e.getMessage());
        }
    }
    
    public static void updateMood(int id, String name, int rating) {
        System.out.println("MoodCache - updateMood() method called.");
        try
        {
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL = "UPDATE MOOD SET NAME = '"+name+"', RATING = "+rating+" WHERE ID = "+id+";";
          stmt.execute(SQL);
          System.out.println("MoodCache - updateMood(): Mood (" + name + ") successfully updated in the database.");
          con.close();
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: MoodCache - updateMood()");
          System.err.println(e.getMessage());
        }
    }
    
}