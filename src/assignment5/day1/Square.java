package assignment5.day1;

public class Square extends Rectangle {
    double side;

    Square(double side, String color) {
        super(side, side, color);
        this.side = side;
    }
}
