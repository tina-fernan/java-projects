package excercise07;

import java.util.HashMap;
import java.util.Map;

public class DecisionMaker {
    private Map<String, String> winnerCases = winCases();

    public String compare(String move1, String move2) {

        if (move1.equals(move2)) {
            return "No one is winner! ";
        }

        if (player1Winner(move1, move2)) {
            return "player1 is winner";

        }

        if (player2Winner(move1, move2)) {
            return "player2 is winner";
        }
        return null;
    }

    private boolean player2Winner(String move1, String move2) {
        return winnerCases.get(move2).equals(move1);
    }

    private boolean player1Winner(String move1, String move2) {
        return winnerCases.get(move1).equals(move2);
    }

    public Map<String, String> winCases() {
        Map<String, String> defeat = new HashMap<>();
        defeat.put("paper", "rock");
        defeat.put("rock", "scissors");
        defeat.put("scissors", "paper");
        return defeat;
    }
}


