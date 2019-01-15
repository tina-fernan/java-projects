package excercise04;

public class SuperHeroApplication {
    //Create a SuperheroCaller and use it to call one superhero. Display its name.
    //Create a list of Superhero and add six superheroes by calling them with the SuperheroCaller.
    // Use a lop for this, please.
    //Display the superheroe names one by one with a loop by also showing the number of appearance.
    //Display the number of superheroes by using the list’s size.
    //Create the SuperheroCallerTest class to test the call method.
    // Make sure it never returns null and that the superhero names are either Batman, Superman or Spiderman.

    public static void main(String[] args) {

        SuperHeroCaller heroCaller = new SuperHeroCaller();
        SuperHero call = heroCaller.call();
        System.out.println(call.getName());

        for (int times = 1; times <= 6; times++) {
                System.out.println("Hero " + times + " : " + heroCaller.call().getName());

        }


    }


}
