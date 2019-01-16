package exercises.HalloweenKid;


import java.util.List;

public class HalloweenApplication {

    public static void main(String[] args) {
        // gather kids (names, candy)
        // figure out the winner kid (the most candy)

        // Kid - domain - data
        // Journalist - agent - get list of kids
        // Halloween Judge - say who is the winner

        Journalist journalist = new Journalist();
        List<Kid> kids = journalist.getNeighborhoodKids();

        HalloweenJudge judge = new HalloweenJudge();
        judge.displayWhoIsTheWinner(kids);
    }

}