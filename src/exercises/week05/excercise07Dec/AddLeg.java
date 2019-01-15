package excercise07Dec;

import excercise06.Furtniture;
import excercise06.Step;

public class AddLeg implements Step {

    @Override
    public void perform(Furtniture furniture) {
        furniture.add("leg");

    }



}
