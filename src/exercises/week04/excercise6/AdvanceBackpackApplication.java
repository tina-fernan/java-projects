package exercises.week04.excercise6;

import java.util.HashSet;
import java.util.Set;

public class AdvanceBackpackApplication {

    public static void main(String[] args) {

        Item item1 = new Item("notebook");
        Item item2 = new Item("purse");
        Item item3 = new Item("toothpaste");
        Item item4 = new Item("toothpaste");
        Item item5 = new Item("purse");


        Set<Item> backpack = new HashSet<>();
        System.out.println(backpack);

        backpack.add(item1);
        backpack.add(item2);
        backpack.add(item3);
        backpack.add(item4);
        backpack.add(item5);

        System.out.println(backpack);

        if(item4.equals(item3))

        System.out.println("item4 is the same as item3");




        backpack.remove(item3);

        boolean containsitem3 = backpack.contains(item3);
        System.out.println("the backpack contains no longer toothpaste");

        System.out.println(backpack);

        System.out.println(backpack.size());




    }





}
