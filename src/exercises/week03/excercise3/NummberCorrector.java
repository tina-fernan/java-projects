package excercise19Nov.excercise1.excercise3;

public class NummberCorrector {

    public Integer correct(Double weight){
        weight= Math.floor(weight);
        Integer correctweight = weight.intValue();
        return correctweight;
    }
}
