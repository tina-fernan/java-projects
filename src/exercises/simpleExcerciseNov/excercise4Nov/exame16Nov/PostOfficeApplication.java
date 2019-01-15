package simpleExcerciseNov.excercise4Nov.exame16Nov;

import java.util.ArrayList;
import java.util.List;

public class PostOfficeApplication {


    public static void main(String[] args) {

        Letter letter = new Letter("1234 blueberrey");
        PostOfficeAssistant assistant = new PostOfficeAssistant();

        assistant.stamp(letter);
        assistant.send(letter);

        List<Letter>letters=new ArrayList<>();

        Letter letter1 =new Letter("2345 chocolate");
        Letter letter2= new Letter("7898 rose");
        Letter letter3=new Letter("4798 music");

        PostMan postMan=new PostMan(letters);
        postMan.deiver();



    }
}
