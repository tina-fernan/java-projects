package weekNine.exercise01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplication {
    // Create the StreamsApplication class. Write the next points of this exercise inside the main method.
// Create a list of the first twenty numbers. Use a loop for this, please.
// Create a list of the even numbers. Display it.
// Create a list of the odd numbers. Display it.
// Create a list of the numbers divisible by 3 and bigger than 10. Display it.
// Create a list of the numbers smaller than 5 and multiply them by 3. Display it.
// Create a list of String where every element follows the format “number <number> has <digit> digits”.
// The numbers considered have to be bigger than 8 and smaller than 12. Display it.
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int position = 1; position <= 20; position++) {
            numbers.add(position);

        }

        List<Integer> collect = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers : " + collect);

        List<Integer> oddNumber = numbers.stream()
                .filter(n -> n % 3 == 1)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers : " + oddNumber);

        List<Integer> divisable = numbers.stream()
                .filter(n -> n % 3 == 0 && n > 10)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10: " + divisable);

        List<Integer> square = numbers.stream()
                .filter(n -> n < 5)
                .map(n -> n * 3)
                .collect(Collectors.toList());

        List<Integer> string = numbers.stream()
                .filter(n -> n > 8 && n < 12)
                .collect(Collectors.toList());
        System.out.println("Digits of numbers bigger than 8 and smaller than 12:" + string);

        string.stream()
                .forEach(e -> System.out.print("number " + e + " has " + e.toString().length() + " digits. "));



    }


}

