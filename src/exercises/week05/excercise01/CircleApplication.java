package excercise01;

public class CircleApplication {

    public static void main(String[] args) {
        Circle circle = new Circle();

        Shape shape = circle;
        System.out.println( "Class :" + shape.getName());

        Circle anotherCircle = new Circle();
        System.out.println( "Shape:" + anotherCircle.getName());

        Shape anotherShape = anotherCircle;
        System.out.println( "another shape :" + anotherShape.getName());


    }
}
