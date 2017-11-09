/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseController;

/**
 *
 * @author tylerperdue
 */
public class DatabaseController {
    final static String host = "jdbc:derby://localhost:1527/FoodMood";
    final static String username = "ist412";
    final static String password = "ist412";
    
    public static String getHost() {
        return host;
    }
    public static String getUsername() {
        return username;
    }
    public static String getPassword() {
        return password;
    }
    
}
