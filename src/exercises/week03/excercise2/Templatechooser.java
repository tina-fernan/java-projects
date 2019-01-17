package exercises.week03.excercise2;


import exercises.week03.Customer;

public class Templatechooser {

    public String chooseTemplate(Customer customer) {

        if (customer.getName().contains("hokopoko")) return "privilaged";

        else if (customer.getName().startsWith("Mr")) return "Man";

        else return "Women";


    }


}
