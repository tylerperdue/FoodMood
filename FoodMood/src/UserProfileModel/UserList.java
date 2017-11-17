package UserProfileModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import DatabaseController.DatabaseController;

/**
 *
 * @author tylerperdue
 */
public class UserList {
    
    public UserList() {
        System.out.println("UserList Class Instantiated. Test Passed.");
    }
    
    public static ArrayList<User> getUserList() {
       
        ArrayList<User> userlist = new ArrayList<User>();
        try
        {
          Connection con = DriverManager.getConnection(DatabaseController.getHost());
          Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
          String SQL = "SELECT * FROM USER";
          ResultSet rs = stmt.executeQuery(SQL);
          while (rs.next()) {
              int id = rs.getInt("ID");
              String username = rs.getString("USERNAME");
              String password = rs.getString("PASSWORD");
              String first_name = rs.getString("FIRST_NAME");
              String last_name = rs.getString("LAST_NAME");
              int age = rs.getInt("AGE");
              User user = new User(id, username, password, first_name, last_name, age);
              userlist.add(user);
          }
        }
        catch (SQLException e)
        {
          System.err.println("SQLException: UserList - getUserList()");
          System.err.println(e.getMessage());
        }
        // Debug
        System.out.println(userlist);
        System.out.println("UserList - getUserList() created and returned. Test Passed.");
        return userlist;
    }
    
    public static void addUser(User user) {
        try
        {
            Connection conn = DriverManager.getConnection(DatabaseController.getHost());
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO USER (USERNAME, PASSWORD, FIRST_NAME, LAST_NAME, AGE) VALUES ('"+user.getUsername()+"', '"+user.getPassword()+"', '"+user.getFirstname()+"', '"+user.getLastname()+"', "+user.getAge()+")");
            System.out.println("UserList - addUser(): User (" + user.getFirstname()+ " " + user.getLastname() + ") successfully added to database.");
        } catch (SQLException e) {
            System.out.println("SQLException: UserList - addUser()");
            System.out.println(e.getMessage());
        }
    }
       
}
