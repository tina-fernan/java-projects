package exercises.week03;

public class Customer {

    private String name;
    private String category = "Economic";

    public Customer(String name,String category) {
        this.name = name;
        this.category=category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
