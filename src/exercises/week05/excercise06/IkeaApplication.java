package excercise06;

public class IkeaApplication {
   // Create a WardrobeBuilder and build one Wardrobe.
    //Display the wardrobe. It should have all the right parts.
    //Create the WardrobeBuilderTest class to make sure the build method returns a proper wardrobe. For this you will need the getParts method in the Wardrobe class.


    public static void main(String[] args) {
        WaredDrobeBuilder waredDrobeBuilder= new WaredDrobeBuilder();
        WaredDrobe waredDrobe = new WaredDrobe();
        System.out.println(waredDrobeBuilder.build());

    }
}
