package exercises.week10;

public class Main {
    public static void main(String[] args) {
        PokeManVarieties varieties = new PokeManVarieties();



        varieties.getNumberOfSpeed().forEach((k,v) -> System.out.println(k + v) );
    }
}
