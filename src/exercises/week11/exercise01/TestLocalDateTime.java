package exercises.week11.exercise01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

class TestLocalDateTime {

    @Test
    void testDateTimes() {

        //He wakes up and stops his alarm. What time is it displayed in the format Hours:Minutes? What day of the week is this?
        LocalDate someTimeDayYear = LocalDate.of(2003, 3, 13);
        LocalTime someTime = LocalTime.parse("10:00:00");
        System.out.println("Minutes: " + someTime.getMinute());
        System.out.println("Seconds: " + someTime.getSecond());
        System.out.println("Day: " + someTimeDayYear.getDayOfWeek());

        Assertions.assertEquals(0, someTime.getMinute());
        Assertions.assertEquals(0, someTime.getSecond());

        LocalDateTime now = LocalDateTime.of(2003,3,13, 10,0,0);
        LocalDateTime thirtySevenMinutes=now.plusMinutes(37).plusSeconds(21);

        LocalDateTime minutes=LocalDateTime.of(2003,3,13,10,37,21);

        Assertions.assertEquals(minutes,thirtySevenMinutes);


        //The limousine arrives at the airport one and a half hours later because of traffic jam.
        // At what time do they arrive at the airport?
        LocalDateTime oneHrLater=LocalDateTime.of(2003,3,13,10,37,21);
        LocalDateTime arriveAirport=oneHrLater.plusHours(1).plusMinutes(30);
        System.out.println(arriveAirport);
        LocalDateTime expected=LocalDateTime.of(2003,3,13,12,7,21);
        Assertions.assertEquals(expected,arriveAirport);


        //Mugatu checks the departure time of his flight and it says 11:04 am. Is this time before the current one?
        // Did he miss his flight?
        boolean later = arriveAirport.isAfter(oneHrLater);
        System.out.println(later);
        Assertions.assertTrue(later);
        //He asks at the info desk when the next flight is. The next flight will be at 18:45.
        // How many hours and minutes does he have to wait?

        LocalDateTime nextFlight=LocalDateTime.of(2003,3,13,18,45);

        Duration nextFlightWait=Duration.between(arriveAirport,nextFlight);
        long nextFlightWaitToHours=nextFlightWait.toMinutes()/60;
        long nextFlightwaitToMinutes=nextFlightWait.toMinutes()%60;


        System.out.println("he should wait " +nextFlightWaitToHours +" hours" +nextFlightwaitToMinutes+ " Minutes");




        LocalDateTime londonFlight = nextFlight.plusHours(11).plusMinutes(50);
        System.out.println("\nTime in London: " + londonFlight);

        ZoneId zoneLondon = ZoneId.of("Europe/London");
        ZonedDateTime arrivalLondonTime = londonFlight.atZone(zoneLondon);
        System.out.println("\nArrival in London time: " + arrivalLondonTime);

        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime arrivalTokyoTime = arrivalLondonTime.withZoneSameInstant(zoneTokyo);
        System.out.println("\nArrival in Tokyo time: " + arrivalTokyoTime);



        LocalDateTime wakeUpHotel=arrivalTokyoTime.toLocalDateTime().plusHours(2).plusHours(9);
        System.out.println(   "His manager wake him up at " + wakeUpHotel);

        //They tell him that the advertisement shooting starts in 47 minutes. When is that exactly?

        LocalDateTime advertisementShooting=wakeUpHotel.plusMinutes(47);
        System.out.println(  "The advertisement shooting starts at :  " +advertisementShooting.format(DateTimeFormatter.ofPattern("HH:mm")));
        //They throw him with his clothes and make up set into the limousine and
        // rush towards the studio arriving just in time. However, Mugatu received a private phone call from his assistant Katinka
        // that lasted 546 seconds. How much time in minutes and seconds did Mugatu have to get prepared in the limousine?


        LocalDateTime talkingOnPhone = wakeUpHotel.plusSeconds(546);

        Duration preparationPeriod = Duration.between(talkingOnPhone, advertisementShooting);
        System.out.println("the preparation period is : "
                +preparationPeriod.toMinutes()+":"+
                preparationPeriod.minusMinutes(preparationPeriod.toMinutes()).getSeconds());

        //After 7 hours the shooting is over. Lunch time is round 13:00 and dinner time is around 20:00. Should Mugatu have lunch or dinner?
        LocalDateTime shootingOver=advertisementShooting.plusHours(7);
        LocalTime beforeLunchTime = advertisementShooting.plusHours(7).toLocalTime();
        boolean isBefore= beforeLunchTime.isBefore(LocalTime.of(13,30));
        System.out.println(beforeLunchTime.toString());
        if (isBefore){
            System.out.println("it is Lunch time");
        }else {

            System.out.println("it is Dinner time.");
        }


        LocalDateTime backLondon=shootingOver.plusDays(3).plusHours(12).plusHours(11).
                        plusMinutes(50);
        //System.out.println(backLondon);


        ZonedDateTime timeTokyo = backLondon.atZone(zoneTokyo);
        System.out.println("Time in Tokyo is: " +timeTokyo);



        ZonedDateTime landLondonTime=timeTokyo.withZoneSameInstant(zoneLondon);
        LocalDateTime londonLocalDateTime = landLondonTime.toLocalDateTime();
        System.out.println("\nArrival in London time: " + londonLocalDateTime);

        Duration dispatchingFans = Duration.ofSeconds(173 * 12);
        System.out.println(dispatchingFans);

        LocalDateTime fansTime = londonLocalDateTime.plusSeconds(dispatchingFans.getSeconds());
        System.out.println(fansTime);
//Mugatu arrives at his hotel one hour later and decides to go to the sauna.
        LocalDateTime arriveHotel=fansTime.plusHours(1);

        System.out.println("He is arrive at Hotel" +arriveHotel);
        LocalDateTime saunaEnd = arriveHotel.plusMinutes(30);

// This one is only open from 9:00 to 14:00 and from 16:00 to 20:00. Can he at least manage to stay in the sauna for half an hour?

        LocalDateTime openHrSaunaMorning = LocalDateTime.of(arriveHotel.toLocalDate(), LocalTime.of(9, 0));
        LocalDateTime closeHrSaunaMorning = LocalDateTime.of(arriveHotel.toLocalDate(), LocalTime.of(14, 0));

        LocalDateTime  openHrSaunaAfternoon = LocalDateTime.of(arriveHotel.toLocalDate(), LocalTime.of(16, 0));
        LocalDateTime closeHrSaunaAfternoon = LocalDateTime.of(arriveHotel.toLocalDate(), LocalTime.of(20, 0));

        boolean canGoToSauna;


            canGoToSauna=arriveHotel.isAfter(openHrSaunaMorning)&&saunaEnd.isBefore(closeHrSaunaMorning);

            if (!canGoToSauna) {
                canGoToSauna = arriveHotel.isAfter(openHrSaunaAfternoon) && saunaEnd.isBefore(closeHrSaunaAfternoon);
            }

        System.out.println("can go to sauna: "+ canGoToSauna);

//The special one-hour massage offered by the hotel is on Thursdays and Sundays, and if it is a leap year,
// also on Saturdays. Can Mugatu be lucky enough to get one of those?


        DayOfWeek dayOfWeek = arriveHotel.getDayOfWeek();
        System.out.println(dayOfWeek);

        List<String> massageOfferedDays = Arrays.asList("thursday", "sunday");
        if (arriveHotel.toLocalDate().isLeapYear()){
            massageOfferedDays.add("saturday");
        }

        boolean contains = massageOfferedDays.contains(dayOfWeek.toString().toLowerCase());

        System.out.println(contains);


//One week later, the advertisement is broadcasted at 18:30 in Tokyo’s time.
// When does Mugatu have to turn on the TV in London to be able to see it?
//The advertisement lasts 29 seconds. Fifteen seconds afterwards his manager calls him on the phone to congratulate him for his popularity increase.
// At what time exactly does this happen? What day of the week is this?


    }


}
