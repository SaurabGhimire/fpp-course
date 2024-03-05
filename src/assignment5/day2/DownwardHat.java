package assignment5.day2;

public class DownwardHat implements Figure {
    @Override
    public void getFigure() {
        System.out.print("/\\ ");
    }

    @Override
    public void printClassNameAndFigure() {
        System.out.println("DownwardHat : /\\ ");
    }
}