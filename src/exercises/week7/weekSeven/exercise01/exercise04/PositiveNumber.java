package exercises.week7.weekSeven.exercise01.exercise04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositiveNumber {

    public List<Integer>  seperate(Integer positiveNumber) {

        String number = positiveNumber.toString();//"4325"
        List<String>numbers= Arrays.asList(number.split(""));


        List<Integer> seperateNumbers = new ArrayList<>();

        for (String string : numbers) {

            Integer newNumber = Integer.valueOf(string);//Integer.valueof("1")=1
            seperateNumbers.add(newNumber);


        }


        return seperateNumbers;

    }

}
