package Animals.model;

public abstract class Animal {
    private String name;
    private int age;

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String makesSound();

    public abstract String favoriteFood();

    @Override
    public String toString() {
        return "This is an animal, its name is " +
                 name + ", and it is " +
                 age + " years old.";
    }
}
