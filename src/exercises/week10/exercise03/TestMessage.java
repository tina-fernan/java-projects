package exercises.week10.exercise03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMessage {

    private MessageReader reader = new MessageReader();
    private List<Message> messages = reader.getMessage();

    //Which is the ratio between ham and spam sorted by highest first?
    @Test
    public void getRatioSortedHighestFirs() {
        String collect = messages.stream()
                .collect(Collectors.groupingBy(Message::getVersionOne, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " " + (e.getValue() * 100) / messages.size() + "%")
                .collect(Collectors.joining(" "));


        String expected = "ham 86% spam 13%";
        Assertions.assertEquals(expected, collect);


    }

    @Test
    public void getMostUsedWordHam() {
        Optional<String> first = messages.stream()
                .filter(e -> e.getVersionOne().equals("ham"))
                .map(e -> e.getVersionTwo())
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue())
                .findFirst();
        if (first.isPresent()) {
            System.out.println(first.get());

            Assertions.assertEquals("to | 1531", first.get());
        }
    }

    @Test
    public void getMostLetterHam() {
        Optional<String> ham = messages.stream()
                .filter(e -> e.getVersionOne().equals("ham"))
                .map(e -> e.getVersionTwo())
                .map(e -> e.split(" "))
                .flatMap(e -> Stream.of(e))
                .map(e -> e.split(""))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey())
                .findFirst();

        if (ham.isPresent()) {
            System.out.println(ham.get());

            Assertions.assertEquals("e", ham.get());
        }
    }
        @Test
        void getMostMessageSpam() {
            Optional<Integer> spam = messages.stream()
                    .filter(e -> e.getVersionOne().equals("spam"))
                    .map(e -> e.getVersionTwo())
                    .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()))
                    .entrySet().stream()
                    .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                    .map(e -> e.getValue().get(0).length())
                    .findFirst();
            if (spam.isPresent()) {
                System.out.println(spam.get());

                Assertions.assertEquals(224, spam.get());
            }


        }




    }



