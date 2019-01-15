package weekSix.exercise01.exercise04;


public abstract class Money {

  //Create the Money abstract class that will represent one single cent coin.
    // Design this class with the help of attributes, methods or abstract methods,
    // so that at least it can tell its amount as Integer and whether it is applicable for an Integer amount.
    private Integer amount;


    public Money(Integer amount) {
        this.amount = amount;
    }

    public boolean isApplicable(Integer money){
        return money>=amount;

    }

    public Integer getAmount() {

        return amount;
    }
}
