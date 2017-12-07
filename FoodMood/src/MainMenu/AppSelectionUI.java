/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import NavigationController.NavController;
import javax.swing.JFrame;

/**
 *
 * @author Jake
 */
public class AppSelectionUI extends JFrame{
    
    private NavController navCtrl;
    private AppSelectionPanel appSelectionPanel;
    
    public AppSelectionUI(NavController navCtrl){
        this.navCtrl=navCtrl;
        appSelectionPanel = new AppSelectionPanel(navCtrl);
        this.setBounds(0, 0, 400,200);
        this.setTitle("Platform Selection");
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.add(appSelectionPanel);
        this.setVisible(true); 
    }
}
