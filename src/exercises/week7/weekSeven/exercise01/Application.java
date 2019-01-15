package weekSeven.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Integer> moneys = MoneyCollector.generate();
        System.out.println(moneys);

        MoneyCalculator moneyCalculator = new MoneyCalculator();
        Integer total= moneyCalculator.calculator(moneys);
        System.out.println(total);


    }




}
