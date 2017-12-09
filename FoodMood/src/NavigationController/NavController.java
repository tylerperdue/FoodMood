/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NavigationController;

import ChartController.ChartController;
import ChartUI.ChartPanel;
import CorrelationController.CorrelationController;
import CorrelationUI.CorrelationPanel;
import FoodController.FoodController;
import FoodMoodHistoryController.HistoryController;
import FoodMoodHistoryUI.HistoryPanel;
import FoodMoodStatsController.FoodMoodStatsController;
import FoodMoodStatsUI.FoodMoodStatsPanel;
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
import MainMenu.AnalyticalMenuUI;
import MainMenu.AppSelectionUI;
import MainMenu.MobileMenuUI;
import MoodUI.MoodPanel;
import RecommendationUI.RecommendationPanel;
import UserProfileModel.UserList;
import UserProfileUI.AProfilePanel;

public class NavController {
    
    // Controllers
    private ChartController chartCtrl;
    private CorrelationController correlationCtrl;
    private FoodController foodCtrl;
    private HistoryController historyCtrl;
    private FoodMoodStatsController foodMoodStatsCtrl;
    private LoginController loginCtrl;
    private MoodController moodCtrl;
    private NotificationsController notificationsCtrl;
    private RecommendationController recCtrl;
    private ProfileController profileCtrl;
    
    // UIs
    private AppSelectionUI appSelection;
    private MobileMenuUI mobileMenuUI;
    private AnalyticalMenuUI analyticMenu;
    
    // Panels
    private RecommendationPanel recPanel;
    private FoodPanel foodPanel;
    private MoodPanel moodPanel;
    private FoodMoodStatsPanel foodMoodStatsPanel;
    private AProfilePanel profilePanel;
    private HistoryPanel historyPanel;
    private CorrelationPanel correlationPanel;
    private ChartPanel chartPanel;
    
    
    public NavController(LoginController loginCtrl){
        System.out.println("NavController Class Instantiated.");
        appSelection = new AppSelectionUI(this);
        this.loginCtrl = loginCtrl;
    }
    
    public void switchToMobileMenu(){
        System.out.println("NavController - Switched to Mobile Menu");
        appSelection.setVisible(false);
        mobileMenuUI = new MobileMenuUI(this);
    }
    
    public void switchToAnalyticMenu(){
        System.out.println("NavController - Swtiched to Analytic Menu.");
        appSelection.setVisible(false);
        analyticMenu = new AnalyticalMenuUI(this);
    }
    
    public void switchToFoodCntrl() {
        System.out.println("NavController - Swtiched to Food Controller.");
        mobileMenuUI.removeMainPanel();
        removeOldMobilePanels();
        foodCtrl = new FoodController(this);
        foodPanel = new FoodPanel(foodCtrl);
        mobileMenuUI.add(foodPanel);
        foodPanel.setVisible(true);
        foodPanel.setSize(500, 400);
        mobileMenuUI.repaint();
        mobileMenuUI.revalidate();
    }
    
    public void switchToMoodCntrl() {
        System.out.println("NavController - Swtiched to Mood Controller.");
        mobileMenuUI.removeMainPanel();
        removeOldMobilePanels();
        moodCtrl = new MoodController(this);
        moodPanel = new MoodPanel(moodCtrl);
        mobileMenuUI.add(moodPanel);
        moodPanel.setVisible(true);
        moodPanel.setSize(500, 400);
        mobileMenuUI.repaint();
        mobileMenuUI.revalidate();
    }
    
    public void switchToFoodMoodStatsCntrl() {
        System.out.println("NavController - Switched to Food Mood Stats Controller.");
        mobileMenuUI.removeMainPanel();
        removeOldMobilePanels();
        foodMoodStatsCtrl = new FoodMoodStatsController(this);
        foodMoodStatsPanel = new FoodMoodStatsPanel(foodMoodStatsCtrl);
        mobileMenuUI.add(foodMoodStatsPanel);
        foodMoodStatsPanel.setVisible(true);
        foodMoodStatsPanel.setSize(500, 400);
        mobileMenuUI.repaint();
        mobileMenuUI.revalidate();
    }
    
