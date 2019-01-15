package excercise06;

public class AddTop implements Step {


    @Override
    public void perform(Furtniture furniture) {
      furniture.add("top");
    }
}
