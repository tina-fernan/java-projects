package exercises.week04.excercise08;

public class Box {

    String content;

    public Box(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }


    @Override
    public String toString() {
        return "Box{" +
                "content='" + content + '\'' +
                '}';
    }
}
