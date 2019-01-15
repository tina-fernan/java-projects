package week8Lambodas.exercise01.exercise03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeyWordFinderTest {

     KeyWordFinder keyWordFinder = new KeyWordFinder();



    @Test
    void findElegant() {
        String sentence = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
       List<String > keyWord =keyWordFinder.findElegant(sentence);
       List<String>expected =Arrays.asList("elephant", "eleven", "electricity", "elevator");

       assertEquals(expected,keyWord);



    }

    @Test
    void findPlayful() {

        String sentence="The rightful heir of the powerful king had an awful accident playing with a colorful bear";


        List<String>keyword = keyWordFinder.findPlayful(sentence);
        List<String>expected =Arrays.asList("rightful", "powerful", "awful", "colorful");

        assertEquals(expected,keyword);
    }
}