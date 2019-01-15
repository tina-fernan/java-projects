package simpleExcerciseNov.excercise5Nov;

import simpleExcerciseNov.Article;

import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.List;

public class Magazine {

    String Titel;
    List<Article>articles = new ArrayList<>();


    public Magazine(String titel) {
        Titel = titel;
    }

    public void add(Article article){
        articles.add(new Article("love","life programing"));



    }

    public List<Article> getArticles() {
        return articles;
    }
}
