package Tamagotchi;

import org.w3c.dom.ls.LSOutput;

abstract class Tamagotchi {

    private String name;
    private int energy;

    public Tamagotchi(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    //setters
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    //abstract methods

    public abstract void feed(Food food);

    public abstract void play();

    //normal method

    public boolean isDead() {
        return energy <= 0;
    }

    //toString method for printing clean

    @Override
    public String toString() {
        return "Name: " + getName() + ", Energy: " + getEnergy();
    }
}
