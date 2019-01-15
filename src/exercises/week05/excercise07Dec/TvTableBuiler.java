package excercise07Dec;

import excercise06.AddShelf;
import excercise06.AddTop;
import excercise06.Step;

import java.util.Arrays;
import java.util.List;

public class TvTableBuiler {

    public List<Step>steps = Arrays.asList(new AddLeg(),new AddLeg(),new AddLeg(),new AddLeg(),new AddShelf(),new AddTop());

    public TvTable build() {
        TvTable tvTable = new TvTable();
        for (Step step : steps) {
            step.perform(tvTable);


        }

        return tvTable;


    }

    }
