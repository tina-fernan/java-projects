package excercise26Nov.excercise01.excercise10;

import excercise26Nov.excercise01.Topic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TopicReaderAplication {

    public static void main(String[] args) {

        TopicReader topicReader = new TopicReader();


        List<Topic>topicList= topicReader.getTopics();


        System.out.println(topicList);

        Set<Topic>topicSet = new HashSet<>(topicList);

        for(Topic topic : topicSet){
            System.out.println("topic set" + topic);
        }



    }


}
