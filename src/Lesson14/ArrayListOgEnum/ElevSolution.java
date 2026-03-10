package Lesson14.ArrayListOgEnum;

public class ElevSolution {
    private String navn;
    private Hus hus;
    private Fag favoritFag;  // nyt felt

    public ElevSolution(String navn, Hus hus, Fag favoritFag) {
        this.navn = navn;
        this.hus = hus;
        this.favoritFag = favoritFag;
    }

    public String getNavn() {
        return navn;
    }

    public Hus getHus() {
        return hus;
    }

    public Fag getFavoritFag() {
        return favoritFag;
    }

    @Override
    public String toString() {
        return navn + " - " + hus + " - Favoritfag: " + favoritFag;
    }
}
