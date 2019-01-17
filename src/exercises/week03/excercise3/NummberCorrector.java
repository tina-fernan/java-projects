package exercises.week03.excercise3;

public class NummberCorrector {

    public Integer correct(Double weight){
        weight= Math.floor(weight);
        Integer correctweight = weight.intValue();
        return correctweight;
    }
}
