package weekSix.exercise01.exercise02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamTest {

    @Test
    void eatTestConeIceCream() {
        ConeIceCream cone = new ConeIceCream("Chocolate","Oreo");
        String message = cone.eat();
        String text= "The Chocolate ice-cream with Oreo is licked";

         assertEquals(text,message);


    }

    @Test
    void eatTestCupIceCream() {
        CupIceCream cup= new CupIceCream("Vanilla","cookies");
        String messsage = cup.eat();
        String text ="The Vanilla ice-cream with cookies is eaten with a spoon";

        assertEquals(text,messsage);
    }
}