package Lesson14.ArrayListOgEnum;


import java.util.ArrayList;
//With ArrayList
public class HogwartsArrayList {
    public static void main(String[] args) {
        // Opret ArrayList til elever
        ArrayList<Elev> elever = new ArrayList<>();

        // Tilføj elever
        elever.add(new Elev("Harry", Hus.GRYFFINDOR));
        elever.add(new Elev("Hermione", Hus.GRYFFINDOR));
        elever.add(new Elev("Draco", Hus.SLYTHERIN));
        elever.add(new Elev("Luna", Hus.RAVENCLAW));
        elever.add(new Elev("Cedric", Hus.HUFFLEPUFF));

        // Udskriv alle elever
        System.out.println("Elever på Hogwarts:");
        for (Elev e : elever) {
            System.out.println(e);
        }

        // Find alle elever i Gryffindor
        System.out.println("\nElever i Gryffindor:");
        for (Elev e : elever) {
            if (e.getHus() == Hus.GRYFFINDOR) {
                System.out.println(e.getNavn());
            }
        }
    }
}
