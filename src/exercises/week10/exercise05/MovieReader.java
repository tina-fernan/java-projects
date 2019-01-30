package exercises.week10.exercise05;

import exercises.week10.exercise03.FileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieReader {

    private FileReader reader = new FileReader();

    public List<Movie> getMovies() {
        return reader.asStream("exercises/week10/exercise05/movies.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Movie(e[8], getGenres(e[1]), Long.valueOf(e[5]),
                        (e[6].length()==0)?0:Integer.valueOf(e[6])))
                .collect(Collectors.toList());

    }

    private List<String> getGenres(String array) {
        List<String> genreves = new ArrayList<>();
        if (array.length() < 3) {
        return genreves;
        }
        genreves = Stream.of(array.split("}, "))

                .map(s -> s.replace("\"", ""))
                .map(s -> s.replace("{", ""))
                .map(s -> s.replace("[", ""))
                .map(s -> s.replace("]", ""))
                .map(s -> s.replace("}", ""))
                .map(s -> s.split(","))
                .map(strings -> strings[1])
                .map(s -> s.replace(" name: ", ""))
                .collect(Collectors.toList());

        return genreves;
    }
}