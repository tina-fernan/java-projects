package exercises.week7.weekSeven.exercise01.exercise07;

public  abstract class Vihcle {
//    The company has only two kind of vehicles.
//    The type 1 of vehicle can transport only one person.
//    The type 2 of vehicle can transport only five people.
//    The number of celebrities showing up for the event could change at any time.
//    Matilda needs to be able to know if they have enough vehicles of both kinds to transport all celebrities.
private Integer numbersOfSeats;


    public Vihcle(Integer numbersOfSeats) {
        this.numbersOfSeats = numbersOfSeats;
    }


    public Boolean abletopick(Integer numbersOfCelebrities){
        return numbersOfSeats<= numbersOfCelebrities;
    }


    public Integer remainedCelebrities(Integer numbersOfCelebrities){
        return numbersOfCelebrities -= numbersOfSeats;
    }
}
