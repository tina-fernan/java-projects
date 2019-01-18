package reflection.week09;

import java.util.List;
import java.util.stream.Collectors;

public class SurveyDisplay {


    List<Performances>performances=new performanceServuy().getPerformances();


    public void surveyStudents(){
        getGender();
        getParental();
        getEveryTopic();
        getHundered();
    }

    private void getGender(){

        long collect = performances.stream()
                .filter(e->e.getGender().contains("femal"))
                .count();
        long male = performances.size() - collect;

        System.out.println("Total number of student performance entries: " + performances.size());
        System.out.println("Number of female students: " + collect);
        System.out.println("Number of male students: " + male);

    }

    private void getParental(){
        List<String> collect = performances.stream()
                .map(e -> e.getParentalEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Parental level of Education sorted Alphabetically : ");
        System.out.println(collect);
    }

    private void getEveryTopic(){
        long collect = performances.stream()
                .filter(e -> e.getMathScore() > 90)
                .filter(e -> e.getReadingScore() > 90)
                .filter(e -> e.getWrikttingScore() > 90)
                .count();

        System.out.println("Students score higher than 90");
        System.out.println(collect);
    }

    private void getHundered(){
        Long collect = performances.stream()
                .filter(e -> e.getMathScore() == 100)
                .filter(e -> e.getWrikttingScore() == 100)
                .filter(e -> e.getReadingScore() == 100)
                .map(e -> e.getGender())
                .count();

        System.out.println("Students get 100 in every topics ");
        System.out.println(collect);
    }


}
