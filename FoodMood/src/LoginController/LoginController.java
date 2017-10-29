/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LoginController;
import FoodModel.Food;
import FoodModel.FoodList;
import java.util.ArrayList;
import UserProfileModel.UserList;
import UserProfileModel.User;
import NavigationController.NavController;
import LoginUI.LoginUI;
import MainMenu.MainMenuPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author jro5165
 */
public class LoginController {
 
    private NavController navCntrl;
    public LoginUI loginUI;
    public  User currUser;
    
    public LoginController(){
        //this.navCntrl = navCntrl;
        System.out.println("LoginController Class Instantiated. Test Passed.");
        loginUI = new LoginUI(this);
    }
    
    public void addUser(User newUser){
       
        UserList.getUserList().add(newUser);
        
        
    }
    
    public void switchToNavCtrl(){
        
        navCntrl = new NavController(this);
        
    }
    public ArrayList<User> viewUserList(){
        ArrayList<User> listOfUsers = UserList.getUserList();
        System.out.println("FoodController - Successfully viewed FoodList. Test Passed.");
        return listOfUsers;
        
    }
    public boolean authenticate(String username, String password){
        boolean authenticated = false;
        //UserList userlist = new UserList();
        ArrayList<User> listOfUsers = UserList.getUserList();
        
        for(int i = 0; i < listOfUsers.size();  i++){
            if(listOfUsers.get(i).getUsername().equals(username) && listOfUsers.get(i).getPassword().equals(password) ){
                authenticated = true;
                currUser = new User(listOfUsers.get(i).getUsername(),listOfUsers.get(i).getPassword(),
                        listOfUsers.get(i).getFirstname(), listOfUsers.get(i).getLastname(),listOfUsers.get(i).getAge());
                System.out.println("LoginController - authenticate(): User Authenticated. Test Passed.");
//                switchToNavCtrl();
//                getNavCntrl().switchToFoodCntrl();  
//                getLoginUI().dispose();
               return authenticated;
                
            }
        }
       return false;
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

   
