package excercise01.examWeekSix14Dec;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cars {

        private static Random random = new Random();

        public static Car getNextCar(String brand) {
            boolean automatic = random.nextBoolean();
            if (automatic) {
                return new AutomaticCar(brand);
            }
            return new ManualCar(brand);
        }
    }


