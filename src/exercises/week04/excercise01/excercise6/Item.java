package excercise26Nov.excercise01.excercise6;

import java.util.Objects;

public class Item {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }

    public boolean equals(Item item) {

        return this.name.equals(item.getName());
    }
}
