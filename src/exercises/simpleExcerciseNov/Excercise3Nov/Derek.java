package simpleExcerciseNov.Excercise3Nov;

import java.util.Scanner;

public class Derek {

    private Tool tool;


    public void setTool(Tool tool) {
        this.tool = tool;
    }

    private boolean canHangPainting() {
        return  tool!=null && tool.getName()=="hammer";
    }

    void hangPaiting() {
        if (canHangPainting()) {
            System.out.println("he hang the painting");

        } else {


            System.out.println("he is missing Hammer");
        }



        }
    }
