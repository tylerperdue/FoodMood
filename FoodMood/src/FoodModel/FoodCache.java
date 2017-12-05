/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodModel;

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
public class FoodCache {
    
    private static Hashtable<Integer, Food> foodMap = new Hashtable<Integer, Food>();
    
    public static Food getFood(String name, String timestamp) {
        System.out.println("FoodCache - getFood() method called.");
        Food food = new Food(1, "TEST", "TEST", "TEST", "TEST", 1);
        try
        {
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL_FIND = "SELECT * FROM FOOD WHERE NAME = '"+name+"'AND TIMESTAMP = '"+timestamp+"';";
          ResultSet rs = stmt.executeQuery(SQL_FIND);
          int id = rs.getInt("ID");
          String name_ = rs.getString("NAME");
          String type = rs.getString("TYPE");
          String description = rs.getString("DESCRIPTION");
          String timestamp_ = rs.getString("TIMESTAMP");
          food  = new Food(id, name_, type, description, timestamp_, User.loggedInUser);
          con.close();
          System.out.println("FoodCache - getFood(): Food (" + name + ") successfully retrieved from database.");
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: FoodCache - getFood()");
          System.err.println(e.getMessage());
        }
        return food;
    }
    
    public static ArrayList<Food> getFoodList() {
        ArrayList<Food> foods = new ArrayList<Food>();
        try
        {
          
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL = "SELECT * FROM FOOD WHERE USER = "+User.loggedInUser+";";
          ResultSet rs = stmt.executeQuery(SQL);
          while (rs.next()) {
              int id = rs.getInt("ID");
              String name = rs.getString("NAME");
              String type = rs.getString("TYPE");
              String description = rs.getString("DESCRIPTION");
              String timestamp = rs.getString("TIMESTAMP");
              int userId = rs.getInt("USER");
              Food food = new Food(id, name, type, description, timestamp, userId);
              foods.add(food);
          }
          con.close();
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: FoodCache - loadCache()");
          System.err.println(e.getMessage());
        }
        return foods;
    }
    
    public static void loadCache() {
        try
        {
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL = "SELECT * FROM FOOD";
          ResultSet rs = stmt.executeQuery(SQL);
          while (rs.next()) {
              int id = rs.getInt("ID");
              String name = rs.getString("NAME");
              String type = rs.getString("TYPE");
              String description = rs.getString("DESCRIPTION");
              String timestamp = rs.getString("TIMESTAMP");
              int userId = rs.getInt("USER");
              Food food = new Food(id, name, type, description, timestamp, userId);
              foodMap.put(food.getId(), food);
          }
          con.close();
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: FoodCache - loadCache()");
          System.err.println(e.getMessage());
        }
        System.out.println("FoodCache - loadCache method called.");
    }
    
    public static void addFood(Food food) {
        try
        {
            Connection conn = DriverManager.getConnection(DatabaseController.getHost());
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO FOOD (NAME, TYPE, DESCRIPTION, TIMESTAMP, USER) VALUES ('"+food.getName()+"', '"+food.getType()+"', '"+food.getDescription()+"', datetime('now', 'localtime'), "+food.getUserId()+")");
            System.out.println("FoodList - addFood(): Food (" + food.getName() + ") successfully added to database.");
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQLException: UserList - addUser()");
            System.out.println(e.getMessage());
        }
    }
    
    public static void deleteFood(String name, String timestamp) {
        System.out.println("FoodCache - deleteFood() method called.");
        try
        {
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL_FIND = "SELECT ID FROM FOOD WHERE NAME = '"+name+"'AND TIMESTAMP = '"+timestamp+"';";
          ResultSet rs = stmt.executeQuery(SQL_FIND);
          int id = rs.getInt("ID");
          System.out.println(id);
          String SQL_DELETE = "DELETE FROM FOOD WHERE ID ="+ id+";";
          stmt.execute(SQL_DELETE);
          System.out.println("FoodList - addFood(): Food (" + name + ") successfully deleted from database.");
          con.close();
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: FoodCache - deleteFood()");
          System.err.println(e.getMessage());
        }
    }
    
    public static void updateFood(int id, String name, String type, String description) {
        System.out.println("FoodCache - updateFood() method called.");
        try
        {
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL = "UPDATE FOOD SET NAME = '"+name+"', TYPE = '"+type+"', DESCRIPTION = '"+description+"' WHERE ID = "+id+";";
          stmt.execute(SQL);
          System.out.println("FoodCache - updateFood(): Food (" + name + ") successfully updated in the database.");
          con.close();
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: FoodCache - updateFood()");
          System.err.println(e.getMessage());
        }
    }
    
}
