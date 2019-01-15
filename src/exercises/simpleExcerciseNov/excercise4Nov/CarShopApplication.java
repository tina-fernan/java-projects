package simpleExcerciseNov.excercise4Nov;

public class CarShopApplication {

    public static void main(String[] args) {

        Seller seller= new Seller();
        Car car0 = new Car("BMW");
        Car car1 = new Car("Hundai");
        Car car2 = new Car("KIA");

        seller.describe(car0);
        seller.describe(car1);
        seller.describe(car2);





    }
}
