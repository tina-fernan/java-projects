package weekSeven.exercise01.excercise03;

import java.util.List;

public class Number {

    public Integer biggestNumber(List<Integer> numbers) {
        int bigger = numbers.get(0);
        for (Integer number : numbers) {
            if (number > bigger) {
                bigger = number;
            }
            // bigger = (number>bigger)?number:bigger;

        }
        return bigger;

    }

    public Integer smallestNumber(List<Integer> numbers) {
        int smaller = numbers.get(0);
        for (Integer number : numbers) {
            if (number < smaller) {
                smaller = number;
            }

        }

        return smaller;

    }
}