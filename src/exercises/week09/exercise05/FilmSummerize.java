package exercises.week09.exercise05;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummerize {
     private   static   List<Film> films = new FilmReader().getFilms();
    public static void main(String[] args) {

        List<Film> highestRating = films.stream()
                .sorted(Comparator.comparing(Film::getScore))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(highestRating);
        //Top 3 with highest rating, sorted by rating:
        //[“Stiff Upper Lips”, “Dancer, Texas Pop. 81”, “Me You and Five Bucks”]

        List<Film> longHour = films.stream()
                .sorted(Comparator.comparing(Film::getRunTime))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(longHour);

        List<Film> budget = films.stream()
                .sorted(Comparator.comparing(Film::getBudget))
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(budget);


        List<Film> shortFilm = films.stream()
                .filter(e -> e.getRunTime() < 90)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(shortFilm);


        List<Film> budgetBetween = films.stream()
                .filter(e -> e.getScore() > 7)
                .filter(e -> e.getBudget() > 50.000)
                .filter(e -> e.getBudget() < 500.000)
                .sorted(Comparator.comparing(Film::getBudget))
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(budgetBetween);


    }
}
