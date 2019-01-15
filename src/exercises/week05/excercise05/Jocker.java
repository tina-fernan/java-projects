package excercise05;

public class Jocker implements Villian {
    //Create the Joker class that implements Villain.
    // It has the lives attribute that starts with the value ten.
    private Integer live = 10;

    // In its weaken method, display the message “Damn you, <Superhero’s name>! You managed to weaken me!”
    // and subtract one from his lives counter.



    @Override
    public void weaken(String name) {
        if(live==0){
            System.out.println("you all deafted me! But I will be back");

        }else{


            System.out.println("Damn you," + name + " ! You managed to weaken me!");
            live--;
        }

    }

    @Override
    public String getName() {
        return "jocker";
    }


    // If his lives reaches zero, he displays the message “You all defeated me! But I will be back!”.
    //If his lives reaches zero, he displays the message “You all defeated me! But I will be back!”.

}
