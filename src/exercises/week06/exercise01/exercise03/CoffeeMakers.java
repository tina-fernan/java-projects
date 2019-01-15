package weekSix.exercise01.exercise03;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {
    //Create the CoffeeMakers class.
    // It has the asList static method that returns the three CoffeeMakers as a list of CoffeeMaker.
    // It has the get static method that receives a String representing
    // the name of the coffee maker you want to receive,
    // and it returns an Optional with the CoffeeMaker you wanted if it found it within its list of available ones.
    // Otherwise an empty one.

    public static List<CoffeeMaker> coffeeMakerList = Arrays.asList(new TheAutomateCoffeeMachine(), new AutoDrip(), new FrenchPress());

    public static List<CoffeeMaker> asList() {
        return coffeeMakerList;
    }


    public static Optional<CoffeeMaker> getCoffeeMakerList(String name) {
        for (CoffeeMaker coffeeMaker : coffeeMakerList) {
            if (coffeeMaker.getName().equals(name)) {
                return Optional.of(coffeeMaker);
            }
        }
        return  Optional.empty();



    }
}
