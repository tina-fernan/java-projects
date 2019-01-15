package excercise19Nov.excercise1.excercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NummberCorrectorTest {

    @Test
    void testCorrect() {
        NummberCorrector nummberCorrector=new NummberCorrector();
        Double weight=6.57;
        Integer result = nummberCorrector.correct(weight);
        Integer expected = 6;
        Assertions.assertEquals(expected,result);


    }
}