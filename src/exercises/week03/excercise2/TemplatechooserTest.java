package exercises.week03.excercise2;

import exercises.week03.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TemplatechooserTest {

    @Test
    void testPriviladgeTemplate() {

        Customer customer = new Customer("hokopoko", "privilage");
        Templatechooser templatechooser = new Templatechooser();

        String templatechoose = templatechooser.chooseTemplate(customer);

        assertEquals("privilaged", templatechoose);


    }

    @Test
    void testManTemplate() {
        Customer customer = new Customer("Mr", "Man");

        Templatechooser templatechooser = new Templatechooser();

        String templatechoose = templatechooser.chooseTemplate(customer);

        assertEquals("Man", templatechoose);

    }

    @Test
    void tesWomenTemplate() {
        Customer customer = new Customer("Mrs", "Woman");

        Templatechooser templatechooser = new Templatechooser();

        String templatechoose = templatechooser.chooseTemplate(customer);

        assertEquals("Mrs", templatechoose);


    }


}