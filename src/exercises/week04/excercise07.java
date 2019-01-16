package excercise26Nov.excercise01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class excercise07 {

    public static void main(String[] args) {



        Topic topic1 = new Topic("health");
        Topic topic2 = new Topic("diet");
        Topic topic3 = new Topic("excercise");
        Topic topic4 = new Topic("peace");

        Map<Integer, List<Topic>> index = new HashMap<>();
        System.out.println(index);



        Integer page1 = new Integer(4);
        Integer page2 = new Integer(17);

        List<Topic> topics1 = new ArrayList<>();

        topics1.add(topic1);

        List<Topic> topics2= new ArrayList<>();

        topics2.add(topic2);
        topics2.add(topic3);

        index.put(page1 , topics1);
        index.put(page2 , topics2);

        System.out.println(index);

        List<Topic> stored = index.get(page1);
        System.out.println(stored);

        boolean isPage2 =index.containsKey(page2);
        if(index.containsKey(page2));

        System.out.println("The page 2 exists as a Key");

        List<Topic> stored2 = index.get(page2);

        System.out.println(stored2);

        System.out.println(index.size());









    }
}
