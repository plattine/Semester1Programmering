package Lesson08.Inheritance;


// Subklasse: Guitar
class Guitar extends Instrument {
    private int strings;

    public Guitar(String name, int strings) {
        super(name, "Strenge");
        this.strings = strings;
    }


    @Override
    public String toString() {
        return "Guitar: " + name + ", strings: " + strings;
    }

    public void strum() {
        System.out.println(name + " bliver strummmet: Strum Strum!");
    }
}
