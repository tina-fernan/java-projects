package simpleExcerciseNov.excercise4Nov.exame16Nov;

public class PostOfficeAssistant {

    public void stamp(Letter letter){
        letter.stamp();

    }
    public void send(Letter letter){

        if(letter.isStamped()){
            System.out.println("we will send the Letter to"+letter.getAddress());

        }else {

            System.out.println("we have to stamp it first");
        }
    }


}
