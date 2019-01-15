package excercise19Nov.excercise1;

public class ScreenApplication {

    public static void main(String[] args) {
        Customer customer = new Customer("Ricardo","buisness");
        Customer customer1 = new Customer("Maria","Economic");

        Screen screen= new Screen();
        screen.display(customer);
        screen.display(customer1);

    }

}
