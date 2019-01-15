package Week02.exercise1.excercise05;

import java.util.List;

public class AverageCalculator {

    public Double calculateAverage(List<Integer>stepsFromEveryOne){

        Integer sum = 0;
        for (Integer steps : stepsFromEveryOne){
            sum += steps;
        }

        Double average = sum / new Double(stepsFromEveryOne.size());
        return average;

    }
}
