package weekSix.exercise01.exercise04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreedyAlgorithmTest {
    //Create the GreedyAlgorithmTest class that checks at least the following cases:
    //The amount given is zero, then the change list should be empty.
    //The amount given is 88, then the change list should contain 6 coins.
    //The amount given is 149, then the change list should contain 7 coins.

    @Test
    void changeTest() {

        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();

        List<Money> change = greedyAlgorithm.change(88);
        System.out.println(change);

        List<Money> changeList = Arrays.asList(new Cent50(), new Cent20(), new Cent10(), new Cent5(), new Cent2(), new Cent1());

        assertEquals(changeList, change);
    }
}