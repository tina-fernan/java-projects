package reflection.examWeek06;

public class ManualCar extends Car{

    public ManualCar(String brand) {
        super(brand);
    }

    @Override
    protected String getType() {
        return "Manual";
    }
}
