package excercise05;

import excercise04.SuperHeroCaller;

public class AdvancedHeroApplication {
    //Create a SuperheroCaller. Reuse the one from exercise 4.
   // Create one Joker.
  //  Use the SuperheroCaller ten times to call one superhero and make him fight the jo
    public static void main(String[] args) {

        SuperHeroCaller superHeroCaller = new SuperHeroCaller();
        Villian jocker = new Jocker();
        for (int times = 1; times <= 10; times++){

            superHeroCaller.call().fight(jocker);


        }


    }
}
