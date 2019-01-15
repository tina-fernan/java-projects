package simpleExcerciseNov.excercise5Nov.excercise6Nov;

import java.util.Arrays;
import java.util.List;

public class ToolShopApplication {

    public static void main(String[] args) {

    List<String> toolNames = Arrays.asList("Hammer", "Drill", "Nails");

    ShopAssistant shopAssistant = new ShopAssistant();
    shopAssistant.findToolBox(toolNames, "Blue");

}





}
