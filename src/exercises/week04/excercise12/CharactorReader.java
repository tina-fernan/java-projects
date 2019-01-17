///*package excercise26Nov.excercise01.excercise12;
//
//import excam30Nov.FileReader;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class CharactorReader {
//    private FileReader fileReader = new FileReader();
//
//    // Create the CharacterReader class that has the getCharacters method that receives a filePath,
//    // uses a FileReader to read its lines, transforms them into Characters and returns them.
//    /* Create the GotApplication class that has a main method that uses the CharacterReader to read */
//  /*  public List<Character> aslist(String filePath) {
//        List<String> lines = fileReader.asLines(filePath);
//        removeHeader(lines);
//        return toCharacters(lines);
//
//    }
//
//    private void removeHeader(List<String> lines) {
//        lines.remove(0);
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
//    public Character toCharacter(String line) {
//        String[] split = line.split(";");
//        List<String> columns = Arrays.asList(split);
//        String name = columns.get(0);
//        String bookOfDeath = columns.get(3);
//        String age = columns.get(6);
//        if (gender.equals("1")) {
//
//
//            gender = "man";
//        } else {
//            gender = "woman";
//        }
//    }
//}
//
//
//
