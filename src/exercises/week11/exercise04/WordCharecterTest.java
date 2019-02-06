package exercises.week11.exercise04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCharecterTest {

    private WordCharecter wordCharecter = new WordCharecter();


    @Test
    void isValid() {

        boolean remove = wordCharecter.isValid("pale", "ple");
        assertTrue(remove);

        boolean insert = wordCharecter.isValid("pale", "pales");
        assertTrue(insert);

        boolean replace = wordCharecter.isValid("pale", "bale");
        assertTrue(replace);

        boolean wrong = wordCharecter.isValid("pale", "bake");
        assertFalse(wrong);


//        pale, ple-> true
//        pale, pales -> true
//        pale, bale -> true
//        pale, bake -> false


    }
}