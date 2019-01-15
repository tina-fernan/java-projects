package example.Clothes.HalloweenKid;

import java.util.List;

public class HalloweenJudge {

    public void displayWhoIsTheWinner(List<Kid> kids) {
        if (kids.isEmpty()) {
            System.out.println("There is no winner.");
            return;
        }
        Kid winner = getWinner(kids);
        display(winner);
    }


    private Kid getWinner(List<Kid> kids) {
        Kid winner = kids.get(0);
        for (Kid kid : kids) {
            if (hasMoreCandy(kid, winner)) {
                winner = kid;
            }
        }
        return winner;
    }

    private boolean hasMoreCandy(Kid kid, Kid winner) {
        return kid.getNumberOfCandies() > winner.getNumberOfCandies();
    }

    private void display(Kid winner) {
        System.out.println("The winner is "
                + winner.getName()
                + " with "
                + winner.getNumberOfCandies()
                + " candies");
    }

}