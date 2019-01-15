package excercise07;

public class RockScissorPaperApplication {


    public static void main(String[] args) {
        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();
        DecisionMaker decisionMaker = new DecisionMaker();
        System.out.println("Welcome !!!  ");
        System.out.println("please choose your moves : Rock , Scissors , Paper");
        Boolean keepPlaying=true;
        while (keepPlaying){


            String move1 = humanPlayer.chooseMove();
            String move2 = computerPlayer.chooseMove();

            System.out.println("Player2 moves: "+move2);

            System.out.println(decisionMaker.compare(move1,move2));
            keepPlaying = humanPlayer.playAgain();
        }
    }
}
