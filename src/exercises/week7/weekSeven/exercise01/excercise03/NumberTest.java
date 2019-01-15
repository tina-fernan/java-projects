package weekSeven.exercise01.excercise03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    Number number = new Number();
    List<Integer>numbers= Arrays.asList(2,3,5,7,8,9);
    @Test
    void testBiggestNumber() {

        Integer bigger=number.biggestNumber(numbers);
        Integer expected=9;
        assertEquals(expected,bigger);
    }

    @Test
    void testSmallestNumber() {

        Integer smaller=number.smallestNumber(numbers);
        Integer expected=2;
        assertEquals(expected,smaller);


    }
}