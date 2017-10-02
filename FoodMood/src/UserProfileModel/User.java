/*
 * The User class is an object class representing End Users.
 */
package UserProfileModel;

/**
 *
 * Last Update By: Tyler
 */
public class User {
    String username;
    String password;
    String firstname;
    String lastname;
    int age;
    
    public User(String username, String password, String firstname, String lastname, int age) {
        
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        System.out.println("User Class Instantiated. Test Passed.");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
