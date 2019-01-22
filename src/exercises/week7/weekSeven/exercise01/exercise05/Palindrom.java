package exercises.week7.weekSeven.exercise01.exercise05;

public class Palindrom {

    public boolean palindrom(String word) {


        word.replace("", " ");
        String originalWord = word;

        String[] newWord = word.split("");
        String reversedWored = "";
        Integer lastPosition = newWord.length - 1;

        for (int position = lastPosition; position >= 0; position--) {

            reversedWored += newWord[position];

        }

        boolean answer = reversedWored.equals(originalWord);
        return answer;
    }
}
