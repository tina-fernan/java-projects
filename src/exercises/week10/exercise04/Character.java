package exercises.week10.exercise04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Character {

    private List<Characters> characters =new CharacterReader().getCharectors();

    //How many characters appear in the books in total?

    public void getTotalCharacters() {
        long count = characters.stream()
                .count();


    }
    public void getNumberDied(){
        characters.stream()
                .filter(e->!e.getDeathYear().isEmpty())
                .count();

    }
    public void getPercentageMenWomenDiedBooks(){
        characters.stream()
                .filter(e->e.getBookDeath().equals("female")&& e.getBookIntroChapter().equals("femal"))
                .
    }




    //How many characters died?

    //Display the overall percentage of men and women that died in all books.
    //Which book has the biggest death count with how many?
    //Who died in that book?
}
