package exercises.week10.exercise04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Character {

    private List<Characters> characters =new CharacterReader().getCharectors();

    //How many characters appear in the books in total?

    public void getTotalCharacters() {
        long count = characters.stream()
                .count();


    }
    public Long getNumberDied(){
        long count = characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .count();
        System.out.println("the number of dead people: " +count);
        return count;
    }

    public String getPercentageMenWomenDiedBooks(){
        String women = characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .map(e -> e.getGender())
                .collect(groupingBy(e -> e, counting()))
                .entrySet().stream()
                .map(e -> e.getKey().replace("0", "women").replace("1", "Man" +
                        "") + " " + (e.getValue() * 100) / getNumberDied() + " % ")
                .collect(joining());
        System.out.println(women);
        return women;

    }

    public String getBookBiggestDeathCount(){
        Optional<Map.Entry<String, Long>> first = characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(groupingBy(e -> e.getBookDeath(), counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst();
        System.out.println(first.get());
        return first.get().getKey();
    }


    public void getDiedNameInBook(){
        String biggestDeadBook=getBookBiggestDeathCount();
        List<String> collect = characters.stream()
                .filter(e -> e.getBookDeath().equals(biggestDeadBook))
                .map(e -> e.getName())
                .collect(toList());
        System.out.println(collect);

         //.collect(groupingBy(Characters::getBookDeath, mapping(Characters::getName), toList()));




    }

//Which ones are the two allegiances that have the biggest dead count?
    public void getTwoBiggestAllegianceDead(){
        List<String> collect = characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(groupingBy(e -> e.getAllegiances(), counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " with number of " + e.getValue()+" have the biggest dead ")
                .limit(2)
                .collect(toList());
        System.out.println(collect);

    }
//Which percentage of deaths belong to nobility characters?
    public String  getPercentageNobilityDeath(){
        long numberOfNobilityChar= characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e->e.getNobility().equals("1"))
                .count();
        long number=getNumberDied();
        return (numberOfNobilityChar * 100 )/number+"%";

    }
//In which book die the most amount of characters from the Stark allegiance?
    public void getBookMostCharectersStark(){
        Optional<String> stark = characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> e.getAllegiances().equals("Stark"))
                .collect(groupingBy(e -> e.getBookDeath(), counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey())
                .findFirst();
        System.out.println( "the most amount of death characters from the Stark allegiance : " +stark.get());


    }

//In which book die the most amount of characters from the Lannister allegiance?
    public void getBookMostCharectorLannister(){
        Optional<String> lannister = characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> e.getAllegiances().equals("Lannister"))
                .collect(groupingBy(e -> e.getBookDeath(), counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey())
                .findFirst();
        System.out.println( "the most amount of death characters from the Lannister allegiance : " +lannister.get());
    }
//How many Starks have died?
    public void getNumberStark(){
        long count = characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> e.getAllegiances().equals("Stark"))
                .count();
        System.out.println("the number of dead Stark : " +count);
    }
//How many Lannisters have died?
    public void getNumberLannisters(){
        long count = characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> e.getAllegiances().equals("Lannister"))
                .count();
        System.out.println("the number of dead Lannister : " +count);
    }
//Is there any character who didn’t die?
    public void getCharecterAlive(){
        boolean notDie = characters.stream()
                .anyMatch(e -> e.getDeathYear().isEmpty());

        if (notDie) {
            System.out.println("there are people who are alive");
            return;
        }

        System.out.println("all are dead");
    }
//Has any character ever been killed in the same chapter that it got introduced?
    public void getKilledCharecterChapter(){

        boolean anyKilled = characters.stream()
                .filter(e->!e.getDeathYear().isEmpty())
                .anyMatch(e -> e.getBookIntroChapter()== e.getBookDeath());

        if (anyKilled){
            System.out.println("the character have been killed in the same chapter");
            return;
        }
        System.out.println("there have not been any killed character killed in the same chapter");
    }









}
