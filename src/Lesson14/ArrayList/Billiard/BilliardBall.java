package Lesson14.ArrayList.Billiard;

public class BilliardBall {

    // Encapsulation → private attributes
    private int number;       // 1–15
    private String color;     // f.eks. "Solid", "Striped", "Black"
    private int pointValue;   // point for at potte ballen

    // Constructor
    public BilliardBall(int number, String color, int pointValue) {
        this.number = number;
        this.color = color;
        this.pointValue = pointValue;
    }

    // Getters
    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public int getPointValue() {
        return pointValue;
    }

    // Setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    // toString
    @Override
    public String toString() {
        return "BilliardBall{" +
                "number=" + number +
                ", color='" + color + '\'' +
                ", points=" + pointValue +
                '}';
    }
}