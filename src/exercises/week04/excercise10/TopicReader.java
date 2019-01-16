package excercise26Nov.excercise01.excercise10;

import excercise26Nov.excercise01.Topic;
import excercise26Nov.excercise01.excercise09.FileReader;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
