package simpleExcerciseNov;

public class PrintApplication {

    public static void main(String[] args) {
        Article article = new Article("Tina is the best", "life is beautful");
        Printer printer = new Printer();
        printer.print(article);

    }
}
