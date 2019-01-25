package reflection.week10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookReview {

    private List<String>books=new Book().getBook();



    public  void getNumberOfWords(){

        int size = books.size();
        System.out.println(size);
    }

    public void getDistinctWords(){
        long count = books.stream()
                .distinct()
                .count();
        System.out.println(  "the Distinct is : " +count);
    }
    public void getGroupsOfLongestWords(){
        List<String> collect = books.stream()
                .collect(Collectors.groupingBy(e -> Integer.valueOf(e.length()), Collectors.toList()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .limit(1)
                .map(Map.Entry::getValue)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println( "the longest word : " +collect);

    }
    public void getMostAppearingWords(){
        List<String> collect = books.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getValue() + " | " + e.getKey())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println( "The most appearing words : " +collect);
    }
    public void getMostAppearingletters(){
        List<String> collect = books.stream()
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getValue() + " | " + e.getKey())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println( "the most appearing letters : " +collect);


    }



    public void getNumberOfAlice(){
        long count = books.stream()
                .filter(e -> e.equalsIgnoreCase("Alice"))
                .count();
        System.out.println( " the number of Alice name is :" +count);
    }
}
