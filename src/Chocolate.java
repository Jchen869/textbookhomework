/**Class: Chocolate
 * @author Joey Chen
 * @version 1.0
 * Course: ITEC 2140 - 04, Spring 2023
 * Written: February 1, 2023
 * This class shows the process of finding how many bags is needed to fit 3 chocolate bars
 */
public class Chocolate {
    public static void main (String[] args){

        int Bags = 9;
        int CocoBars = 2;
        System.out.print("Total Chocolate Bars = ");
        System.out.println(Bags * CocoBars);

        int NewEach = 3;
        System.out.println("18 / 3");
        System.out.print("Number of bags needed = ");
        System.out.println(Bags * CocoBars / NewEach);

    }
}
