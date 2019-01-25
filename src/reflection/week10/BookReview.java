package reflection.week10;

import java.util.List;

public class BookReview {

    private List<Alice>books=new Book().getBook();

    public void getNumberOfWords(){
        long count = books.stream()
                .map(e -> !e.getWord().isEmpty())
                .count();
        System.out.println(count);
    }

    public void getDistinctWords(){
        books.stream()
                .
    }
}
