package exercises.week11.exercise03;

import java.time.LocalTime;

public class Noon extends Occasion{

    public Noon() {

        super(LocalTime.of(12, 00), LocalTime.of(12, 00), "noon");
    }
}
