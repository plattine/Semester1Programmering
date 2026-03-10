package Lesson08.Inheritance;


// Superklasse: Instrument
class Instrument {
    protected String name;
    protected String type; // fx Strenge, Blæs, Slag

    public Instrument(String name, String type) {
        this.name = name;
        this.type = type;
    }


    @Override
    public String toString() {
        return "Instrument: " + name + ", type: " + type;
    }

    public void play() {
        System.out.println(name + " spilles...");
    }
}
