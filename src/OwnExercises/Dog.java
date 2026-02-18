package OwnExercises;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }


    @Override
    public String makeSound() {
        return "Wow! wow!";
    }
}