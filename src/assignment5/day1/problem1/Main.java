package assignment5.day1.problem1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5, "red");
        shapes[1] = new Rectangle(5, 4, "yellow");
        shapes[2] = new Square(5, "green");
        shapes[3] = new Circle(5, "blue");
        shapes[4] = new Rectangle(10, 5, "yellow");
        printTotal(shapes);
    }

    public static void printTotal(Shape[] shapes) {
        double sumOfArea = 0.0;
        double sumOfPerimeter = 0.0;
        for (Shape shape : shapes) {
            sumOfArea += shape.calculateArea();
            sumOfPerimeter += shape.calculatePerimeter();
        }
        System.out.println("The total area is : " + sumOfArea);
        System.out.println("The total parameter is : " + sumOfPerimeter);
    }
}
