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
    
    public static Food getFood(int foodId) {
        Food cachedFood = foodMap.get(foodId);
        System.out.println("FoodCache - getFood method called.");
        return (Food) cachedFood.clone();
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
        } catch (SQLException e) {
            System.out.println("SQLException: UserList - addUser()");
            System.out.println(e.getMessage());
        }
    }
    
}
