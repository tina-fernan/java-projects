package excercise26Nov.excercise01.excercise08;

import java.util.Optional;

public class AdvancedGiftApplication {

    public static void main(String[] args) {

        Optional<Box> giftbox = Optional.empty();
        System.out.println(giftbox);

        Box box = new Box("Robotoy");
        System.out.println(box.getContent());

       // Optional<Box> giftbox1 = Optional.of(box);
        //System.out.println(giftbox1);

        giftbox = Optional.of(box);
        System.out.println(giftbox.get());

        if(giftbox.isPresent()){
            System.out.println("there is a present in the gift box");
        }

        Box realGift = giftbox.get();
        System.out.println( "the gift is a " + realGift);

    }
}
