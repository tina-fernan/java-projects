package example.Clothes;

public class WardrobApplication {

    public static void main(String[] args) {
        Person mahtab = new Person("Mahtab");
        Cloth dress = new Cloth("Dress");

        mahtab.wear(dress);
        mahtab.sayWhatIWear();

        Person ashkan = new Person("Ashkan");
        ashkan.wear(dress);
        ashkan.sayWhatIWear();

        Cloth poloShirt = new Cloth("Polo shirt");
        ashkan.wear(poloShirt);
        ashkan.sayWhatIWear();

        ashkan = new Person("Aizhana");
//        Cloth pijama = new Cloth("Pijama");
        ashkan.wear(dress);
        ashkan.sayWhatIWear();
    }


}
