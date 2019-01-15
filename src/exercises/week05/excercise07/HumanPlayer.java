package excercise07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HumanPlayer implements Player {


    List<String> stringList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private List<Move> moves = Arrays.asList(new Rock(), new Scissors(), new Paper());

    @Override
    public String chooseMove() {

        String answer = scanner.nextLine();

        while (!valid(answer)) {
            System.out.println("please choose your moves : Rock , Scissors , Paper");
            answer = scanner.nextLine();
        }

        return answer;
    }

    public Boolean playAgain(){
        System.out.println("Do you want play again (true/false) ? ");
        return scanner.nextBoolean();
    }

    private Boolean valid(String answer) {

        return convertToString(moves).contains(answer);
    }

    private List<String> convertToString(List<Move> moves) {
        //   List<String> stringList=new ArrayList<>();
        for (Move move : moves) {
            stringList.add(move.getName());
        }
        return stringList;
    }

    // One human player (player 1) plays against the computer player (player 2).
    // Both players choose a move, either rock, scissors or paper.
    //The human player types in the move until it is typed correctly.
    //  A decision maker compares both moves and returns the result a message.
    // Both players answer if they want to play again.
    //The game repeats itself until either player chooses not to continue playing.
    // Make sure all combinations work by creating a test that covers them.


}
