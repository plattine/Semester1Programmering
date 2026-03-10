package Lesson09.MiniProject.Solution;

import Lesson09.MiniProject.Pet;

class Bird extends Pet {

    // New attribute specific to Bird
    private double wingSpan;

    // Constructor
    public Bird(String name, double wingSpan) {
        super(name);
        this.wingSpan = wingSpan;
    }

    // Getter
    public double getWingSpan() {
        return wingSpan;
    }

    // Setter
    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Bird: " + getName() +
                " (wing span: " + wingSpan + " m) (chirp chirp!)";
    }
}
