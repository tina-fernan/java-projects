package simpleExcerciseNov.excercise5Nov.excercise6Nov;

import simpleExcerciseNov.Article;
import simpleExcerciseNov.Excercise3Nov.Tool;

import java.util.ArrayList;
import java.util.List;

public class ToolBox {

    public String color;

    public List<Tool>tools = new ArrayList<>();


    public ToolBox(String color) {
        this.color = color;
    }
    public void add(Tool tool){


        tools.add(new Tool("drill"));


    }

    public List<Tool> getTools() {
        return tools;
    }
}





