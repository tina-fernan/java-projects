package weekSix.exercise01.exercise04;

public class Cent50 extends Money {

    //Create the Cent50, Cent20, Cent10, Cent5, Cent2 and Cent1 classes that
    // extend from Money and represent each particular coin. Assume that only these coins can be given back as change.
    // Forget about the 1 and 2 coins and every ticket.
    // You want to use Integer numbers. If you use Double, the program might misbehave with decimal approximations.

public Cent50(){
    super(50);
}

    @Override
    public String toString() {
        return "Cent50";
    }
}
