package OwnExercises;

public class ShapeSuperClass {
    private String color;

    public ShapeSuperClass(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String describe() {
        return "This object has an unknown color";
    }
}
