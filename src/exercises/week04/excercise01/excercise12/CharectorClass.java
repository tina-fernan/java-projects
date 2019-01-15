package excercise26Nov.excercise01.excercise12;

public class CharectorClass {

    public String getGender() {
        return gender;
    }

    public CharectorClass(String name, String bookOfDeath, String gender) {
        this.name = name;
        this.bookOfDeath = bookOfDeath;
        this.gender = gender;
    }

    // Use the file got-characters.csv in the GitHub repository.
  //  Reuse the FileReader class from exercise 9. Don’t copy it, just reuse it by importing it.
  //  Create the Character class that has a String name, a String bookOfDeath and a String gender.
   // Create the CharacterReader class that has the getCharacters method that receives a filePath, uses a FileReader to read its lines, transforms them into Characters and returns them.
   // Create the GotApplication class that has a main method that uses the CharacterReader to read the got-characters.csv and performs the code that answers the previously given questions.
private  String name;

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    private String bookOfDeath;
private String gender;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CharectorClass{" +
                "name='" + name + '\'' +
                ", bookOfDeath='" + bookOfDeath + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

