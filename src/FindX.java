/**
 * Class: FindX
 * @author Joey Chen
 * @version 1.0
 * Course: ITEC 2140 - 04, Spring 2023
 * Written: February 1, 2023
 * This class shows the process of finding X in a equation.
 */
public class FindX {
    public static void main (String[] args){
        System.out.println("5 + 19 + X + 47 = 194"); //This line shows the problem that needs to be solved.
        System.out.println("X = 194 - 5 - 19 - 47"); //All variables moved from the left to the right of the equal sign.
        //Except for the missing variable.
        System.out.print("X = "); //What the missing variable is equal to.
        System.out.println(194 - 5 - 19 - 47); //Subtracts to calculate the missing variable.

    }
}
