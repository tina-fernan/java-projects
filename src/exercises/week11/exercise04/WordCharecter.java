package exercises.week11.exercise04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordCharecter {

//    private String orginalWorld;
//    private String word;
//
//    public WordCharecter(String orginalWorld, String word) {
//        this.orginalWorld = orginalWorld;
//        this.word = word;
//    }

    public boolean isValid(String word,String orginalWorld) {
        if (!isLengthRangeValid(word, orginalWorld)) {
            return false;
        }

        if (word.equals(orginalWorld)) {
            return true;
        }

        Queue<String> wordQueue = toQueue(word);
        Queue<String> orginalWorldQueue = toQueue(orginalWorld);


        if (wordQueue.size() == orginalWorldQueue.size()) {
            return isReplaced(wordQueue, orginalWorldQueue);
        }


        return isInsertedOrRemoved(wordQueue, orginalWorldQueue);

//       if (isInsertedOrRemoved()){
//           return true;
//       }
//        return false;
    }

    private boolean isInsertedOrRemoved(Queue<String> wordQueue, Queue<String> orginalWorldQueue) {
        if (wordQueue.size()<orginalWorldQueue.size()){
            return check(wordQueue,orginalWorldQueue);
        }
        return check(orginalWorldQueue,wordQueue);
    }

    private boolean check(Queue<String> small, Queue<String> big) {
        int difference = 2;

        while (!small.isEmpty()&&!big.isEmpty()){
            if (!small.peek().equals(big.peek())) {
                difference--;
                big.poll();
            }else {
                small.poll();
                big.poll();
            }
        }
//
//
//        for (String letter : small) {
//            if (!letter.equals(big.peek())) {
//                difference--;
//                big.poll();
//            }else {
//                small.poll();
//                big.poll();
//            }
//        }
        return calculateDiffrence(difference);
    }

    private boolean isReplaced(Queue<String> first, Queue<String> second) {

        int difference = 2;

        while (!first.isEmpty()&&!second.isEmpty()){
            if (!first.peek().equals(second.peek())) {
                difference--;
            }
            first.poll();
            second.poll();
        }

        return calculateDiffrence(difference);
    }

    private boolean calculateDiffrence(int diffrence) {
        return diffrence > 0;
    }

    private Queue<String> toQueue(String word) {
        List<String> letters = Arrays.asList(word.split(""));

        return new LinkedList<>(letters);
    }

    private boolean isLengthRangeValid(String orginalWord, String word) {
        return orginalWord.length() == word.length()
                || orginalWord.length() - word.length() == 1
                || word.length() - orginalWord.length() == 1;
    }


}
