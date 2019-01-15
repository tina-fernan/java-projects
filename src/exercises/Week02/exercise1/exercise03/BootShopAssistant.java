package Week02.exercise1.exercise03;

import java.util.*;

public class BootShopAssistant {



    public List<HikingBoots> getHikingBoots() {
        List<HikingBoots>boots = new ArrayList<>();
        boots.add(new HikingBoots(40));
        boots.add(new HikingBoots(41));
        boots.add(new HikingBoots(42));
        Collections.shuffle(boots);

        return boots;




    }
}

