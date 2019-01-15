package weekSeven.exercise01;

import java.util.ArrayList;
import java.util.List;

public class MoneyCalculator {

   // A MoneyCalculator that receives money numbers and returns the accumulated value.
   // Test the behavior of the MoneyCalculator.
   // An application that displays on the screen the money collected from each friend
    // and also the total.

    public Integer calculator(List<Integer>moneyNumber){
        Integer sum = 0;


        for (Integer money : moneyNumber) {



            sum = sum +money;

        }

        return sum;
    }


}
