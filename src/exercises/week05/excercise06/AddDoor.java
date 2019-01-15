package excercise06;

public class AddDoor implements Step {

    @Override
    public void perform(Furtniture furniture) {
        furniture.add("door");

    }
}
