package week8Lambodas.exercise01.exercise05;

import java.util.List;
import java.util.function.Predicate;

public class SuitableNumber {






   public Integer getBigges(List<Integer>numbers){

       return getNumber(numbers, number -> number>number);
   }

    private Integer getNumber(List<Integer>numbers, Predicate<Integer>condition){
        Integer result=numbers.get(0);
        for (Integer number : numbers) {
            if (condition.test(number)){
                result = number;
            }

        }
        return result;
   }
}
