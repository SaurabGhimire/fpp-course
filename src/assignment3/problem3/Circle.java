package assignment3.problem3;

final public class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        double area = Math.PI * (Math.pow(radius, 2));
        return area;
    }
}
