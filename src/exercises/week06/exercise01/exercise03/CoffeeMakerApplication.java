package weekSix.exercise01.exercise03;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {
    //Use the CoffeeMakers class to receive all available coffee makers as a list.
    // For each one of them, brew a Coffee and display the madeBy and brewedTime from the Coffee.

    //Use the CoffeeMakers class to get one by one each CoffeeMaker.
    // Check with the Optional if they are present, and if so,
    // use them to brew a Coffee and display the madeBy and brewedTime from it.
    //Use the CoffeeMakers class to get one maker that does not exist.
    // Check with the Optional that it is not present and
    // display a message saying that this particular coffee maker is not available.

    public static void main(String[] args) {


        List<CoffeeMaker> coffeeMakerList = CoffeeMakers.asList();
        for (CoffeeMaker coffeeMaker : coffeeMakerList) {

            Coffee coffee = coffeeMaker.brew();
            System.out.println(coffee.madeBy + " brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");

        }

        //     Optional<CoffeeMaker> maker=Optional.of(coffeeMaker);
        CoffeeMaker coffeeMaker1 = coffeeMakerList.get(0);

        CoffeeMaker coffeeMaker2 = coffeeMakerList.get(1);
        CoffeeMaker coffeeMaker3 = coffeeMakerList.get(2);

        Optional.of(coffeeMaker1).isPresent();
        coffeeMaker1.brew();
        System.out.println(coffeeMaker1.getName() + " brewed a coffee and it took " + coffeeMaker1.getBrewingTime() + " minutes");

        Optional.of(coffeeMaker2).isPresent();
        coffeeMaker2.brew();
        System.out.println(coffeeMaker2.getName() + " brewed a coffe and it took " + coffeeMaker2.getBrewingTime() + " minutes ");

        Optional.of(coffeeMaker3).isPresent();
        coffeeMaker3.brew();
        System.out.println(coffeeMaker3.getName() + " brewed a coffee and it took " + coffeeMaker3.getBrewingTime() + " mintes");
        //Use the CoffeeMakers class to get one maker that does not exist.
        // Check with the Optional that it is not present and
        // display a message saying that this particular coffee maker is not available.



        Optional<CoffeeMaker> moka= CoffeeMakers.getCoffeeMakerList("Moka");

        if (!moka.isPresent()) {
             System.out.println("The coffee maker with the name Moka pot is not available");


        }


    }

}













