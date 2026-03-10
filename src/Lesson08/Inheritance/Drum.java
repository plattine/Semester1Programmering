package Lesson08.Inheritance;


// Subklasse: Drum
class Drum extends Instrument {
    private boolean hasCymbal;

    public Drum(String name, boolean hasCymbal) {
        super(name, "Slag");
        this.hasCymbal = hasCymbal;
    }


    @Override
    public String toString() {
        return "Drum: " + name + ", cymbal: " + (hasCymbal ? "Yes" : "No");
    }

    public void hit() {
        System.out.println(name + " bliver slået: Boom Boom!");
    }
}
