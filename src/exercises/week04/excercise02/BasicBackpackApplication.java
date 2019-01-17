package exercises.week04.excercise02;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {

    public static void main(String[] args) {


        Set<String> backpack = new HashSet<>();
        System.out.println(backpack);

        String backpack1="toothpaste";
        String backpack2="purse";
        String backpack3="towel";
        String backpack4="towel";



        backpack.add(backpack1);
        backpack.add(backpack2);
        backpack.add(backpack3);

        System.out.println(backpack);

        boolean containstowel = backpack.contains("towel");
        System.out.println("is towel there? : " + containstowel);

        backpack.remove("purse");
        System.out.println(backpack);

       boolean containspurse=backpack.contains("purse");
        //if(!contain("purse")
        System.out.println("is purse there? : " +containspurse);

        System.out.println(backpack.size());






    }

}
