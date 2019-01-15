package simpleExcerciseNov.excercise5Nov.excercise6Nov;

import simpleExcerciseNov.Article;
import simpleExcerciseNov.Excercise3Nov.Tool;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {


    public void findToolBox(List<String> toolNames, String color) {

        System.out.println("here is your " + color + " toolbox :");
        List<String> finalList = new ArrayList<>();
        ToolBox toolBox = new ToolBox(color);

        for (String toolName : toolNames) {
            Tool tool = new Tool(toolName);
            toolBox.add(tool);
            finalList.add(tool.getName());
        }
        System.out.println(finalList);
    }
}