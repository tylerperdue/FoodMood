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


/**
 *
 * @author jro5165
 */
public class LoginController {
 
    private NavController navCntrl;
   
    
    public LoginController(NavController navCntrl){
        this.navCntrl = navCntrl;
        System.out.println("LoginController Class Instantiated. Test Passed.");
        LoginUI loginUI = new LoginUI(this);
    }
    
    public ArrayList<User> viewUserList(){
        ArrayList<User> listOfUsers = UserList.getUserList();
        System.out.println("FoodController - Successfully viewed FoodList. Test Passed.");
        return listOfUsers;
        
    }
    public boolean authenticate(String username, String password){
        boolean authenticated = false;
        UserList userlist = new UserList();
        ArrayList<User> listOfUsers = UserList.getUserList();
        for(int i = 0; i < listOfUsers.size(); i++){
            if(listOfUsers.get(i).getUsername().equals(username) && listOfUsers.get(i).getPassword().equals(password)){
                System.out.println("LoginController - authenticate(): User Authenticated. Test Passed.");
                getNavCntrl().switchToFoodCntrl();                
                break;
            }
        }
        return authenticated;
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

   
}

   
