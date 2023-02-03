/**
 * Class: Circle
 * @author Joey Chen
 * @version 1.0
 * Course: ITEC 2140 - 04, Spring 2023
 * Written: February 1, 2023
 * This class will display the area and perimeter of a circle
 * Write a program named Circle.java that displays the area and perimeter of a Circle
 * that has a radius of 9.5 using the following formula:
 * area = radius * radius * Math.PI
 * perimeter = 2 * radius * Math.PI
 */
public class Circle {
    public static void main(String[] args) {

        //1 to create a Scanner type object input
        //this Scanner type will set up th environment to let the user input value
        //Then, method or function defined in the scanner type will retrieve the input value
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter radius:");

        double radius = input.nextDouble();



    }
}
