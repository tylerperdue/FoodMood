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
    final static String host = "jdbc:sqlite:foodmood.db";
    
    public static String getHost() {
        return host;
    }   
}
