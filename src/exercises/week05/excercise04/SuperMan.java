package excercise04;

import excercise05.Villian;

public class SuperMan implements SuperHero {
    //Create the Batman, Superman and Spiderman classes that implement the Superhero interface.
    // Implement the getName methods with the help of Intellij in each one of them.
   // Create the SuperheroCaller class that has a list with the three superheroes.
    // It has the call method that returns a random Superhero every time you use it.
    public String getName(){
        return "Superman";
    }


    @Override
    public void fight(Villian villian) {
        villian.weaken(getName());

    }


}
