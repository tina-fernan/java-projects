package weekSeven.exercise01.exercise02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NickName {
    //Derek, Matilda and Hansel have started using nicknames for everything they encounter.
    // They started playing around by just saying the first half of any word.
    //Develop the code that they use in order to create nicknames out of those words.
    //Test your code to make sure the nickname logic works, even if the provided name is empty.
    public List<Optional<String>> buildNickName(List<String> names) {
        List<Optional<String>>nickNames =new ArrayList<>();

        for (String name: names){

            Optional<String> nickName = creatNickName(name);

            nickNames.add(nickName);


        }


        return nickNames;


    }
        public Optional creatNickName (String name){


            Integer position = name.length() / 2;

            String newName =name.substring(0,position);

            if (newName.length() > 2) {

                return Optional.of(newName);
            }

           return Optional.empty();
        }


}




