package weekNine.exercise03;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {
    //Create the Caesar class. It has the cipher method that receives the plaintext and the key and returns the ciphertext.
    //Create the CaesarTest class and provide meaningful tests.
    public String cipher(String plainText, Integer key) {

        return Stream.of(plainText.split(""))
                .map(e -> encrypt(e, key))
                .collect(Collectors.joining());
    }

    private String encrypt(String letter, Integer key) {
        Character character = letter.charAt(0);
        if (!Character.isAlphabetic(character)) {
            return character.toString();
        }
        Character newLetter = shift(character, key);
        return newLetter.toString();
    }

    private Character shift(Character letter, Integer key) {
        int valueOfLetter = letter;
        int shiftedValue = valueOfLetter + key;  //Ascii code....Integer+key
        if (isCapitalLetter(valueOfLetter)) {
            shiftedValue = (shiftedValue - 65) % 26 + 65; //Ascii code....Integer+key
        } else {
            shiftedValue = (shiftedValue - 97) % 26 + 97;
        }
        Character newletter = (char) shiftedValue;
        return newletter;
    }
    private Boolean isCapitalLetter(int valueOfLetter) {
        return valueOfLetter <= 90;
    }


}

