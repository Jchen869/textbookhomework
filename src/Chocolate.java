/**Class: Chocolate
 * @author Joey Chen
 * @version 1.0
 * Course: ITEC 2140 - 04, Spring 2023
 * Written: February 1, 2023
 * This class shows the process of finding how many bags is needed to fit 3 chocolate bars
 */
public class Chocolate {
    public static void main (String[] args){

        int bags = 9;
        int cocoBars = 2;
        System.out.print("Total Chocolate Bars = "); //Says what the total amount of chocolate bars
        System.out.println(bags * cocoBars); //Calculates the total amount of chocolate bars

        int newEach = 3;
        System.out.println("18 / 3");
        //Divides the total amount of chocolate bars
        // by how many chocolate bars is need in each bag
        System.out.print("Number of bags needed = "); //Says what the total of bag are needed
        System.out.println(bags * cocoBars / newEach);
        //Calculates how many bags is
        // needed to fit 3 chocolates in each

    }
}
