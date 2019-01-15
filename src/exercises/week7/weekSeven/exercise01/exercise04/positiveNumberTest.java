package weekSeven.exercise01.exercise04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class positiveNumberTest {



    @Test
    void testSeperatePositiveNumber() {

        Integer number=3456;

        PositiveNumber positiveNumber = new PositiveNumber();
       List<Integer>numbers= positiveNumber.seperate(number);
       List<String>digits=Arrays.asList("3","4","5","6");


    }
}
