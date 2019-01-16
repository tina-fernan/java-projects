package exercises.week09.exercise03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {
private Caesar caesar=new Caesar();
    @Test
    void testCipher() {
        String message = "be sure to drink your Ovaltine";
        String encrypt=caesar.cipher(message,13);
        String expected="or fher gb qevax lbhe Binygvar";

        Assertions.assertEquals(expected,encrypt);


    }
}