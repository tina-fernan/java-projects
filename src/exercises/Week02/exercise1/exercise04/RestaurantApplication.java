package Week02.exercise1.exercise04;

import java.util.List;

public class RestaurantApplication {

    public static void main(String[] args) {


        Waiter waiter = new Waiter(new Menue());
        List<Meal> meals = waiter.getMeals();
        for (Meal meal : meals) {
            System.out.println("Meal:" + meal.getName());
            System.out.println(" " + meal.getPrice() + "Euros");

        }
        waiter.showPrice("Falafel");

    }
}