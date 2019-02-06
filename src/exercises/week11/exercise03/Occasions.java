package exercises.week11.exercise03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Occasions {

    public static List<Occasion>  getOccasion(){
        return new ArrayList<>(Arrays.asList(new Morning(),
                new Noon(),
                new Afternoon(),
                new Evening(),
                new Night(),
                new Midnight()));
    }


}
