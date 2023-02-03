/**Class: Cycle
 * @author Joey Chen
 * @version 1.0
 * Course: ITEC 2140 - 04, Spring 2023
 * Written: February 1, 2023
 * This class shows the process of finding the number of
 * tricycle wheels in a shop that has a total * of 47 wheels.
 */
public class Cycle {
    public static void main (String[] args){

        int allWheels = 47;
        int bicycles = 10;
        int biWheelEach = 2;

        System.out.println("10 * 2"); //Sets up the equation for finding total bicycle wheels
        System.out.println("Number of all bicycle wheels = " + (bicycles * biWheelEach));
        //Says how many bicycle wheels there are and then calculates how many in total

        int allBiWheels = (bicycles * biWheelEach);//20 bicycle wheels

        System.out.println("47 - 20"); //Sets up the equation for finding total tricycle wheels
        System.out.println("Number of tricycle wheels = " + (allWheels - allBiWheels));
        //Says how many tricycle wheels there are and calculates how many in total

        int allTriWheels = (allWheels - allBiWheels); //27 tricycle wheels
        int triWheelEach = 3;

        System.out.println("27 / 3"); //Sets up the equation for finding total tricycles
        System.out.println("Number of tricycles = " + (allTriWheels / triWheelEach));
        //Says how many tricycles there are and calculates how many in total

    }
}