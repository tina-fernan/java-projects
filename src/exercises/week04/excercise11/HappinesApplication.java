package exercises.week04.excercise11;

import exercises.week04.excercise09.FileReader;

import java.util.*;

public class HappinesApplication {

    // sorts it by rank and displays the first five.


    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        List<String> lines = fileReader.getLines("excercise26Nov/excercise01/excercise11/world-happiness-2017.csv");
        readHappinesRecords(lines);
    }

    private static void readHappinesRecords(List<String> lines) {

        List<HappinesRecord> happinesRecords = doRecord(lines);
        Collections.sort(happinesRecords, Comparator.comparing(HappinesRecord::getRank));
        System.out.println(happinesRecords);

        for (int times = 0; times < 5; times++) {
            HappinesRecord happinessRecord = happinesRecords.get(times);
            System.out.println(happinessRecord.getCountry()+
                    " | " + happinessRecord.getRank()+
                    " | " + happinessRecord.getScore());
        }


    }

    private static List<HappinesRecord> doRecord(List<String> lines) {
        lines.remove(0);
        List<HappinesRecord> happinesRecords = new ArrayList<>();
        for (String line : lines) {
            HappinesRecord happinesRecord = toRecord(line);
            happinesRecords.add(happinesRecord);
        }
        return happinesRecords;
    }

    private static HappinesRecord toRecord(String line) {
        String[] split = line.split(";");

        String country = split[0];
        Integer rank = Integer.valueOf(split[1]);
        Double score = Double.valueOf(split[2]);
        return new HappinesRecord(country, rank, score);
    }
}
