package Week02.exercise1.exercise04;

import java.util.ArrayList;
import java.util.List;

public class Menue {

    public List<Meal> getMeals(){
        List<Meal> meals = new ArrayList<>();
        meals.add(new Meal("Couscous",8.5));
        meals.add(new Meal("Tajin",9.5));
        meals.add(new Meal("Hummus",3.5));
        meals.add(new Meal("Falafel",4.0));

        return meals;
    }
}
