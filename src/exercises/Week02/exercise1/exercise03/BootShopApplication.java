package Week02.exercise1.exercise03;

import java.util.List;

public class BootShopApplication {

    public static void main(String[] args) {
        BootShopAssistant assistant=new BootShopAssistant();
        HanselAgent hansel1 = new HanselAgent();
        List<HikingBoots> recommendations = assistant.getHikingBoots();



        hansel1.tryHikingBoots(recommendations);

    }
}
