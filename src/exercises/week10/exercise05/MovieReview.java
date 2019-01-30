package exercises.week10.exercise05;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieReview {
    //How many distinct movie genres are there?
    //Which movie genre has the movie with the highest revenue? Display that movie as well.
    //Which movie genres have the two longest movies? Display those movies as well.
    private List<Movie>movies=new MovieReader().getMovies();

    public void getDistinctMovieGenre(){
        long count = movies.stream()
                .distinct()
                .count();
        System.out.println(count);
    }

    public void getHighestRevenue(){
        Optional<String> first = movies.stream()
                .map(e -> e.getGenres())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e2.getValue()))
                .map(e -> e.getValue() + " | " + e.getKey())
                .findFirst();
        System.out.println(first.get());
    }

//    public void getTwoLongestMoviesGenres(){
//        movies.stream()
//                .map(e->e.getRuntime())
//                .collect(Collectors.groupingBy(e->e,Collectors.toList()))
//                .entrySet().stream()

    }

