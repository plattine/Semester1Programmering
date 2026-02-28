package Tamagotchi;

class Dog extends Tamagotchi {

    public Dog(String name, int energy) {
        super(name, energy);
    }

    @Override
    public void feed(Food food) {
        if (food == Food.BONE || food == Food.MEAT) {
            setEnergy(getEnergy() + 2);
            System.out.println(getName() + " loves eating bones or meat!");
        } else {
            setEnergy(getEnergy() + 1);
            System.out.println(getName() + " eats the " + food + " but actually prefers bones and meat.");
        }
    }

    @Override
    public void play() {
        setEnergy(getEnergy() - 2);
        System.out.println(getName() + " is running after a stick, now its energy" +
                " went down 2 and its hunger went up 2. But we don't track 'hunger' yet.");
    }

    @Override
    public String toString() {
        return "Dog, " + super.toString();
    }

}
