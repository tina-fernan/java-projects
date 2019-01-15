package week8Lambodas.exercise01.exercise02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {

// Add to it the getEven method that receives a list of numbers and returns a list with only its even numbers.
// Add to it the getOdd method that receives a list of numbers and returns a list with only its odd numbers.
//Write tests for both methods.
//You’re not allowed to use the removeIf method of any kind of data structure.
//You’re not allowed to duplicate code.
//Use a Predicate<Integer> to avoid code duplication.

        public List<Integer> getEven (List < Integer > numbers) {
            return filter(numbers, number -> number % 2 == 0);
        }

        public List<Integer> getOdd (List < Integer > numbers) {
            return filter(numbers, number -> number % 2 == 1);

        }
        private List<Integer> filter (List < Integer > numbers, Predicate < Integer > condition){
            List<Integer> result = new ArrayList<>();
            for (Integer number : numbers) {
                if (condition.test(number)) {
                    result.add(number);
                }
            }
            return result;
        }


    }
