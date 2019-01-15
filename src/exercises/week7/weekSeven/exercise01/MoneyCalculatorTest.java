package weekSeven.exercise01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoneyCalculatorTest {

    @Test
    void testMoneycalculator() {
       List<Integer>numbers= Arrays.asList(2,3,4,1,3,4,5,2,3,4);

        MoneyCalculator moneyCalculator = new MoneyCalculator();

        Integer actual= moneyCalculator.calculator(numbers);
        Integer expect =31;

    }
}