package Lesson17.Comparator.Fish;

// Fish class with name and weight
class Fish {
    private String name;
    private double weight; // in kg
    private int age;

    public Fish(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg), " + age + " years";
    }
}
