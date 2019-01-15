package excercise26Nov.excercise01.excercise09;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void getLines() {

        FileReader fileReader=new FileReader();
        List<String> lines = fileReader.getLines("excercise26Nov/excercise01/excercise09/loremipsum.txt ");

    }



}