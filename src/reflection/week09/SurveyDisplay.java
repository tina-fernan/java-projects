package reflection.week09;

import java.util.List;
import java.util.stream.Collectors;

public class SurveyDisplay {
    //How many boys and girls are there?
    //Which are the distinct parental levels of education sorted alphabetically?
    //How many students scored higher than a 90 on every topic?
    //How many students scored exactly 100 on every topic? Which ones are their genders?

    List<Performances>performances=new performanceServuy().getPerformances();

    public void surveyStudents(){
        getGender();
        getParental();
        getHundered();
        getEveryTopic();
    }

    private void getGender(){

        List<Integer> collect = performances.stream()
                .map(e -> e.getGender().length())
                .collect(Collectors.toList());
        System.out.println("The number of boys and girls :");
        System.out.println(collect);
    }

    private void getParental(){
        List<String> collect = performances.stream()
                .map(e -> e.getParentalEducation())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Parental level of Education sorted Alphabetically");
        System.out.println(collect);
    }

    private void getEveryTopic(){
        List<Performances> collect = performances.stream()
                .filter(e -> e.getMathScore() > 90)
                .filter(e -> e.getReadingScore() > 90)
                .filter(e -> e.getWrikttingScore() > 90)
                .collect(Collectors.toList());
        System.out.println("Students score higher than 90");
        System.out.println(collect);
    }

    private void getHundered(){
        List<String> collect = performances.stream()
                .filter(e -> e.getMathScore() == 100)
                .filter(e -> e.getWrikttingScore() == 100)
                .filter(e -> e.getReadingScore() == 100)
                .map(e -> e.getGender())
                .collect(Collectors.toList());
        System.out.println("Students get 100 in every topics ");
        System.out.println(collect);
    }


}
