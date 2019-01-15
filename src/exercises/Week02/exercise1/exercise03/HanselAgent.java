package Week02.exercise1.exercise03;

import java.util.List;

public class HanselAgent {

    private Integer footSize = 41;



    private boolean isTheRightSize(HikingBoots boot){
        return footSize.equals(boot.getSize());

    }public void tryHikingBoots(List<HikingBoots>boots){
        for (HikingBoots boot : boots){
            if (isTheRightSize(boot)){

                System.out.println("I'm buying this one.thanks");

                return;
            }
        }System.out.println("This one does not fit , sorry");
    }

}


