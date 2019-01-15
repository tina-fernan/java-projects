package simpleExcerciseNov.excercise5Nov;

import simpleExcerciseNov.Article;

import java.util.List;

public class Editor {

    public  Magazine writeMagazine(){

        Magazine magazine= new Magazine("news");

       Article article1= new Article("tea","tea is a drink");
       Article article2 =new Article("Porto","Porto is a city");
       Article article3 = new Article("Mars","Mars is a planet");

       magazine.add(article1);
       magazine.add(article2);
       magazine.add(article3);

       return magazine;

    }
}
