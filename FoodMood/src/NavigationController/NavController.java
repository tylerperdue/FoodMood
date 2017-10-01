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
        System.out.println("NavController Class Initialized. Test Passed.");
    }
}
