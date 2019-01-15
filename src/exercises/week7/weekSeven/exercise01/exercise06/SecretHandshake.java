package weekSeven.exercise01.exercise06;


import java.util.*;

public  class SecretHandshake {


    public List<Integer> shake(Integer priceNumber){
        String number = priceNumber.toString();
        List<String>numbers= Arrays.asList(number.split(""));
        List<Integer> shakesNumber=new ArrayList<>();

        for (String string : numbers){
            Integer newNumber = Integer.valueOf(string);
            shakesNumber.add(newNumber);



        }
        return shakesNumber;
    }




    Map<Integer,String>handShake=new HashMap<>();
    Integer number1=2;
    Integer number2=5;
    Integer number3=6;

    Integer number4=9;
    String move1="The thumb touches back";
    String move2="The tickles over palm ";
    String move3="The bro knock";

    String move4="The thousand knuckles";

    public Map<Integer, String> getHandShake() {
        handShake.put(number1,move1);
        handShake.put(number2,move2);
        handShake.put(number3,move3);
        handShake.put(number4,move4);
        return handShake;
    }
}