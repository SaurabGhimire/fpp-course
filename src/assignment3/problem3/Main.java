package assignment3.problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter C for Circle");
            System.out.println("Enter R for Rectangle");
            System.out.println("Enter T for Triangle");

            String selectedItem = sc.next();
            double area;

            switch (selectedItem) {
                case "C":
                    System.out.println("Enter the radius of the circle");
                    double radius = sc.nextDouble();
                    Circle c = new Circle(radius);
                    area = c.computeArea();
                    System.out.println("The area of circle is: " + area);
                    break;
                case "R":
                    System.out.println("Enter the width of the rectangle");
                    double width = sc.nextDouble();

                    System.out.println("Enter the height of the rectangle");
                    double height = sc.nextDouble();

                    Rectangle r = new Rectangle(width, height);
                    area = r.computeArea();
                    System.out.println("The area of rectangle is: " + area);

                    break;
                case "T":
                    System.out.println("Enter the base of the rectangle");
                    double base = sc.nextDouble();

                    System.out.println("Enter the height of the rectangle");
                    double rheight = sc.nextDouble();

                    Triangle t = new Triangle(base, rheight);
                    area = t.computeArea();
                    System.out.println("The area of triangle is: " + area);

                    break;
                default:
                    System.out.println("Please select one of the given letters");
            }
        }
    }
}
