package excercise07Dec;

public class TvTableBuilderApplication {

    public static void main(String[] args) {
        TvTableBuiler tvTableBuiler = new TvTableBuiler();
        TvTable tvTable = new TvTable();

        System.out.println(tvTableBuiler.build());

    }

}
