package exercises.week04.excercise03;

import java.util.HashMap;
import java.util.Map;

public class BasicIndexApplication {

    public static void main(String[] args) {

        Map<Integer,String>book = new HashMap<>();

        Integer page1 = 2;
        Integer page2 = 3;
        Integer page3 = 5;

        String topic1="business";
        String topic2="math";
        String topic3= "history";
        String topic4= "sport";

        book.put(page1,topic1);
        book.put(page2,topic2);
        book.put(page3,topic3);
        book.put(page3,topic4);

        System.out.println(book.keySet());
        System.out.println(book.values());

        boolean isTopic1There = book.containsKey(page1);
        System.out.println("Is topic1 there : " + isTopic1There);

        book.get(topic2);
        System.out.println(book.size());

    }












}
