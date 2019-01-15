package weekNine.exercise02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamTest {

    private FileReader reader = new FileReader();
    private List<String> names = getNames();

    private List<String> getNames() {
        return reader.asList("weekNine/exercise02/names.txt");
    }

    @Test
    void lessThanFourLetters() {
//       List<String> names = reader.asList("weekNine/exercise01/exercise02/names.txt");
        List<String> actual = names.stream()
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());

        List<String> expected = Arrays.asList("El");
        assertEquals(expected, actual);
    }

    @Test
    void endWithLetterM() {
        // List<String> names = reader.asList("weekNine/exercise01/exercise02/names.txt");
        List<String> mName = names.stream()
                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("HOSAM", "TAMAM");
        assertEquals(expected, mName);
    }
        @Test
        void containE(){
        List<String>contain=names.stream()
                .filter(e -> e.contains("e"))
                .filter(e -> e.contains("r"))
                .collect(Collectors.toList());
        List<String>expected=Arrays.asList("Mehran","Norbert", "Serife");

        Assertions.assertEquals(expected,contain);

        }
    @Test
    void fourCharector() {
         List<String>creation=names.stream()
                .filter(e -> e.length()== 4)
                 .map(s -> s.toLowerCase())
                .filter(e -> e.contains("a"))
                .filter(e-> e.contains("m"))
                .map(e->e.replaceAll("a","aa"))
                 .collect(Collectors.toList());
         List<String>expected=Arrays.asList("maarj", "aamin", "omaar");

         assertEquals(expected,creation);

    }

        //Create a list with the names that are exactly four characters long,
    // make them lower case, keep those that contain the letters “a” and “m” and duplicate the number of letter “a”s that they have.
        //Notes:
        //Use the FileReader provided in the reader package. Note that it has the asStream method, because files can be read with Streams as well.
        //Use the names.txt file provided in the source package.
    }


