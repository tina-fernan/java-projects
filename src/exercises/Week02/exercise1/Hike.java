package Week02.exercise1;

import Week02.exercise1.exercise2.Gathere;

import java.util.ArrayList;
import java.util.List;

public class Hike {

    private Gathere gathere = new Gathere();
    private List<Hiker> hikers = new ArrayList<>();


    public void signUp() {
        List<Hiker> gatherehikers = gathere.signUp();
        hikers.addAll(gatherehikers);
        //System.out.println(gatherehikers);
        //gatherehikers.addAll(gatherehikers);

    }

    public void showHikers() {
       for (Hiker hiker : hikers) {
            String name = hiker.getName();
            System.out.println(name);
        }


     }
}
