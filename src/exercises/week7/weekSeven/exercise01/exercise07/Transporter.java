package exercises.week7.weekSeven.exercise01.exercise07;

import java.util.List;
import java.util.Optional;

public class Transporter {
    //Define the class Transporter that has a method that
    // receives the number of vehicles of type 1 and the number of vehicles of type 2 that
    // the company is going to provide for the transportation as well as the number of celebrities that
    // they have to transport. This method returns true if those vehicles are enough to transport every celebrity. Otherwise it returns false.


public Boolean transport(Integer celebritiesNumber,Integer numberFivePersons,Integer numberOnePerson){
    List<Vihcle>vihcles=new Vihcles().getVihcles(numberFivePersons,numberOnePerson);
    for (Vihcle vihcle : vihcles) {

        if (vihcle.abletopick(celebritiesNumber)){
            celebritiesNumber=vihcle.remainedCelebrities(celebritiesNumber);
        }
    }if (celebritiesNumber>0){
        return false;

    }
    return true;
}

}
