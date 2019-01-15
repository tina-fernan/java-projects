package excercise26Nov.excercise01.excercise11;

public class HappinesRecord {

    private String country;
    private Integer rank;
    private Double score;

    public HappinesRecord(String country, Integer rank, Double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;
    }


    public Integer getRank() {
        return rank;
    }

    public Double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "HappinesRecord{" +
                "country='" + country + '\'' +
                ", rank=" + rank +
                ", score=" + score +
                '}';
    }

    public String getCountry() {
        return country;
    }
}



