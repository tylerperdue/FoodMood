/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChartModel;

import java.util.ArrayList;

/**
 *
 * @author Jake
 */
public class Chart {
    

    ArrayList<String> masterList = new ArrayList<>();
    
    /**
     * Chart Constructor. Creates the arrayList for all past FoodMood Chart
     * entries. 
     * 
     * 
     */
    public Chart(){
        System.out.println("Chart Class Instantiated. Test Passed.");
    }
    
    /** 
     * Getter method for the arrayList. 
     * <br>
     * @return 
     */
    public ArrayList getMasterList(){
        return masterList;
    }
    
    /**
     * Setter method for the arrayList.
     */
    public void setMasterList(){
        
    }
}
    
