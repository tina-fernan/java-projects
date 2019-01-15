package week8SevenJan.exercise01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Archieve {

    public void getTrick(List<String>listTricks){

        Set<String>tricks = new HashSet<>(listTricks);

        int trickLength = tricks.size();
        System.out.println(  "Number of unique tricks: "+ trickLength);
        System.out.println( "Tricks: " + tricks);
    }
}
