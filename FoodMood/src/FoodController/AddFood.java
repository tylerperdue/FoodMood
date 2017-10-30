/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodController;

/**
 *
 * @author bryaningram
 */
public class AddFood implements FoodInt {
    private FoodCommand food;

    public AddFood(FoodCommand food) {
        this.food = food;
    }

    public void execute() {
        food.add();
    }
}
