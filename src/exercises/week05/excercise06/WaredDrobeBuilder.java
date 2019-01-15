package excercise06;

import java.util.Arrays;
import java.util.List;

public class


WaredDrobeBuilder {
    // Create the WardrobeBuilder class that has a list of all the Steps it has to follow to build a wardrobe.
    // It has the build method.
    //It creates an empty Wardrobe and applies all the steps one by one to it until it’s finished
    // and then it returns it. A Wardrobe needs the following to be completed:
    // one bottom, two sides, one back, one top, eight shelves and two doors.

    public List<Step> steps = Arrays.asList( new AddBottom(),new AddSide(),new AddSide(),new AddBack(), new AddTop(), new AddShelf(),new AddShelf(),
            new AddShelf() ,new AddShelf() ,new AddShelf(), new AddShelf(),new AddShelf(),new AddShelf(),new AddDoor(),new AddDoor());



    public WaredDrobe build() {
        WaredDrobe waredDrobe = new WaredDrobe();

        for (Step step : steps) {
            step.perform(waredDrobe);
        }

        return waredDrobe;


    }


}
