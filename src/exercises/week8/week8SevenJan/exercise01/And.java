package week8SevenJan.exercise01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class And implements Decryptor {

    @Override
    public boolean canDecrypt(String line) {

        return line.contains("&");
    }

    @Override
    public String decrypt(String line) {
        // use replaceAll to remove all & symbols
        String message=line.replaceAll("&","");
        // make a collection of letters from the line - split ""
        List<String>letters= Arrays.asList(message.split(""));
        Collections.reverse(letters);
        // reverse the collection of letters
        String reversed=String.join("",letters);
        // join all letters in a string
        return reversed;
    }
}
