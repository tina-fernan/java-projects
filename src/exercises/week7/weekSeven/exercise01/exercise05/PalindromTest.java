package weekSeven.exercise01.exercise05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {
    private Palindrom palindrom = new Palindrom();
    @Test
    void testPalindrom() {

        String letter="madam";


        boolean word = palindrom.palindrom(letter);

        Assertions.assertTrue(word);
    }
    @Test
    void testNotPalindrom() {

        String letter="tina";


        boolean word = palindrom.palindrom(letter);

        Assertions.assertFalse(word);
    }
}