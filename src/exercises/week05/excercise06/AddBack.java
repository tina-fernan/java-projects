package excercise06;

public class AddBack implements Step {


    @Override
    public void perform(Furtniture furniture) {
        furniture.add("back");
    }
}