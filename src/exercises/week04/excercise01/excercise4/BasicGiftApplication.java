package excercise26Nov.excercise01.excercise4;

import java.util.Optional;

import static java.util.Optional.empty;

public class BasicGiftApplication {

    public static void main(String[] args) {

        Optional<String> giftBox = Optional.empty();
        System.out.println(giftBox);


        giftBox = Optional.of("Robotoy");
        System.out.println(giftBox);

        if(giftBox.isPresent()){

            System.out.println("the gift is a Robotoy");

        }



    }

    }