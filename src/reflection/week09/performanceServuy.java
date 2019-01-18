package reflection.week09;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class performanceServuy {


    private FileReader fileReader=new FileReader();

    public List<Performances> getPerformances() {

        return fileReader.asStream("reflection/week09/students-performance.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(convertToPerformances())
                .collect(Collectors.toList());
    }

    private Function<String[], Performances> convertToPerformances() {
        return e -> new Performances(e[0],e[1],Integer.valueOf(e[2]),Integer.valueOf(e[3]),Integer.valueOf(e[4]));
    }
}
