package excrcise03;

import excercise01.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaisicColorApplication {
    //Create a Rectangle as a normal Rectangle, name it rectangle and display its color.
    public static void main(String[] args) {
//In a new line, write the following:  Shape shape = (Shape) rectangle; This is called casting.
// Now the rectangle is no longer a Rectangle,
// but it is a Shape object. Display its name.
// Note that you cannot see any more the getColor method because the Shape interface does not have it.
//Create a list of Rectangle called rectangles and add the rectangle.
// Note that you cannot add either colored or shape because they are not Rectangles.
//Create a list of Colored called coloreds and add rectangle and colored to it.
// Note that you cannot add shape because it’s not a Colored object.
//Create a list of Shape called shapes and add rectangle and shape to it.
// Note that you cannot add colored because it’s not a Shape object.

        Rectangle rectangle = new Rectangle();
        System.out.println("Color : " + rectangle.getColor());
        System.out.println("Name :" + rectangle.getName());
        Colored colored = (Colored) rectangle;
        // Colored colored = rectangle;
        System.out.println("Colored :" + colored.getColor());

        Shape shape = (Shape) rectangle;
        System.out.println( "Shape :" +rectangle.getName());

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rectangle);
        System.out.println(rectangles);

        List<Colored>coloreds = Arrays.asList(rectangle,colored);
        System.out.println(coloreds);
        //Add the toString method to the Rectangle.
        // Make sure you use its interface methods to return its color and name as a String.
        // Display the three lists
        //Create the RectangleTest class that tests that the Rectangle is working correctly as Rectangle,
        // Colored and Shape.

        List<Shape>shapes=new ArrayList<>();
        shapes.add(shape);
        shapes.add(rectangle);
        System.out.println(shapes);





    }

}
