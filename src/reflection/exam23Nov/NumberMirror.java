package exam23Nov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberMirror {


    public Integer mirror(Integer number){
        List<String> numbers = separate(number);
        Collections.reverse(numbers);
        String reversed = String.join("", numbers);
        return Integer.valueOf(reversed);
    }

    private List<String> separate(Integer number){
        String string = number.toString();
        String[] spilt = string.split( "");
        List<String> immutableNumbers = Arrays.asList(spilt);
        List<String> mutableNumbers = new ArrayList<>(immutableNumbers);
        return mutableNumbers;


    }
    public Integer specialMirror(Integer number){
        List<String> numbers = separate(number);
        numbers = addPlusOneToAll(numbers);
        Collections.reverse(numbers);
        String reversed = String.join("",numbers);
        return Integer.valueOf(reversed);

    }

    private List<String> addPlusOneToAll(List<String> numbers){
        List<String>modified = new ArrayList<>();
        for (String number : numbers){
            addPlusOne(number, modified);
        }
        return modified;
    }
    private void addPlusOne(String number,List<String>modified) {
        Integer digit = Integer.valueOf(number);
        Integer result = (digit + 1) % 10;
        modified.add(result.toString());
    }
}

