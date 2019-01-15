package excercise01.examWeekSix14Dec;

public class AutomaticCar extends Car {

    public AutomaticCar(String brand) {
        super(brand);
    }
    @Override
    protected String getType() {
        return "Automatic";
    }
}


    //The AutomaticCar and ManualCar classes extend from Car and add the necessary code.
    //The Cars class has the getNextCar method that receives a brand and
    // creates a random automatic or manual car to return it as a Car.

        //The Hansel class has the haveATry method that receives a Car and drives it to display the following message “I love this <car kind> <brand>”.
        //The CarTest class makes sure the drive method of both cars returns the correct text.
        //The CarApplication creates one Hansel and using the Cars class tries 10 cars.



