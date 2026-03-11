package Animals.model;

public class Bird extends Animal {

    private double timeToSleep;
    public Bird(String name, int age, double timeToSleep) {
        super(name, age);
        this.timeToSleep = timeToSleep;
    }

    public String makesSound() {
        return "Birds usually say: cheep! cheep! ";
    }

    public String favoriteFood() {
        return getName() + " loves eating seeds. ";
    }

    @Override
    public String toString() {
        return "This is a bird, its name is " +
                getName() + ", and it's " +
                getAge() + " years old. "  + getName() + "'s time to go to bed is: " +
                timeToSleep + ". ";
    }
}
