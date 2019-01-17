package exercises.week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicShoppingApplication {

    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();

        String grocery1= "bananas";
        String grocery2 = "oranges";
        String grocery3 = "oranges";
        String grocery4= "tomatoes";

        groceries.add(grocery1);
        groceries.add(grocery2);
        groceries.add(grocery3);
        groceries.add(grocery4);

        System.out.println(groceries);

        groceries.remove("tomatoes");
        System.out.println(groceries);

        //Integer size = groceries.size();
       // System.out.println(size);

        System.out.println(groceries.size());


        groceries.remove(2);

        System.out.println(groceries);

        System.out.println(groceries.size());







    }


}
