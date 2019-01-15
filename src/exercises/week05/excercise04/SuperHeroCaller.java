package excercise04;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperHeroCaller {
    //Create the SuperheroCaller class that has a list with the three superheroes.
    // It has the call method that returns a random Superhero every time you use it.
    private List<SuperHero> superHeroes = Arrays.asList(new Batman(), new SuperMan(), new Spiderman());
    private Random random = new Random();


    public SuperHero call() {

        int position = random.nextInt(2);
        SuperHero superHero = superHeroes.get(position);

        return superHero ;
    }
}
