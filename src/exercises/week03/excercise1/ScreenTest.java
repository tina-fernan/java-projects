package excercise19Nov.excercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScreenTest {

    @Test
    void testEconomicClass() {
      Customer customer= new  Customer("Maria","economic");


        Screen screen = new Screen();
        String displayedName =screen.display(customer);
        assertEquals("maria", displayedName);

    }
    @Test
    void testBuisnessClass(){

        Customer customer= new Customer("Ricardo","buisness");

        Screen screen = new Screen();
        String displayedName = screen.display(customer);
        assertEquals("RICARDO", displayedName);


    }

}