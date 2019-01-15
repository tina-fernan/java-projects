package simpleExcerciseNov.excercise4Nov.exame16Nov;

import java.util.List;

public class PostMan {

    private List<Letter>letters;

    public PostMan(List<Letter> letters) {
        this.letters = letters;
    }

public void deiver(){
    while(areThereLetter()){
        deliverOneLetter();
    }
}

  private boolean areThereLetter(){
    return !letters.isEmpty();
}
 private void deliverOneLetter(){
    Letter letter = letters.get(0);
    letters.remove(0);
    System.out.println("Letter delivere to:" +letter.getAddress());
 }

}