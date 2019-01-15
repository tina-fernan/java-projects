package week8SevenJan.exercise01;

import excercise01.FileReader;

import java.util.List;

public class communicationApplication {

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        Sensor sensor = new Sensor();
        Archieve archieve = new Archieve();

        List<String> lines = reader.asLines("week8SevenJan/exercise01/robomime.txt");
        List<String> trick = sensor.decryptTrick(lines);

        archieve.getTrick(trick);

    }
}
