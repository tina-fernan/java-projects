package exercises.week09.exercise05;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummerize {

    List<Film> films = new FilmReader().getFilms();

    public void summerizeFilm(){
        getHighestRating();
        getLongHour();
        getExpensiveBudget();
        getShortFilm();
        getBudgetBetween();
        gethighestrevenue();
    }


    private void  getHighestRating() {
        List<String>collect= films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
        System.out.println("Top 3 with highest rating, sorted by rating: "
        );

        System.out.println(collect);

    }

private void getLongHour() {

    List<String> longHour = films.stream()
            .filter(e -> e.getRunTime() > 180 )
            .sorted(Comparator.comparing(Film::getScore).reversed())
            .limit(3)
            .map(e -> e.getTitle())
            .collect(Collectors.toList());
    System.out.println("Top 3 with highest rating longer than 3 hours, sorted by rating: ");

    System.out.println(longHour);
}
private void getExpensiveBudget() {
    List<String> budget = films.stream()
            .sorted(Comparator.comparing(Film::getBudget).reversed())
            .limit(4)
            .map(e -> e.getTitle())
            .collect(Collectors.toList());
    System.out.println("Top 4 most expensive, sorted by budget:\n");
    System.out.println(budget);
}
private void getShortFilm() {

    List<String> shortFilm = films.stream()
            .filter(e -> e.getRunTime() < 90)
            .sorted(Comparator.comparing(Film::getBudget).reversed())
            .limit(4)
            .map(e -> e.getTitle())
            .collect(Collectors.toList());
    System.out.println("Top 4 most expensive shorter than 90 minutes, sorted by budget: ");

    System.out.println(shortFilm);
}
private void getBudgetBetween() {
    List<String> budgetBetween = films.stream()
            .filter(e -> e.getScore() > 7)
            .filter(e -> e.getBudget() > 50000)
            .filter(e -> e.getBudget() < 500000)
            .sorted(Comparator.comparing(Film::getBudget).reversed())
            .limit(4)
            .map(e -> e.getTitle())
            .collect(Collectors.toList());
    System.out.println("Top 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget: ");

    System.out.println(budgetBetween);

}
private void gethighestrevenue(){
        List<String>revenue=films.stream()
                .sorted(Comparator.comparing(Film::getRevenue).reversed())
                .limit(4)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
    System.out.println("Top 4 the highest revenue");

    System.out.println(revenue);
}
    }

