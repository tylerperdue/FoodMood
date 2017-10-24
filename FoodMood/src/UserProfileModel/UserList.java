package UserProfileModel;

import java.util.ArrayList;

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
        
        // TEST
        User test1 = new User("john", "password", "John", "Doe", 45);
        User test2 = new User("jane", "foobar", "Jane", "Doe", 45);
        userlist.add(test1);
        userlist.add(test2);
        
        System.out.println("UserList - getUserList() created and returned. Test Passed.");
        return userlist;
    }
}
