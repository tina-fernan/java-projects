package excercise07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {

private List<Move>moves = Arrays.asList(new Rock(),new Scissors(),new Paper());
    List<String> stringList=new ArrayList<>();
private Random random=new Random();

    @Override
    public String  chooseMove() {

        int position=random.nextInt(moves.size());
        Move move=moves.get(position);
        convertToString(moves);
        int answerPosition = moves.indexOf(move);
        String answer=stringList.get(answerPosition);
        return answer ;
    }

    private List<String> convertToString(List<Move> moves) {
     //   List<String> stringList=new ArrayList<>();
        for (Move move : moves) {
            stringList.add(move.getName());
        }
        return  stringList;
    }
}
