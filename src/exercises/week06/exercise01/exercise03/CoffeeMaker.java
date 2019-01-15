package weekSix.exercise01.exercise03;

public abstract class CoffeeMaker {
   // It has the getName abstract method that returns a String.
    //It has the getBrewingTime abstract method that returns an Integer.
   // It has the brew method that returns a Coffee.
    // It uses the getName and getBrewingTime methods to create a Coffee and returns it.

    public abstract String getName();

    public abstract Integer getBrewingTime();

    public Coffee brew(){
        Coffee coffee=new Coffee(getName(),getBrewingTime());
        return coffee;
    }






}
