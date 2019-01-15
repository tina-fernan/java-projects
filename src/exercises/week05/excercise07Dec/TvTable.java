package excercise07Dec;

import excercise06.Furtniture;

import java.util.ArrayList;
import java.util.List;

public class TvTable implements Furtniture {

    public List<String>parts =new ArrayList<>();




    @Override
    public void add(String part) {
        parts.add(part);


    }

    @Override
    public String toString() {
        return "TvTable{" +
                "parts=" + parts +
                '}';
    }

    public List<String> getParts() {
        return parts;
    }
}








//Reuse the classes and interfaces from exercise 6 that you consider necessary.
//You need at least the following classes: TvTable, TvTableBuilder.
//The table needs the following parts to be finished: four legs, one shelf and one top.
//Create the TvTableBuilderTest that ensures that the tables are being built correctly