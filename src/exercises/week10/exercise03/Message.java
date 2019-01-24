package exercises.week10.exercise03;

public class Message {
    //Which is the ratio between ham and spam sorted by highest first?
    //Which one is the most used word in ham?
    //Which one is the most used letter in ham?
    //How long is the longest spam message?
    //Ask two additional questions yourself and test the answers.
    //Reminder:
    private String versionOne;
    private String versionTwo;

    public Message(String versionOne, String versionTwo) {
        this.versionOne = versionOne;
        this.versionTwo = versionTwo;
    }

    public String getVersionOne() {
        return versionOne;
    }

    public String getVersionTwo() {
        return versionTwo;
    }

    @Override
    public String toString() {
        return "Ham{" +
                "vOne='" + versionOne + '\'' +
                ", vTwo='" + versionTwo + '\'' +
                '}';
    }
}
