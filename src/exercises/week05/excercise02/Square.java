package excercise02;

import excercise01.Shape;

public class Square implements Shape {
   // Create the Square class that implements the Shape interface.
    // Implement the getName method with the help of Intellij.
    // Return the word square in that method. Reuse the Shape interface from exercise 1.
    public String getName(){
        return "square";
    }

    @Override
    public String toString() {
        return "Square";
    }
}
