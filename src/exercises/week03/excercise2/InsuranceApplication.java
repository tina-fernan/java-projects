package exercises.week03.excercise2;


import exercises.week03.Customer;

public class InsuranceApplication {

    public static void main(String[] args) {
        Customer customer = new Customer("hokopoko","privileged");
        Customer customer1 = new Customer("Mr steigel","business");

        Templatechooser templatechooser = new Templatechooser();
        System.out.println(templatechooser.chooseTemplate(customer));

    }

}

