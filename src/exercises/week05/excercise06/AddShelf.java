package excercise06;

public class AddShelf implements Step {

    @Override
    public void perform(Furtniture furniture) {
        furniture.add("shelf");

    }
}
