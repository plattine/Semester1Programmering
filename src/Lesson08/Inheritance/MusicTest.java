package Lesson08.Inheritance;


// Main klasse
public class MusicTest {
    public static void main(String[] args) {

        test();
    }

    public static void test()
    {
        Instrument guitar = new Guitar("Fender", 6);
        Instrument drum = new Drum("Yamaha", true);

        System.out.println(guitar);
        guitar.play();
        if (guitar instanceof Guitar) ((Guitar) guitar).strum();

        System.out.println();

        System.out.println(drum);
        drum.play();
        if (drum instanceof Drum) ((Drum) drum).hit();
    }
}
