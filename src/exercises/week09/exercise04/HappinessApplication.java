package exercises.week09.exercise04;



import exercises.week09.exercise04.FileReader;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class HappinessApplication {

    private static List<String> lines = new FileReader().asList("week09/exercise04/world-happiness-2017.csv");

    public static void main(String[] args) {
        lines.stream()
                .skip(1)
                .map(e -> e.split(";"))
                .map(convertToHappiness())
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(5)
                .forEach(happinessRecord -> System.out.println(happinessRecord));
//                .forEach(System.out::println);
    }

    private static Function<String[], HappinessRecord> convertToHappiness() {
        return strings -> new HappinessRecord(Integer.valueOf(strings[1]), strings[0], Double.valueOf(strings[2]));
    }
}
