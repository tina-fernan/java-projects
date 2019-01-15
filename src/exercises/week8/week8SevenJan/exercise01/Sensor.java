package week8SevenJan.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Sensor {

    public List<String> decryptTrick(List<String> lines) {
        List<String> decryption = new ArrayList<>();
        for (String line :lines) {
            String message = toDecrypt(line);
            decryption.add(message);
        }
        return decryption;
    }

    public String toDecrypt(String line) {
        List<Decryptor> decryptors = Decryptors.asList();
        String decryptedString = "";

        for (Decryptor decryptor : decryptors) {
            if (decryptor.canDecrypt(line)) {
                decryptedString = decryptor.decrypt(line);
            }
        }
        return decryptedString;
    }
}



