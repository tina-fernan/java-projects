package Week02.exercise1.exercise04;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private Menue menue;

    public Waiter(Menue menue) {
        this.menue = menue;
    }
    public List<Meal> getMeals(){
        return menue.getMeals();
    }

    public void showPrice(String mealName) {
        List<Meal>meals = menue.getMeals();
        for (Meal meal :meals){
            if (meal.getName().equals(mealName)){
                System.out.println("the price of" + mealName +"is" + meal.getPrice()+"Euros");
                return;
            }
        }

    }
}
