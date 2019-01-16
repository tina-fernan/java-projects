package exercises.week09.exercise05;

public class Film {

    private String title;
    private Double score;
    private Long voteCount;
    private  Integer runTime;
    private Integer revenue;
    private  Long budget;

    public Film(String title, Double score, Long voteCount, Integer runTime, Integer revenue, Long budget) {
        this.title = title;
        this.score = score;
        this.voteCount = voteCount;
        this.runTime = runTime;
        this.revenue = revenue;
        this.budget = budget;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public Long getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", score=" + score +
                ", voteCount=" + voteCount +
                ", runTime=" + runTime +
                ", revenue=" + revenue +
                ", budget=" + budget +
                '}';
    }
}
