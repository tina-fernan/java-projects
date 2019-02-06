package exercises.week11.exercise03;

import java.time.LocalTime;

public class Midnight extends Occasion {



    public Midnight() {
        super(LocalTime.of(0, 0), LocalTime.of(0, 0), "midnight");
    }
}
