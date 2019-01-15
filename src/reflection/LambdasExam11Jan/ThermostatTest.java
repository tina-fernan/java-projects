package LambdasExam11Jan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {

    @Test
    void testGoesSking() {
       Thermostat thermostat= new Thermostat(t -> t < 0.0, t -> t + " degrees Celsius");
       String message=thermostat.sense(2.0);
       String expected ="2.0 degrees Celsius";

       Assertions.assertEquals(expected,message);

       message=thermostat.sense(-1.0);

       Assertions.assertEquals("Warning",message);

    }

    @Test
    void testgoesSaunasense() {
        Thermostat thermostat = new Thermostat(t -> t >= 80.0, t -> t + 273.15 + " degrees Kelvin");

        String message=thermostat.sense(79.0);

        Assertions.assertEquals("352.15 degrees Kelvin",message);

        message=thermostat.sense(80.0);

        Assertions.assertEquals("Warning",message);

    }
}