    public void switchToLoginCntrl() {
        System.out.println("NavController - Switched to Login Controller.");
        LoginController loginCtrl = new LoginController();
        
    }
    
    public void switchToNotificationsCntrl() {
        System.out.println("NavController - Switched to Notifications Controller.");
        NotificationsController notifcationsCtrl = new NotificationsController(this);
    }
    
    public void switchToRecommendationCntrl() {
        System.out.println("NavController - Switched to Recommendation Controller..");
        recCtrl = new RecommendationController(this);
        mobileMenuUI.removeMainPanel();
        removeOldMobilePanels();
        recPanel = new RecommendationPanel(recCtrl);
        mobileMenuUI.add(recPanel);
        recPanel.setVisible(true);
        recPanel.setSize(500, 400);
        mobileMenuUI.repaint();
        mobileMenuUI.revalidate();
    }
    
    
    public void switchToProfileCntrl() {
        System.out.println("NavController - Switched to Profile Controller.");
        profileCtrl = new ProfileController(this, loginCtrl.currUser);
        mobileMenuUI.removeMainPanel();
        removeOldMobilePanels();
        profilePanel = new AProfilePanel(profileCtrl, UserList.getUser());
        mobileMenuUI.add(profilePanel);
        profilePanel.setVisible(true);
        profilePanel.setSize(500, 400);
        mobileMenuUI.repaint();
        mobileMenuUI.revalidate();
    }
    
    public void switchToCorrelationCntrl() {
        System.out.println("NavController - Switched to Correlation Controller.");
        analyticMenu.removeMainPanel();
        removeOldAnalyticPanels();
        correlationCtrl = new CorrelationController(this);
        correlationPanel = new CorrelationPanel(correlationCtrl);
        analyticMenu.add(correlationPanel);
        correlationPanel.setVisible(true);
        correlationPanel.setSize(500, 500);
        analyticMenu.repaint();
        analyticMenu.revalidate();
    }
        
    public void switchToHistoryCntrl() {
        System.out.println("NavController - Switched to History Controller.");
        analyticMenu.removeMainPanel();
        removeOldAnalyticPanels();
        historyCtrl = new HistoryController(this);
        historyPanel = new HistoryPanel(historyCtrl);
        analyticMenu.add(historyPanel);
        historyPanel.setVisible(true);
        historyPanel.setSize(500, 500);
        analyticMenu.repaint();
        analyticMenu.revalidate();
    }
    
    public void switchToChartCntrl() {
        System.out.println("NavController - Switched to Chart Controller.");
        analyticMenu.removeMainPanel();
        removeOldAnalyticPanels();
        chartCtrl = new ChartController(this);
        chartPanel = new ChartPanel(chartCtrl);
        analyticMenu.add(chartPanel);
        chartPanel.setVisible(true);
        chartPanel.setSize(500, 500);
        analyticMenu.repaint();
        analyticMenu.revalidate();
    }
  

    public void removeOldMobilePanels() {
        if(this.foodPanel != null){
            mobileMenuUI.remove(this.foodPanel);
        }
        if(this.profilePanel != null){
            mobileMenuUI.remove(this.profilePanel);
        }
        if(this.moodPanel != null){
            mobileMenuUI.remove(this.moodPanel);
        }
         if(this.recPanel != null){
            mobileMenuUI.remove(this.recPanel);
        }
        if(this.foodMoodStatsPanel != null){
            mobileMenuUI.remove(this.foodMoodStatsPanel);
        }
    }
    
    public void removeOldAnalyticPanels() {
        if(this.historyPanel != null){
            mobileMenuUI.remove(this.historyPanel);
        }
        if(this.correlationPanel != null){
            mobileMenuUI.remove(this.correlationPanel);
        }
        if(this.chartPanel != null){
            mobileMenuUI.remove(this.chartPanel);
        }   
    }
}
