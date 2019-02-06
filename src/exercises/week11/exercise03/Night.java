package exercises.week11.exercise03;

import java.time.LocalTime;

public class Night extends Occasion {

    public Night() {
        super(LocalTime.of(20,01), LocalTime.of(5,59), "night");
    }
}
