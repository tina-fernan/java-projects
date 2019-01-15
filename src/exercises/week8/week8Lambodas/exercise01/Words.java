package week8Lambodas.exercise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class Words {

    public static void main(String[] args) {
// Create a list of words. Make sure you use new ArrayList to have a mutable list.
// Use the removeIf method to remove every word that ends with the letter e.
// Use the replaceAll method to transform every word in their uppercase version.
// Use the removeIf method to remove every word that has less than six letters.
// Use the forEach method to print every word one by one.

        List<String> mutableNames = new ArrayList<>(Arrays.asList("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));
        System.out.println(mutableNames);

        mutableNames.removeIf(mutableName -> mutableName.endsWith("e"));
        System.out.println(mutableNames);

        mutableNames.replaceAll(mutableName -> mutableName.toUpperCase());
        System.out.println(mutableNames);

        mutableNames.removeIf(mutableName -> mutableName.length()<6);
        System.out.println(mutableNames);

        mutableNames.forEach(mutableName -> System.out.println(mutableName));

    }
}