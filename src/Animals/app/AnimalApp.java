package Animals.app;
import Animals.model.*;
import Animals.service.AnimalFileHandler;
import Animals.ui.AnimalUI;

public class AnimalApp {

    public static void main(String[] args) {
        AnimalUI ui = new AnimalUI();
        AnimalFileHandler save = new AnimalFileHandler();
        ui.addAnimals();
        save.saveFile(ui.getAnimalArray(), "src/Animals/animals.txt");
    }






}
