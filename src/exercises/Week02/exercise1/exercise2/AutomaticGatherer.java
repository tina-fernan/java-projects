package Week02.exercise1.exercise2;

import Week02.exercise1.Hiker;

import java.util.ArrayList;
import java.util.List;

public class AutomaticGatherer {


    public List<Hiker> getConfirmedHikers() {
//        List<Hiker> Hikers = gathearHiker();
        return gathearHiker();
    }

    private List<Hiker> gathearHiker() {
//        List<Hiker> hikers = gathearHiker();
        List<Hiker> hikers = new ArrayList<>();

        hikers.add(new Hiker("Tina"));
        hikers.add(new Hiker("Niklas"));
        hikers.add(new Hiker("Guillermo"));
        hikers.add(new Hiker("Mahtab"));
        hikers.add(new Hiker("Ashkan"));
        return hikers;

    }


}



