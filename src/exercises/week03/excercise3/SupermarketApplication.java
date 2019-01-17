package exercises.week03.excercise3;

public class SupermarketApplication {

    public static void main(String[] args) {

        Double weight = new Double("7.98");
        NummberCorrector nummberCorrector = new NummberCorrector();
        System.out.println(nummberCorrector.correct(weight));


    }
}
