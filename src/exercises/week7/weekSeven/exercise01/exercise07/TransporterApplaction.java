package exercises.week7.weekSeven.exercise01.exercise07;

import java.util.Scanner;

public class TransporterApplaction {
    //Write a code that asks for the number of vehicles of type 1 and 2, and
    // also for the number of celebrities and says if it is possible to transport all of them.


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Transporter transporter = new Transporter();

        System.out.println("How many Vihcles of type one are there? ");
        Integer numberOnePerson=scanner.nextInt();
        System.out.println("How many Vihcles of type two are there? ");
        Integer numberTwoPersons=scanner.nextInt();
        System.out.println("how many celebrities are there? ");
        Integer celebritiesNumber=scanner.nextInt();

        Boolean isAbleToTransport = transporter.transport(celebritiesNumber, numberTwoPersons, numberOnePerson);

        if(isAbleToTransport){
            System.out.println("cool!all Celebrities picked up and are going to events.");
        } else {
            System.out.println("there are not enough Vihcles!");
        }

    }
}
