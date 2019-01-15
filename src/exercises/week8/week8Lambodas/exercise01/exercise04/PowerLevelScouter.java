package week8Lambodas.exercise01.exercise04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PowerLevelScouter {

public Integer scout(String name){
    return calculated(name, n -> ( int ) n.charAt (0));

}
    public Integer scoutEnhanced(String name){
        return calculated(name, n -> ( int ) n.toLowerCase ( ).charAt (0));
    }


    private Integer calculated(String name,Function<String,Integer>formul){
        Integer power= 0;
        String[] split = name .split("");
        List<String>letters= Arrays.asList(split);
        for (String letter : letters) {
            power += formul.apply(letter);


        }return power;
    }
}
