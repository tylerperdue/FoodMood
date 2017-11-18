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
import ResearchController.ResearchController;
import UserProfileController.ProfileController;



/**
 *
 * @author jro5165
 */
import LoginUI.LoginPanel;
import LoginUI.LoginUI;
import MainMenu.MainMenuUI;
import MoodUI.MoodPanel;
import RecommendationUI.RecommendationPanel;
import UserProfileUI.crudProfilePanel;
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
    private ResearchController researchCtrl;
    private ProfileController profileCtrl;
    
    private RecommendationPanel recPanel;
    private FoodPanel foodPanel;
    private MoodPanel moodPanel;
    private MainMenuUI mainMenuUI;
    private crudProfilePanel profilePanel;
    public NavController(LoginController loginCtrl){
        System.out.println("NavController Class Instantiated. Test Passed.");
        mainMenuUI = new MainMenuUI(this);
        this.loginCtrl = loginCtrl;
        //this.mainMenuUI = mainMenuUI;
    }
    
    public void switchToMainMenuCtrl(){
         System.out.println("NavController - Switched to Main Menu Controller. Test Passed.");
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
        mainMenuUI.removeMainPanel();
        if(this.moodPanel != null){
        mainMenuUI.remove(this.moodPanel);
        }
        if(this.profilePanel != null){
            mainMenuUI.remove(this.profilePanel);
        }
        if(this.recPanel != null){
            mainMenuUI.remove(this.recPanel);
        }
        foodCtrl = new FoodController(this);
        foodPanel = new FoodPanel(foodCtrl);
        mainMenuUI.add(foodPanel);
        foodPanel.setVisible(true);
        foodPanel.setSize(500, 400);
        mainMenuUI.repaint();
        mainMenuUI.revalidate();
    }
    
    public void switchToMoodCntrl() {
        System.out.println("NavController - Swtiched to Mood Controller. Test Passed.");
        mainMenuUI.removeMainPanel();
        if(this.foodPanel != null){
        mainMenuUI.remove(this.foodPanel);
        }
        if(this.profilePanel != null){
            mainMenuUI.remove(this.profilePanel);
        }
        if(this.recPanel != null){
            mainMenuUI.remove(this.recPanel);
        }
        moodCtrl = new MoodController(this);
        moodPanel = new MoodPanel(moodCtrl);
        mainMenuUI.add(moodPanel);
        moodPanel.setVisible(true);
        moodPanel.setSize(500, 400);
        mainMenuUI.repaint();
        mainMenuUI.revalidate();
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
        mainMenuUI.removeMainPanel();
         if(this.foodPanel != null){
        mainMenuUI.remove(this.foodPanel);
        }
         if(this.moodPanel != null){
        mainMenuUI.remove(this.moodPanel);
        }
         if(this.profilePanel != null){
            mainMenuUI.remove(this.profilePanel);
        }
        recPanel = new RecommendationPanel(recCtrl);
        mainMenuUI.add(recPanel);
        recPanel.setVisible(true);
        recPanel.setSize(500, 400);
        mainMenuUI.repaint();
        mainMenuUI.revalidate();
    }
    
    public void switchToResearchCntrl() {
        System.out.println("NavController - Switched to Research Controller. Test Passed.");
        ResearchController researchCtrl = new ResearchController(this);
    }
    
    public void switchToProfileCntrl() {
        System.out.println("NavController - Switched to Profile Controller. Test Passed.");
        profileCtrl = new ProfileController(this, loginCtrl.currUser);
        mainMenuUI.removeMainPanel();
         if(this.foodPanel != null){
        mainMenuUI.remove(this.foodPanel);
        }
         if(this.moodPanel != null){
        mainMenuUI.remove(this.moodPanel);
        }
         if(this.recPanel != null){
            mainMenuUI.remove(this.recPanel);
        }
        profilePanel = new crudProfilePanel(profileCtrl);
        mainMenuUI.add(profilePanel);
        profilePanel.setVisible(true);
        profilePanel.setSize(500, 400);
        mainMenuUI.repaint();
        mainMenuUI.revalidate();
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
