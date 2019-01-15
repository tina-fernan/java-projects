package simpleExcerciseNov;

import javax.xml.soap.Text;

public class Article {

    private String titel;
    private String  text;

    public Article(String title, String text){
        this.titel = title;
        this.text = text;
    }
    public String getTitel(){

        return titel;
    }
    public String getText() {

        return text;
    }
}
