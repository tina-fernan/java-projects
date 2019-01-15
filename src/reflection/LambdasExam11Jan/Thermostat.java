package LambdasExam11Jan;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {
//
//    The Thermostat has a trigger condition and a display function. It receives them via constructor, so they can be customized every time a new one is created.
//    The Thermostat has the sense method that receives the temperature in degrees Celsius as a Double and returns a String with a message. As long as the condition doesn’t get triggered, the message provided by the display function is returned. If the condition gets triggered, then the message “Warning!” is returned.
//    Create the ThermostatTest class to make sure the Thermostat works correctly in the scenarios provided by Hansel.

private Predicate<Double>trigger;
private Function<Double,String>display;

    public Thermostat(Predicate<Double> trigger, Function<Double, String> display) {
        this.trigger = trigger;
        this.display = display;
    }

public String sense(Double temperture){
        if (trigger.test(temperture)){
            return "Warning";
    }
        return display.apply(temperture);
}


}
