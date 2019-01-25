package reflection.week10;


import exercises.week10.exercise03.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Book {
    //How many words are in the book?
    //How many distinct words are in the book?
    //Which words belong to the group of the longest words?
    //Which ones are the most appearing 5 words, sorted by most appearing and how many times do they appear?
    //Which ones are the most appearing 5 letters, sorted by most appearing and how many times do they appear?
    //How many times does the name Alice appear?
    private FileReader reader=new FileReader();

    public List<String> getBook(){
        return reader.asStream("reflection/week10/alice.txt")
                .map(e->e.toLowerCase())
                .map(e->e.replaceAll(",",""))
                .map(e->e.replaceAll(";",""))
                .map(e->e.replaceAll("’s",""))
                .map(e->e.replaceAll("’",""))
                .map(e->e.replaceAll("‘",""))
                .map(e->e.replaceAll(":",""))
                .map(e->e.replaceAll("#",""))
                .map(e->e.replaceAll("/",""))
                .map(e->e.replaceAll("-",""))
                .map(e->e.replaceAll("\\.",""))
                .map(e->e.replaceAll("\\*",""))
                .map(e->e.replaceAll("\\(",""))
                .map(e->e.replaceAll("\\)",""))
                .map(e->e.replaceAll("\\[",""))
                .map(e->e.replaceAll("\\]",""))
                .map(e->e.split(" "))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toList());

    }
}
