package exercises.week11.exercise03;

import java.util.Map;

public class SpecificNumber {

    public static Map<Integer,String> numberInWords= Number.getTimeInWords();

    public  String toString(Integer number){

    if (number<21) {

        return numberInWords.get(number);

        }
    if (number.equals(30)) {

        return numberInWords.get(number);
    }
    Integer modulDigit= getModuleDigit(number);
    Integer divisionDigit=getDivDigit(number);

    return numberInWords.get(divisionDigit)+ " "+numberInWords.get(divisionDigit);

    }

    private static int getModuleDigit(int number) {

        return number % 10;
    }

    private static int getDivDigit(int number) {

        return number / 10 * 10;
    }
}
