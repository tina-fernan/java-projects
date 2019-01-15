package simpleExcerciseNov.Excercise3Nov;

public class PaintingApplication {

    public static void main(String[] args) {

        Derek derek=new Derek();
        derek.hangPaiting();


         Tool tool=new Tool("hammer");
         derek.setTool(tool);
         derek.hangPaiting();
    }

}
