package excercise06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaredDrobe implements Furtniture {
   // Create the Wardrobe class that has a list of String representing its different parts.
    // It implements Furniture. Its add method adds the part to its parts.
    // Implement its toSoftring method to display its parts.
    List<String>parts = new ArrayList<>();



    @Override
    public void add(String part) {
        parts.add(part);

    }




    @Override
    public String toString() {
        return "WaredDrobe{" +
                "parts=" + parts +
                '}';
    }

    public List<String> getParts() {
        return parts;
    }
}
