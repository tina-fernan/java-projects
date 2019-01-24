package exercises.week10.exercise01;

import reflection.week09.FileReader;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PokeMonReader {


    private FileReader fileReader = new FileReader();


    public List<PokeMon> getPoke() {

        return fileReader.asStream("exercises/week10/exercise01/pokemon.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(transformToPokeMan())
                .collect(Collectors.toList());

    }

    private Function<String[], PokeMon> transformToPokeMan() {
        return e -> new PokeMon(
                Integer.valueOf(e[0]),
                e[1],
                e[2],
                e[3],
                Integer.valueOf(e[4]),
                Integer.valueOf(e[5]),
                Integer.valueOf(e[6]),
                Integer.valueOf(e[7]),
                Integer.valueOf(e[8]),
                Integer.valueOf(e[9]),
                Integer.valueOf(e[10]),
                Integer.valueOf(e[11]),
                Boolean.valueOf(e[12]));
    }

}