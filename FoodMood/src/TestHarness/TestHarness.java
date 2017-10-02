package TestHarness;

import LoginController.LoginController;
import NavigationController.NavController;

/**
 *
 * @author tylerperdue
 */
public class TestHarness {
    public static void main(String[] args){
        System.out.println("Testing has started...\n");
        System.out.println("TESTING LOGIN");
        NavController navCntrl = new NavController(); 
        LoginController loginCtrl = new LoginController(navCntrl);
        loginCtrl.authenticate("john", "password");
        System.out.println("LOGIN TESTS COMPLETE.\n");
        System.out.println("TESTING FOOD");
        navCntrl.switchToFoodCntrl();
        System.out.println("FOOD TESTS COMPLETE.\n");
        System.out.println("TESTING MOOD");
        navCntrl.switchToMoodCntrl();
        System.out.println("MOOD TESTS COMPLETE.\n");
        System.out.println("TESTING FOOD MOOD STATS");
        navCntrl.switchToFoodMoodStatsCntrl();
        System.out.println("FOOD MOOD STATS TESTS COMPLETE.\n");
        System.out.println("TESTING RECOMMENDATIONS");
        navCntrl.switchToRecommendationCntrl();
        System.out.println("RECOMMENDATIONS TESTS COMPLETE.\n");
        System.out.println("TESTING HISTORY");
        navCntrl.switchToHistoryCntrl();
        System.out.println("HISTORY TESTS COMPLETE.\n");
        System.out.println("TESTING CORRELATION");
        navCntrl.switchToCorrelationCntrl();
        System.out.println("CORRELATION TESTS COMPLETE.\n");
        System.out.println("TESTING CHART");
        navCntrl.switchToChartCntrl();
        System.out.println("CHART TESTS COMPLETE.\n");
        System.out.println("TESTING USER PROFILE");
        navCntrl.switchToProfileCntrl();
        System.out.println("USER PROFILE TESTS COMPLETE.\n");
        System.out.println("TESTING RESEARCH");
        navCntrl.switchToResearchCntrl();
        System.out.println("RESEARCH TESTS COMPLETE.\n");
        System.out.println("TESTING NOTIFICATIONS");
        navCntrl.switchToNotificationsCntrl();
        System.out.println("NOTIFICATIONS TESTS COMPLETE.\n");
        System.out.println("Testing complete.");
        
    }
}
