package simpleExcerciseNov.excercise2Nov;

import simpleExcerciseNov.excercise2Nov.Door;
import simpleExcerciseNov.excercise2Nov.Key;

public class DoorApplication {

    public static void main(String[] args) {
        Door door = new Door(7 );
        Key key = new Key();
        key.open(door);
    }
}
