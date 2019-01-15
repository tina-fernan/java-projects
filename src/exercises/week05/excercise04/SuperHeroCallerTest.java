package excercise04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SuperHeroCallerTest {

    @Test
    void testNamesCall() {
        SuperHeroCaller superHeroCaller = new SuperHeroCaller();
        SuperHero superHero = superHeroCaller.call();
        List<String>superHeroes= Arrays.asList("Batman","Spiderman","Superman");
        Assertions.assertTrue(superHeroes.contains(superHero.getName()));


    }
}