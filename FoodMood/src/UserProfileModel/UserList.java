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
    
    public ArrayList<User> getUserlist() {
        ArrayList<User> userlist = new ArrayList<User>();
        User test1 = new User("john", "password", "John", "Doe", 45);
        User test2 = new User("jane", "foobar", "Jane", "Doe", 45);
        userlist.add(test1);
        userlist.add(test2);
        System.out.println("UserList - getUserList() created and returned. Test Passed.");
        return userlist;
    }
}
