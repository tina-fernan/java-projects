package weekSix.exercise01.exercise04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreedyAlgorithm {


    //It has the change method that receives an Integer amount of the amount that the waiter has to give back,
    // and it returns a list of Money with the exact coins that he has to give back.
    public List<Money> change(Integer amount) {

        List<Money> changedMoney = new ArrayList<>();
        List<Money> coinsList = Arrays.asList(new Cent50(), new Cent20(), new Cent10(), new Cent5(), new Cent2(), new Cent1());

        while (amount > 0) {
            Money coin = coinsList.get(0);
            System.out.println(coin.getAmount());
            if (coin.isApplicable(amount)) {

                Integer numberOfCoins = amount / coin.getAmount();
                changedMoney.add(coin);
             //   addToList(changedMoney, coin, numberOfCoins);
                amount=amount-coin.getAmount();
//                amount = amount - (coin.getAmount() * numberOfCoins);
            } else {
                Collections.rotate(coinsList, -1);
            }
            System.out.println(changedMoney);
        }


        return changedMoney;

    }
//
//    private void addToList(List<Money> moneyList, Money money, Integer repetation) {
//        for (int i = 0; i < repetation; i++) {
//            moneyList.add(money);
//
//
//        }
//    }
}


