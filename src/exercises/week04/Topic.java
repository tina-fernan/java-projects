package exercises.week04;

public class Topic {
    String name;

    public Topic(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
