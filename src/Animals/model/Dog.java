package Animals.model;

public class Dog extends Animal {

    private String toy;

    public Dog(String name, int age, String toy) {
        super(name, age);
        this.toy = toy;

    }

    public String makesSound() {
        return "Dogs love to say: Woof! Woof! ";
    }

    public String favoriteFood() {
        return getName() +  " likes bones and meat. ";
    }

    @Override
    public String toString () {
        return "This is a dog, its name is " +
                getName() + ", and it's " +
                getAge() + " years old. "  + getName() + " loves playing with a " +
                 toy + ". ";
    }

}
