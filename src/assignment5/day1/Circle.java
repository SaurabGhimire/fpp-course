package assignment5.day1;

public class Circle extends Shape {
    double radius;

    Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
