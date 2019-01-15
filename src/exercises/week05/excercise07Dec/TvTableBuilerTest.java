package excercise07Dec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TvTableBuilerTest {

    @Test
    void testBuildTable() {
        TvTableBuiler tvTableBuiler = new TvTableBuiler();
        TvTable tvTable = tvTableBuiler.build();
        List<String> partList = tvTable.getParts();

        List<String> parts = Arrays.asList("leg", "leg", "leg", "leg", "shelf", "top");

        assertEquals(parts, partList);
    }
}