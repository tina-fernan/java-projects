package weekSix.exercise01;

public class HotAirBalloonApplication {

    public static void main(String[] args) {


        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        System.out.println("Small Balloon - -");
        smallBalloon.land();

        smallBalloon.liftUp();

        BigHotAirBalloon bigBallon= new BigHotAirBalloon();
        System.out.println("Big Baloon - -");
        bigBallon.land();
        bigBallon.liftUp();

        HotAirBalloon small = smallBalloon;
        System.out.println( "small ---");
        small.land();
        small.liftUp();

        HotAirBalloon big = bigBallon;
        System.out.println("big ---");
        big.liftUp();
        big.land();


    }

}
