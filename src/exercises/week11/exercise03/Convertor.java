package exercises.week11.exercise03;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Convertor {

    private Map<Integer, String> numberInwords = Number.getTimeInWords();
    private List<Occasion> occasionsList = Occasions.getOccasion();

    public  String toWords(Integer hour, Integer minute) {

        if (minute.equals(0)) {
            return getOclock(hour);
        }

        if (minute <= 30) {

            return Number.toString(minute) + " past " + Number.toString(hour);
        }

        int remainedMinute = 60 - minute;
        return Number.toString(remainedMinute) + " to " + Number.toString(hour + 1);
    }

    public String toOccasion(Integer hour, Integer minute){
        LocalTime currentTime = LocalTime.of(hour, minute);
        return occasionsList.stream()
                .filter(e -> e.isBetween(currentTime))
                .map(Occasion::getOccasion)
                .limit(1)
                .collect(Collectors.joining());
    }

    private String getOclock(Integer hour) {
        if (hour.equals(0)) {
            return "It's midnight!";
        }

        return Number.toString(hour) + " O'CLOCK!";
    }

}
