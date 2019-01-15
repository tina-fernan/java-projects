package excercise19Nov.excercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Screen {


    public String display(Customer customer) {
        if (customer.getCategory().equals("buisness")){
            System.out.println(customer.getName().toUpperCase());
            return customer.getName().toUpperCase();
        }


    else
        System.out.println(customer.getName().toLowerCase());
            return customer.getName().toLowerCase();

    }
    }

