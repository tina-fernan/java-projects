package week8Lambodas.exercise01.exercise02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class NumberFilterTest {

    private NumberFilter numberFilter = new NumberFilter();
    private List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    @Test
    void getEven() {
        //Predicate<Integer>condition = (numbers ->  number -> number % 2 == 0);
        List<Integer>filter= numberFilter.getEven(numbers);
        List<Integer> expected = Arrays.asList(2,4,6,8,10);

        assertEquals(expected,filter);


    }

    @Test
    void getOdd() {

        List<Integer> filter = numberFilter.getOdd(numbers);
        List<Integer> expected =Arrays.asList(1,3,5,7,9);

        assertEquals(filter,expected);
    }
}