package week8Lambodas.exercise01.exercise03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeyWordFinder {

    private List<String>words=new ArrayList<>();


        public List<String> findElegant(String sentence){
            List<String> words = splitedWords(sentence);
            return finder(words , word -> word.startsWith("ele"));


        }
        public List<String> findPlayful(String sentence){
            List<String> words = splitedWords(sentence);

            return finder(words , word -> word.endsWith("ful"));
        }


    private List<String> splitedWords(String sentence) {

        String[] split = sentence.split (" ");
        List<String> words = Arrays.asList(split);
        return words;
    }

        private List<String> finder(List<String>words, Predicate<String>condition){
            List<String> result = new ArrayList<>();
            for (String word : words) {
                if (condition.test(word)){
                    result.add(word);
                }

            }
            return result;
        }




//An elegant word is a word that starts with ele
// A playful word is a word that ends with ful.
// You’re not allowed to duplicate code.
// Use a Predicate<String> to avoid code duplication.



}
