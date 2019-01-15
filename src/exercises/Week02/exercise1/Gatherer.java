package Week02.exercise1;

import Week02.exercise1.Hiker;
import Week02.exercise1.exercise2.AutomaticGatherer;

import java.util.ArrayList;
import java.util.List;

public class Gatherer {

    public List<Hiker> gathearHiker() {
        List<Hiker> hikers = new ArrayList<>();

        AutomaticGatherer automatic = new AutomaticGatherer();
        hikers.addAll(automatic.getConfirmedHikers());

        Hiker nina = new Hiker("Nina");

        hikers.add(nina);
        hikers.add(new Hiker("Tom"));
        hikers.add(new Hiker(  "Lukas"));
        hikers.add(new Hiker("Lisa"));
        hikers.add(new Hiker("Tanja"));

        return hikers;
    }




}
