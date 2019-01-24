package exercises.week10.exercise01;

public class PokeMon {

    private Integer number;
    private String name;
    private String typeOne;
    private String typeTwo;
    private Integer total;
    private Integer hP;
    private Integer attack;
    private Integer defence;
    private Integer spAtk;
    private Integer spDef;
    private Integer speed;
    private Integer generation;
    private Boolean legendary;

    public PokeMon(Integer number, String name, String typeOne, String typeTwo, Integer total, Integer hP, Integer attack,
                   Integer defence, Integer spAtk, Integer spDef, Integer speed, Integer generation, Boolean legendary) {
        this.number = number;
        this.name = name;
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
        this.total = total;
        this.hP = hP;
        this.attack = attack;
        this.defence = defence;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getTypeOne() {
        return typeOne;
    }

    public String getTypeTwo() {
        return typeTwo;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getHp() {
        return hP;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public Integer getSpAtk() {
        return spAtk;
    }

    public Integer getSpDef() {
        return spDef;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    public Boolean getLegendary() {
        return legendary;
    }

    @Override
    public String toString() {
        return  name;
    }
}
