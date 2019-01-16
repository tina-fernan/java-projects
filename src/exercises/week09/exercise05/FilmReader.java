package exercises.week09.exercise05;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilmReader {
    public List<Film> getFilms() {
        return new FileReader().asStream("week09/exercise05/films.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(convertToFilm())
                .collect(Collectors.toList());


    }

    private Function<String[], Film> convertToFilm() {
        return e -> new Film(e[8], Double.valueOf(e[9]), Long.valueOf(e[10]), Integer.valueOf(e[6]), Integer.valueOf(e[5]), Long.valueOf(e[0]));
    }

}
