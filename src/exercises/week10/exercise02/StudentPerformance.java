package exercises.week10.exercise02;

import java.util.*;
import java.util.stream.Collectors;

public class StudentPerformance {
    private List<Student> students = new StudentSurvey().getPerformances();

    public void displayPerformance(){
        getAppearenceNumberOfParentLevelEducation();
        getStudentParentHighDegreeWithLowerGrade();
        getTopThreeStudents();
        getHighSchoolTopic95();
    }

    private void getAppearenceNumberOfParentLevelEducation() {

        Map<String, Long> educationAppearence = students.stream()
                .collect(Collectors.groupingBy(Student::getParentalEducation, Collectors.counting()));

        System.out.println( "Parent education level appearances: ");
        System.out.println(educationAppearence);

        System.out.println("Parent education level appearances sorted top bottom:");
        educationAppearence.entrySet().stream()
                .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getValue() + " times  " + e.getKey())
                .forEach(System.out::println);


    }
    private void getStudentParentHighDegreeWithLowerGrade(){
        Long count=students.stream()

                .filter(e -> e.getParentalEducation().equals("master's degree"))
                .filter(student -> student.getMathScore() < 60)
                .filter(student -> student.getReadingScore() < 60)
                .filter(student -> student.getWrikttingScore() < 60)
                .count();

        System.out.println("Number of students with high parent education and lower scores than 60 : " + count);


    }


    private void getTopThreeStudents() {
        System.out.println("Genders and average scores of the top four average score students: ");
        students.stream()
                .filter(e -> e.getAverageScore() >95)
                .sorted(Comparator.comparing(Student::getAverageScore).reversed())
                .limit(4)
                .map(e ->  e.getGender() + "\t| " +e.getAverageScore())
                .forEach(e -> System.out.println(e));

    }

    private void getHighSchoolTopic95(){
        boolean high_school = students.stream()
                .filter(student -> student.getParentalEducation().equals("high school"))
                .anyMatch(student -> student.getAverageScore() >= 95);
        System.out.println( high_school);

    }

}