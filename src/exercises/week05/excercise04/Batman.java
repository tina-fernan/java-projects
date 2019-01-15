package excercise04;

import excercise05.Villian;

public class Batman implements SuperHero {

    public String getName(){
        return "Batman";
    }

    @Override
    public void fight(Villian villian) {
        villian.weaken(getName());

    }

}
