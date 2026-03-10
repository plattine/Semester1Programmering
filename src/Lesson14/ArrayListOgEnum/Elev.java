package Lesson14.ArrayListOgEnum;

//Elev
public class Elev {
    private String navn;
    private Hus hus;

    public Elev(String navn, Hus hus) {
        this.navn = navn;
        this.hus = hus;
    }

    public String getNavn() {
        return navn;
    }

    public Hus getHus() {
        return hus;
    }

    @Override
    public String toString() {
        return navn + " - " + hus;
    }
}
