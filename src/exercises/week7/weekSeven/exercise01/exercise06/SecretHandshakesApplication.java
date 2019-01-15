package weekSeven.exercise01.exercise06;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SecretHandshakesApplication {


    public static void main(String[] args) {

        SecretHandshake secretHandshake = new SecretHandshake();

       List<Integer> numbers = secretHandshake.shake(295);
       System.out.println(numbers);



        Map<Integer, String> handShakeMap = secretHandshake.getHandShake();
       List<String> handSHakes = getHandeShake(numbers, handShakeMap);
        System.out.println(handSHakes);

    }


    public static List<String> getHandeShake(List<Integer> number, Map<Integer, String> map) {
        List<String> handSHake = new ArrayList<>();
        for (Integer integer : number) {
            if (map.containsKey(integer)) {
                handSHake.add(map.get(integer));
            }
        }


        return handSHake;
  }


}
