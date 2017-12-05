/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NavigationController;

import ChartController.ChartController;
import CorrelationController.CorrelationController;
import FoodController.FoodController;
import FoodMoodHistoryController.HistoryController;
import FoodMoodStatsController.FoodMoodStatsController;
import FoodUI.FoodPanel;
import LoginController.LoginController;
import MoodController.MoodController;
import NotificationsController.NotificationsController;
import RecommendationController.RecommendationController;
import UserProfileController.ProfileController;



/**
 *
 * @author jro5165
 */
import LoginUI.LoginPanel;
import LoginUI.LoginUI;
import MainMenu.AnalyticalMenuUI;
import MainMenu.AppSelectionUI;
import MainMenu.MobileMenuUI;
import MoodUI.MoodPanel;
import RecommendationUI.RecommendationPanel;
import UserProfileUI.crudProfilePanel;
import UserProfileUI.profilePanel;
public class NavController {
    
    private ChartController chartCtrl;
    private CorrelationController correlationCtrl;
    private FoodController foodCtrl;
    private HistoryController historyCtrl;
    private FoodMoodStatsController foodMoodStatsCtrl;
    private final LoginController loginCtrl;
    private MoodController moodCtrl;
    private NotificationsController notificationsCtrl;
    private RecommendationController recCtrl;
    private ProfileController profileCtrl;
    private AppSelectionUI appSelection;
    private RecommendationPanel recPanel;
    private FoodPanel foodPanel;
    private MoodPanel moodPanel;
    private MobileMenuUI mobileMenuUI;
    private AnalyticalMenuUI analyticMenu;
    
    
    //private crudProfilePanel profilePanel;
    private profilePanel proPanel;
    public NavController(LoginController loginCtrl){
        System.out.println("NavController Class Instantiated. Test Passed.");
        appSelection = new AppSelectionUI(this);
        this.loginCtrl = loginCtrl;
        //this.mainMenuUI = mainMenuUI;
    }
    
    public void switchToMobileMenu(){
         appSelection.setVisible(false);
         mobileMenuUI = new MobileMenuUI(this);
    }
    
    public void switchToAnalyticMenu(){
        appSelection.setVisible(false);
        analyticMenu = new AnalyticalMenuUI(this);
    }
    
    public void switchToChartCntrl() {
        System.out.println("NavController - Switched to Chart Controller. Test Passed.");
        ChartController chartCtrl = new ChartController(this);
    }
    
    public void switchToCorrelationCntrl() {
        System.out.println("NavController - Switched to Correlation Controller. Test Passed.");
        CorrelationController correlationCtrl = new CorrelationController(this);
    }
    
    //Controller is instantiated in MainMenuUI
    public void switchToFoodCntrl() {
        mobileMenuUI.removeMainPanel();
        if(this.moodPanel != null){
        mobileMenuUI.remove(this.moodPanel);
        }
        if(this.proPanel != null){
            mobileMenuUI.remove(this.proPanel);
        }
        if(this.recPanel != null){
            mobileMenuUI.remove(this.recPanel);
        }
        foodCtrl = new FoodController(this);
        foodPanel = new FoodPanel(foodCtrl);
        mobileMenuUI.add(foodPanel);
        foodPanel.setVisible(true);
        foodPanel.setSize(500, 400);
        mobileMenuUI.repaint();
        mobileMenuUI.revalidate();
    }
    
    public void switchToMoodCntrl() {
        System.out.println("NavController - Swtiched to Mood Controller. Test Passed.");
        mobileMenuUI.removeMainPanel();
        if(this.foodPanel != null){
        mobileMenuUI.remove(this.foodPanel);
        }
        if(this.proPanel != null){
            mobileMenuUI.remove(this.proPanel);
        }
        if(this.recPanel != null){
            mobileMenuUI.remove(this.recPanel);
        }
        moodCtrl = new MoodController(this);
        moodPanel = new MoodPanel(moodCtrl);
        mobileMenuUI.add(moodPanel);
        moodPanel.setVisible(true);
        moodPanel.setSize(500, 400);
        mobileMenuUI.repaint();
        mobileMenuUI.revalidate();
    }
    
    public void switchToHistoryCntrl() {
        System.out.println("NavController - Switched to History Controller. Test Passed.");
        HistoryController historyCtrl = new HistoryController(this);
    }
    
    public void switchToFoodMoodStatsCntrl() {
        System.out.println("NavController - Switched to Food Mood Stats Controller. Test Passed.");
        FoodMoodStatsController foodMoodStatsCtrl = new FoodMoodStatsController(this);
    }
    
    public void switchToLoginCntrl() {
        System.out.println("NavController - Switched to Login Controller. Test Passed.");
        LoginController loginCtrl = new LoginController();
        
    }
    
    public void switchToNotificationsCntrl() {
        System.out.println("NavController - Switched to Notifications Controller. Test Passed.");
        NotificationsController notifcationsCtrl = new NotificationsController(this);
    }
    
    public void switchToRecommendationCntrl() {
        System.out.println("NavController - Switched to Recommendation Controller. Test Passed.");
        recCtrl = new RecommendationController(this);
        mobileMenuUI.removeMainPanel();
         if(this.foodPanel != null){
        mobileMenuUI.remove(this.foodPanel);
        }
         if(this.moodPanel != null){
        mobileMenuUI.remove(this.moodPanel);
        }
         if(this.proPanel != null){
            mobileMenuUI.remove(this.proPanel);
        }
        recPanel = new RecommendationPanel(recCtrl);
        mobileMenuUI.add(recPanel);
        recPanel.setVisible(true);
        recPanel.setSize(500, 400);
        mobileMenuUI.repaint();
        mobileMenuUI.revalidate();
    }
    
    
    public void switchToProfileCntrl() {
        System.out.println("NavController - Switched to Profile Controller. Test Passed.");
        profileCtrl = new ProfileController(this, loginCtrl.currUser);
        mobileMenuUI.removeMainPanel();
         if(this.foodPanel != null){
        mobileMenuUI.remove(this.foodPanel);
        }
         if(this.moodPanel != null){
        mobileMenuUI.remove(this.moodPanel);
        }
         if(this.recPanel != null){
            mobileMenuUI.remove(this.recPanel);
        }
        proPanel = new profilePanel(profileCtrl);
        mobileMenuUI.add(proPanel);
        proPanel.setVisible(true);
        proPanel.setSize(500, 400);
        mobileMenuUI.repaint();
        mobileMenuUI.revalidate();
    }

    /**
     * @return the foodCtrl
     */
    public FoodController getFoodCtrl() {
        return foodCtrl;
    }

    /**
     * @param foodCtrl the foodCtrl to set
     */
    public void setFoodCtrl(FoodController foodCtrl) {
        this.foodCtrl = foodCtrl;
    }
}
