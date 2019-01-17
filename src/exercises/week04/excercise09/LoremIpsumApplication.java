package exercises.week04.excercise09;

import java.util.List;

public class LoremIpsumApplication {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        readDocument(fileReader);






    }

    private static void readDocument(FileReader reader) {
        System.out.println("---- DOCUMENT");
        List<String> lines = reader.getLines("excercise26Nov/excercise01/excercise09/loremipsum.txt");
        for (String line : lines) {
            System.out.println(line);
        }
}
    }
