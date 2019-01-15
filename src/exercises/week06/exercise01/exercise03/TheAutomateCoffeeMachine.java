package weekSix.exercise01.exercise03;

public class TheAutomateCoffeeMachine extends CoffeeMaker {

    @Override
    public String getName() {
        return "Automatic coffee machine";
    }

    @Override
    public Integer getBrewingTime() {
        return 5;
    }

    //Create the AutomaticCoffeeMachine class that extends CoffeeMaker.
    // Implement its methods with the help of Intellij.
    // Return “Automatic coffee machine” as name and 5 as brewing time.
    // Notice that you don’t need to implement the brew method because it’s not abstract.
    // All CoffeeMakers will share that code without the need of implementing it.
    // However, they need to specify their names and brewing times as customization.


}
