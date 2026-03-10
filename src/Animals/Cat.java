package Animals;

public class Cat extends Animal {
    private String favoriteActivity;

    public Cat(String name, int age, String favoriteActivity) {
        super(name, age);
        this.favoriteActivity = favoriteActivity;
    }

    public String makesSound() {
        return "Cats love to say meow, meow!";
    }

    public String favoriteFood() {
        return getName() + " loves eating fish. ";
    }

    @Override
    public String toString() {
        return "This is a cat, its name is " +
                getName() + ", and it's " +
                getAge() + " years old. "  + getName() + "'s favorite activity is: " +
                favoriteActivity + ". ";
    }

}
