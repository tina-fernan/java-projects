package exercises.week10.exercise03;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


import java.util.stream.Collectors;

public class MessageReader {

    private FileReader reader = new FileReader();

    public List<Message> getMessage() {
        return reader.asStream("exercises/week10/exercise03/sms.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Message(e[0], e[1]))
                .collect(Collectors.toList());
    }
}
