package excercise02;

import excercise01.Circle;
import excercise01.Shape;

import java.util.Arrays;
import java.util.List;

public class BasicShopApplication {

    public static void main(String[] args) {
       // Create a Circle as a Shape, name it circle and display its name.
        Circle circle = new Circle();
        System.out.println(  "Shape:" +circle.getName());
      //  Create a Square as a Shape, name it square and display its name.
        Square square = new Square();
        Shape shape = square;
        System.out.println( "Shape:" +square.getName());
       // Create a Triangle as a Shape, name it triangle and display its name. n
        Triangle triangle = new Triangle();
        Shape shape1= triangle;
        System.out.println( "Shape:" +triangle.getName());
      //  Create a list of Circle named circles and try to add circle, square and triangle to it.
        List<Shape> shapes = Arrays.asList(circle,square,triangle);
        System.out.println( "Shapes" +shapes);

        //  It doesn’t work because circle is not a Circle now, it is a Shape, and it’s not the same.
        //  Also, square and triangle don’t work either because they are not Circles.
       // Create a list of Shape named shapes and add circle to it. Try to add square and triangle as well. It works because the three of them are shapes.
      //Display the list. It shows memory addresses.
        // Implement the toString methods in each one of the three Shapes returning the name of the shape itself by reusing the interface method.
        // Display it now.
        for(Shape shape2 : shapes){
            System.out.println("Shape name" + shape2. getName());
        }
        //Use a foreach loop to go through all the shapes and one by one display its names.

    }
}
