/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import NavigationController.NavController;

/**
 *
 * @author zlehm
 */
public class MainMenuController {
    
     private final NavController navCtrl;
     public MainMenuUI mainMenuUI;
             
     public MainMenuController(NavController navCtrl){
         
         this.navCtrl = navCtrl;
         MainMenuUI mainMenuUI = new MainMenuUI(navCtrl);
         
     }
}
