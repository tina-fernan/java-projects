package excrcise03;

import excercise01.Shape;

public class Rectangle implements Colored , Shape{

   @Override
   public String toString() {
        return getColor()+ getName();
    }

    //Create the Rectangle class that implements the Colored interface.
    // Implement the getColor method with the help of Intellij. Return the color of your choice in that method.
    public String getColor(){

        return "Pink ";
    }

    @Override
    public String getName() {
        return "rectangle";

    }

}
