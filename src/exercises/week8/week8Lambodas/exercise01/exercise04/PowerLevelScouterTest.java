package week8Lambodas.exercise01.exercise04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerLevelScouterTest {

    PowerLevelScouter powerLevelScouter= new PowerLevelScouter();

    @Test
    void scout() {

        Integer name =powerLevelScouter.scout("Susana");
        Integer expected = 619;
        assertEquals(expected,name);

    }

    @Test
    void scoutEnhanced() {

        Integer newName = powerLevelScouter.scoutEnhanced("Susana");
        Integer expected =651;
        assertEquals(expected,newName);

    }
}