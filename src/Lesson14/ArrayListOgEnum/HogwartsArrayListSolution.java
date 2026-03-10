package Lesson14.ArrayListOgEnum;


import java.util.ArrayList;

public class HogwartsArrayListSolution {
    public static void main(String[] args) {
        ArrayList<ElevSolution> elever = new ArrayList<>();

        // Tilføj elever med favoritfag
        elever.add(new ElevSolution("Harry", Hus.GRYFFINDOR, Fag.FORSVAR_MOD_MØRKE_KUNSTER));
        elever.add(new ElevSolution("Hermione", Hus.GRYFFINDOR, Fag.FORTRYLLELSER));
        elever.add(new ElevSolution("Draco", Hus.SLYTHERIN, Fag.ELIXIR));
        elever.add(new ElevSolution("Luna", Hus.RAVENCLAW, Fag.ASTROLOGI));
        elever.add(new ElevSolution("Cedric", Hus.HUFFLEPUFF, Fag.ELIXIR));

        // Udskriv alle elever
        System.out.println("Alle elever:");
        for (ElevSolution e : elever) {
            System.out.println(e);
        }

        // Udskriv elever med samme favoritfag
        System.out.println("\nElever der har favoritfaget ELIXIR:");
        printEleverMedFavoritFag(elever, Fag.ELIXIR);
    }

    // Metode til at finde og udskrive elever med et bestemt fag
    public static void printEleverMedFavoritFag(ArrayList<ElevSolution> elever, Fag fag) {
        for (ElevSolution e : elever) {
            if (e.getFavoritFag() == fag) {
                System.out.println(e.getNavn() + " - " + e.getHus());
            }
        }
    }
}
