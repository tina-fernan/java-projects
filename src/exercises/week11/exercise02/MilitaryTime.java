package exercises.week11.exercise02;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MilitaryTime {

    public String toMilitaryTime(String input){

        return LocalTime.parse(input, DateTimeFormatter.ofPattern("hh:mm:ss a"))
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
