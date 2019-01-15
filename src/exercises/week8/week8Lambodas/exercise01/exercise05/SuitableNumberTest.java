package week8Lambodas.exercise01.exercise05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SuitableNumberTest {

    @Test
    void getBigges() {

        List<Integer>numbers= Arrays.asList(2,4,5,7,8,9);
        SuitableNumber suitableNumber= new SuitableNumber();
        Integer biggest=suitableNumber.getBigges(numbers);
        Integer expected=9;

        Assertions.assertEquals(expected,biggest);
    }
}