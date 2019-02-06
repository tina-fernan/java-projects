package exercises.week11.exercise03;

import java.time.LocalTime;

public class Afternoon extends Occasion {
    public Afternoon() {
        super(LocalTime.of(12,01),LocalTime.of(17,00), "afternoon");
    }
}
