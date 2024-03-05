package assignment5.day2.problem3;

//Here is a list of the things you need to do for this problem:
//a. Create an Interface Figure with void getFigure() method need to print the figure.
//b. Create classes which implements Figure interface such as UpwardHat,
//        DownwardHat, FaceMaker and Vertical. You have to override the getFigure()
//method to display the figures /\, \/,:), and ||.
//c. Create your main method for the Driver class. Apply polymorphism to create an
//array of objects of Figure type. The output after running the main method should
//look like this.
//        /\ /\ \/ :) ||
//d. Again print the same output along with their class name as look like this.
//UpwardHat : /\
//UpwardHat : /\
//DownwardHat : \/
//FaceMaker : :)
//Vertical : | |
public interface Figure {
    // public final void getFigure();
    void getFigure();

    void printClassNameAndFigure();

}
