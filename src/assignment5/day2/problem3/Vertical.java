package assignment5.day2.problem3;

public class Vertical implements Figure {
    @Override
    public void getFigure() {
        System.out.print("|| ");
    }

    @Override
    public void printClassNameAndFigure() {
        System.out.println("Vertical : || ");
    }
}
