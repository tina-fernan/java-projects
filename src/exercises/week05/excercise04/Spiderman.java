package excercise04;

import excercise05.Villian;

public class Spiderman implements SuperHero {


    public String getName(){
        return "Spiderman";
    }

    @Override
    public void fight(Villian villian) {
        villian.weaken(getName());

    }


}
