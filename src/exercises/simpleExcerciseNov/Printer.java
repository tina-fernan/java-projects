package simpleExcerciseNov;

import simpleExcerciseNov.excercise5Nov.Magazine;

import java.util.List;

public class Printer {

public Printer(){


    }


 public void print(Article article){

    System.out.println("printing"+article.getTitel());
    System.out.println("printing"+article.getText());

    }
    public void printMagazine(Magazine magazine) {

        List<Article> articles = magazine.getArticles();

        for (Article article : articles) {
            System.out.println(article.getTitel());
            System.out.println(article.getText());

        }
    }
}