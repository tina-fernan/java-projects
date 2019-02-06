package exercises.week11.exercise03;

import java.time.LocalTime;

public class Evening extends Occasion {

    public Evening() {
        super(LocalTime.of(17, 01), LocalTime.of(20, 0), "evening");
    }
}