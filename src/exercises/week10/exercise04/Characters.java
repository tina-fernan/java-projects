package exercises.week10.exercise04;

public class Characters {

    private String name;
    private String allegiances;
    private String deathYear;
    private String bookDeath;
    private String deathChapter;
    private String bookIntroChapter;
    private String gender;
    private String nobility;

    public Characters(String name, String allegiances, String deathYear, String bookDeath, String deathChapter,
                      String bookIntroChapter, String gender, String nobility) {
        this.name = name;
        this.allegiances = allegiances;
        this.deathYear = deathYear;
        this.bookDeath = bookDeath;
        this.deathChapter = deathChapter;
        this.bookIntroChapter = bookIntroChapter;
        this.gender = gender;
        this.nobility = nobility;
    }

    public String getName() {
        return name;
    }

    public String getAllegiances() {
        return allegiances;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public String getBookDeath() {
        return bookDeath;
    }

    public String getDeathChapter() {
        return deathChapter;
    }

    public String getBookIntroChapter() {
        return bookIntroChapter;
    }

    public String getGender() {
        return gender;
    }

    public String getNobility() {
        return nobility;
    }
}
