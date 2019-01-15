package Week02.exercise1.excercise05;

import java.util.List;

public class PedometerApplication {

    public static void main(String[] args) {
        StepGatherer stepGatherer = new StepGatherer();
        List<Integer> stepsFromEveryone = stepGatherer.gatherSteps();
        AverageCalculator averageCalculator = new AverageCalculator();
        Double averageNumberOfSteps = averageCalculator.calculateAverage(stepsFromEveryone);
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        Double averageDistance = distanceCalculator.calculateDistance(averageNumberOfSteps);
        System.out.println("the average distance is:" +averageDistance+"kilometers");

    }

}
