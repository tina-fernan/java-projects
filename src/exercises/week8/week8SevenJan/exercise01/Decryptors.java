package week8SevenJan.exercise01;

import java.util.Arrays;
import java.util.List;

public class Decryptors {

    public static List<Decryptor>  asList(){

        return Arrays.asList(new Hash(),new Exclamation(),new And());
    }
}
