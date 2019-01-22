package exercises.week7.weekSeven.exercise01.exercise07;

import java.util.ArrayList;
import java.util.List;

public class Vihcles {

    TypeTwoVihcle typeTwoVihcle=new TypeTwoVihcle();
    TypeOneVihcle typeOneVihcle=new TypeOneVihcle();

    public List<Vihcle>  getVihcles(Integer numberFivePersons,Integer numberOnePerson){
        List<Vihcle>transferVihcle=new ArrayList<>();

        for (int times=0 ; times < numberFivePersons ; times++) {

            transferVihcle.add(typeTwoVihcle);


        }
        for ( int times=0 ; times < numberOnePerson ; times++){
            transferVihcle.add(typeOneVihcle);
        }
        return transferVihcle;
    }
}
