package exercises.week11.exercise03;

import java.time.LocalTime;

public class Morning extends Occasion {
    public Morning() {
        super(LocalTime.of(6,00),LocalTime.of(11,59), "morning");
    }
}
