package exercises.week04.excercise10;

import exercises.week04.Topic;
import exercises.week04.excercise09.FileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TopicReader {

    private FileReader fileReader = new FileReader();


    public List<Topic> getTopics() {
        List<String> lines = fileReader.getLines("excercise26Nov/excercise01/excercise10/topics.txt");


        List<Topic> topics = new ArrayList<>();

        for (String line : lines) {
            topics.add(new Topic(line));
        }
        return topics;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TopicReader)) return false;
        TopicReader that = (TopicReader) o;
        return Objects.equals(fileReader, that.fileReader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileReader);
    }
}
