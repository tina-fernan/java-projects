package simpleExcerciseNov.excercise5Nov;

import simpleExcerciseNov.Printer;
import java.util.List;

public class MagazineApplication {

    public static void main(String[] args) {

        Editor editor = new Editor();
        Magazine magazine =editor.writeMagazine();


        Printer printer = new Printer();
        printer.printMagazine(magazine);


    }
}
