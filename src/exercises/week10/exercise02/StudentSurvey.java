package exercises.week10.exercise02;

import reflection.week09.FileReader;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentSurvey {

    private FileReader fileReader=new FileReader();

    public List<Student> getPerformances() {

        return fileReader.asStream("reflection/week09/students-performance.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(convertToPerformances())
                .collect(Collectors.toList());
    }

    private Function<String[], Student> convertToPerformances() {
        return e -> new Student(e[0],e[1],Integer.valueOf(e[2]),Integer.valueOf(e[3]),Integer.valueOf(e[4]));
    }
}


