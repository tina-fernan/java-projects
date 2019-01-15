package weekSeven.exercise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MoneyCollector {


    public static List<Integer> generate(){

        List<Integer> numberpays = new ArrayList<>();

        Random random = new Random();

        for (int times= 0; times <10 ; times++) {

            Integer numberpay=random.nextInt(5)+1;

            numberpays.add(numberpay);


        }


        return numberpays;

    }

}


//    public Integer generate(Number number){
////        Integer sum = 0;
////        List<String>friends= getNames();
////        for (String friend : friends) {
////            sum=sum++;
////
////            return number;
////
////
////
////        }
////    }


