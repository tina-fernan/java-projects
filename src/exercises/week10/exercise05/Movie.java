package exercises.week10.exercise05;

import java.util.List;

public class Movie {

    private String titel;
    private List<String>genres;
    private Long revenue;
    private Integer runtime;

    public Movie(String titel, List<String> genres, Long revenue, Integer runtime) {
        this.titel = titel;
        this.genres = genres;
        this.revenue = revenue;
        this.runtime = runtime;
    }


    public List<String> getGenres() {
        return genres;
    }



    public Long getRevenue() {
        return revenue;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public String getTitel() {
        return titel;
    }
    }
