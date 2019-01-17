package exercises.week04.excercise05;

import java.util.ArrayList;
import java.util.List;

public class AdvanceShoppingApplication {

    public static void main(String[] args) {


        List<Grocery> groceries = new ArrayList<>();
        System.out.println(groceries);

        Grocery grocery1=new Grocery("bananas");
         Grocery grocery2= new Grocery("strewberries");
         Grocery grocery3= new Grocery("oranges");
         Grocery grocery4= new Grocery("oranges");

        groceries.add(grocery1);
        groceries.add(grocery2);
        groceries.add(grocery3);
        groceries.add(grocery4);

        System.out.println(groceries.toString());

        groceries.remove(2);

        System.out.println(groceries.toString());


        System.out.println(groceries.size());



    }








}
