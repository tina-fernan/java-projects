package exercises.week10.exercise04;

import exercises.week10.exercise03.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterReader {

    private FileReader fileReader=new FileReader();

    public List<Characters> getCharectors(){
        return fileReader.asStream("exercises/week10/exercise04/got-characters.csv")
                .skip(1)
                .map(e->e.split(";"))
                .map(e->new Characters(e[0],e[1],e[2],e[3],e[4],e[5],e[6],e[7]))
                .collect(Collectors.toList());
    }



}
