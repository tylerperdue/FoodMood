/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LoginController;
import java.util.ArrayList;
import UserProfileModel.UserList;
import UserProfileModel.User;
import NavigationController.NavController;
import LoginUI.LoginUI;


/**
 *
 * @author jro5165
 */
public class LoginController {
 
    private NavController navCntrl;
    public LoginUI loginUI;
    public  User currUser;
    
    public LoginController(){
        System.out.println("LoginController Class Instantiated. Test Passed.");
        loginUI = new LoginUI(this);
    }
    
    public void switchToNavCtrl(){
        
        navCntrl = new NavController(this);
        
    }
    
    public boolean authenticate(String username, String password){
        //UserList userlist = new UserList();
        ArrayList<User> listOfUsers = UserList.getUserList();
        
        for(int i = 0; i < listOfUsers.size();  i++){
            if(listOfUsers.get(i).getUsername().equals(username) && listOfUsers.get(i).getPassword().equals(password)){
                currUser = listOfUsers.get(i);
                User.loggedInUser = listOfUsers.get(i).getID();
                System.out.println(listOfUsers.get(i).getID());
                System.out.println(User.loggedInUser);
                System.out.println("LoginController - authenticate(): User Authenticated. Test Passed.");
               return true; 
            }
        }
       return false;
    }
    
    public void createUser(String username, String password, String firstname, String lastname, int age) {
        User user = new User(1, username, password, firstname, lastname, age);
        UserList.addUser(user);
    }
    

    public User getCurrUser(){
        return currUser;
    }
    
    public void closeApp(){
        System.exit(0);
        
    }
    /**
     * @return the navCntrl
     */
    public NavController getNavCntrl() {
        return navCntrl;
    }

    /**
     * @param navCntrl the navCntrl to set
     */
    public void setNavCntrl(NavController navCntrl) {
        this.navCntrl = navCntrl;
    }

    /**
     * @return the loginUI
     */
    public LoginUI getLoginUI() {
        return loginUI;
    }

    /**
     * @param loginUI the loginUI to set
     */
    public void setLoginUI(LoginUI loginUI) {
        this.loginUI = loginUI;
    }

   
}

   
