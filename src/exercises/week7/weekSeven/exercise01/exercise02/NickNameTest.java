package weekSeven.exercise01.exercise02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NickNameTest {

    @Test
    void tesBuildNickName() {

        NickName nickName = new NickName();

        List<String>names= Arrays.asList("moon","bird","forest","house");

        List<Optional<String>> optionals = nickName.buildNickName(names);

        List<Optional<String>>newName = Arrays.asList(Optional.empty(),Optional.empty(),Optional.of("for"),Optional.empty());

        Assertions.assertEquals(newName,optionals);




    }
}