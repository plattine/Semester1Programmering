package OwnExercises;

public class Circle extends ShapeSuperClass {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String describe() {
        return "This is a " + getColor() + " circle with a radius of " +
                radius + " cm";

    }


}
