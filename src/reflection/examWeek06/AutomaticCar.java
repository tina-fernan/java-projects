package reflection.examWeek06;

public class AutomaticCar extends Car {

    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    protected String getType() {
        return "Automatic";
    }
}
