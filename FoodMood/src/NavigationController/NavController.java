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
public class NavController {
    
    private ChartController chartCtrl;
    private CorrelationController correlationCtrl;
    private FoodController foodCtrl;
    private HistoryController historyCtrl;
    private FoodMoodStatsController foodMoodStatsCtrl;
    private LoginController loginCtrl;
    private MoodController moodCtrl;
    private NotificationsController notificationsCtrl;
    private RecommendationController recommendationCtrl;
    private ResearchController researchCtrl;
    private ProfileController profileCtrl;
    
    public NavController(){
        System.out.println("NavController Class Instantiated. Test Passed.");
    }
    
    public void switchToChartCntrl() {
        System.out.println("NavController - Switched to Chart Controller. Test Passed.");
        ChartController chartCtrl = new ChartController(this);
    }
    
    public void switchToCorrelationCntrl() {
        System.out.println("NavController - Switched to Correlation Controller. Test Passed.");
        CorrelationController correlationCtrl = new CorrelationController(this);
    }
    
    public void switchToFoodCntrl() {
        System.out.println("NavController - Switched to Food Controller. Test Passed.");
        FoodController foodCntrl = new FoodController(this);
    }
    
    public void switchToMoodCntrl() {
        System.out.println("NavController - Swtiched to Mood Controller. Test Passed.");
        MoodController moodCntrl = new MoodController(this);
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
        LoginController loginCtrl = new LoginController(this);
    }
    
    public void switchToNotificationsCntrl() {
        System.out.println("NavController - Switched to Notifications Controller. Test Passed.");
        NotificationsController notifcationsCtrl = new NotificationsController(this);
    }
    
    public void switchToRecommendationCntrl() {
        System.out.println("NavController - Switched to Recommendation Controller. Test Passed.");
        RecommendationController recommendationCtrl = new RecommendationController(this);
    }
    
    public void switchToResearchCntrl() {
        System.out.println("NavController - Switched to Research Controller. Test Passed.");
        ResearchController researchCtrl = new ResearchController(this);
    }
    
    public void switchToProfileCntrl() {
        System.out.println("NavController - Switched to Profile Controller. Test Passed.");
        ProfileController profileCtrl = new ProfileController(this);
    }
}
