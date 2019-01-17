package exercises.HalloweenKid;
import java.util.ArrayList;
import java.util.List;

public class Journalist {

    public List<Kid> getNeighborhoodKids() {

        List<Kid> kids = new ArrayList<>();

        Kid jimmy = new Kid("Jimmy", 10);
        kids.add(jimmy);
        kids.add(new Kid("Tom", 4));
        kids.add(new Kid("Sam", 16));
        kids.add(new Kid("Pamela", 11));
        return kids;
    }

}