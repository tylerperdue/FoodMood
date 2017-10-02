/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResearchController;

import NavigationController.NavController;
import ResearchModel.ResearchModel;
import ResearchUI.ResearchUI;

/**
 *
 * @author Jake
 */
public class ResearchController {
    
    
    
    /**
     * Class Constructor. 
     */
    public ResearchController(NavController navCntrl)
    {
        System.out.println("Research Controller class instantiated. Test Passed.");
        ResearchModel research = new ResearchModel();
        ResearchUI researchUI = new ResearchUI();
    }
    
    
}
