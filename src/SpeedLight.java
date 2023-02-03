/**
 * Class: SpeedLight
 * @author Joey Chen
 * @version 1.0
 * Course: ITEC 2140 - 04, Spring 2023
 * Written: February 1, 2023
 * This class will calculate the distance of a lightning strike
 */
public class SpeedLight {
    public static void main (String[] args){

        int meterPerSec = 340;
        int thunderSeconds = 5;

        System.out.println("340 * 5 = " + (meterPerSec * thunderSeconds));
        //Shows the equation and calculates it to get the answer.
        System.out.println("The lightning strike happened " + (meterPerSec * thunderSeconds)
                + " meters away from you"); //Tells you how many meters away was the lightning

    }
}