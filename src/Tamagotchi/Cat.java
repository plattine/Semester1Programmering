package Tamagotchi;

class Cat extends Tamagotchi {

    public Cat(String name, int energy) {
        super(name, energy);
    }

    @Override
    public void feed(Food food) {
        if (food == Food.FISH) {
            setEnergy(getEnergy() + 2);
            System.out.println(getName() + " loves fish!");
        } else {
            setEnergy(getEnergy() + 2);
            System.out.println(getName() + " eats the " + food + " but would rather eat fish.");
        }
    }

    @Override
    public void play() {
        setEnergy(getEnergy() -1);
        System.out.println(getName() + " is running after a ball, now its energy" +
                " went down 1 and its hunger went up 1. But we don't track 'hunger' yet.");
    }

    @Override
    public String toString() {
        return "Cat, " + super.toString();
    }




}
