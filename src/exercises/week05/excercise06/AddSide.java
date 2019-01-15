package excercise06;

public class AddSide implements Step{
    @Override
    public void perform(Furtniture furniture) {
        furniture.add("side");

    }

    //They implement Step.
    // Each one of them adds only one part of the following respectively to the furniture:
    // side, top, bottom, back, shelf and door.
}




