package Week02.exercise1.exercise2;

import Week02.exercise1.Hiker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gathere {

    public List<Hiker> signUp() {

        List<Hiker> hikers = new ArrayList<>();
        String name = getName();

        while (!name.isEmpty()) {
            Hiker hiker = new Hiker(name);
            hikers.add(hiker);
            name = getName();
        }

        AutomaticGatherer automatic = new AutomaticGatherer();
        hikers.addAll(automatic.getConfirmedHikers());

        return hikers;
    }

    private String getName() {
        System.out.println("please enter your name?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}


