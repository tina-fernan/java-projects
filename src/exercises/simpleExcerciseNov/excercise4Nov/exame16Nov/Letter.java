package simpleExcerciseNov.excercise4Nov.exame16Nov;

public class Letter {

    private String address;
    private Boolean stamped=false;

    public Letter(String address) {
        this.address = address;
    }

    public String getAddress() {

        return address;
    }
    public Boolean isStamped(){
        return stamped;
    }

    public void stamp(){
        stamped=true;
    }
}
