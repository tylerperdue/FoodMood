/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodController;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bryaningram
 */
public class Invoker {
    private List<FoodInt> foodList = new ArrayList<FoodInt>();

    public void invoke(FoodInt order) {
        foodList.add(order);
    }

    public void List() {

        for (FoodInt order : foodList) {
            order.execute();
        }
        foodList.clear();
    }
}
