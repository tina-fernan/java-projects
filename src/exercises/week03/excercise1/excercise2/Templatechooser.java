package excercise19Nov.excercise1.excercise2;

import excercise19Nov.excercise1.Customer;

import javax.naming.Name;

public class Templatechooser {

    public String chooseTemplate(Customer customer) {

        if (customer.getName().contains("hokopoko")) return "privilaged";

        else if (customer.getName().startsWith("Mr")) return "Man";

        else return "Women";


    }


}
