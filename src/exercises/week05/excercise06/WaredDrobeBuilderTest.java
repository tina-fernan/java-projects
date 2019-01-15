package excercise06;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WaredDrobeBuilderTest {
    // one bottom, two sides, one back, one top, eight shelves and two doors.


    @Test
    void buildWaredDrobeTest() {
        WaredDrobeBuilder waredDrobeBuilder = new WaredDrobeBuilder();
        WaredDrobe waredDrobe = waredDrobeBuilder.build();
        List<String>partlist=waredDrobe.getParts();

        List<String>steps = Arrays.asList("bottom","side","side","back","top","shelf","shelf","shelf","shelf",
                "shelf","shelf","shelf","shelf","door","door");
        assertEquals(steps,partlist);




    }


}