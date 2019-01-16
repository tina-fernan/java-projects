package exercises.week09.exercise04;

public class HappinessRecord {

    private Integer rank;

    private String country;

    private Double score;

    public HappinessRecord(Integer rank, String country, Double score) {
        this.rank = rank;
        this.country = country;
        this.score = score;
    }

    public Integer getRank() {
        return rank;
    }

    public String getCountry() {
        return country;
    }

    public Double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Rank: " + rank +
                "\t| Country: " + country + '\'' +
                "\t| Score: " + score ;
    }
}
