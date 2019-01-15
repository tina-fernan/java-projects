//package weekSeven.exercise01.exam19Dec;
//
//import excercise01.FileReader;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class BankReader {
//
//
//    FileReader fileReader = new FileReader();
//
//
//    public List<Character> aslist(String fialpath) {
//        List<String> lines = fileReader.asLines("weekSeven/exercise01/exam19Dec/data.csv.odt");
//        return toCharacters(lines);
//
//    }
//
//    private List<Character> toCharacters(List<String> lines) {
//        List<Character> characters = new ArrayList<>();
//        for (String line : lines) {
//            characters.add(toCharacter(line));
//        }
//        return characters;
//    }
//
//    public  Character toCharacter(String line) {
//        String[] split = line.split(";");
//        List<String> columns = Arrays.asList(split);
//        String employeeNames = columns.get(0);
//        String departmentNames = columns.get(1);
//        String salary = columns.get(2);
//        String bankAccount = columns.get(3);
//
//        return charector;
//
//
//    }
//
//    }
//}





