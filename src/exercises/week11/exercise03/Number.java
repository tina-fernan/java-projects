package exercises.week11.exercise03;

import java.util.HashMap;
import java.util.Map;

public class Number {

    public static Map<Integer,String> getTimeInWords(){
        Map<Integer,String>numbers=new HashMap<>();
         numbers.put(1, "one");
         numbers.put(2, "two");
         numbers.put(3, "three");
         numbers.put(4, "four");
         numbers.put(5, "five");
         numbers.put(6, "six");
         numbers.put(7, "seven");
         numbers.put(8, "eight");
         numbers.put(9, "nine");
         numbers.put(10, "ten");
         numbers.put(11, "eleven");
         numbers.put(12, "twelve");
         numbers.put(13, "thirteen");
         numbers.put(14, "fourteen");
         numbers.put(15, "fifteen");
         numbers.put(16, "sixteen");
         numbers.put(17, "seventeen");
         numbers.put(18, "eighteen");
         numbers.put(19, "nineteen");
         numbers.put(20, "twenty");
         numbers.put(30, "thirty");
         return numbers;

    }


 public static String toString(Integer minute) {
     return Number.toString(minute);
 }
}
