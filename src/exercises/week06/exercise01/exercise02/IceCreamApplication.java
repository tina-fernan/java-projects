package weekSix.exercise01.exercise02;

public class IceCreamApplication {

    public static void main(String[] args) {

        ConeIceCream cone = new ConeIceCream("Chocolate","Oreo");
        System.out.println(cone.eat());

        CupIceCream cup = new CupIceCream("Vanilla","cookies");
        System.out.println(cup.eat());


    }
}