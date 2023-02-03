/**
 * Class: Circle
 * @author Joey Chen
 * @version 1.0
 * Course: ITEC 2140 - 04, Spring 2023
 * Written: February 1, 2023
 * This class will calculate the area and perimeter of a circle using the following formula
 * area = radius * radius * Math.PI
 * perimeter = 2 * radius * Math.PI
 */
public class Circle {
    public static void main(String[] args) {

        double radius = 9.5;

        System.out.println("Area = " + (radius * radius * Math.PI));
        //Says what the area is equal to then calculates the area
        System.out.println("Perimeter = " + (2 * radius * Math.PI));
        //Says what the perimeter is equal to then calculates the perimeter

    }
}
