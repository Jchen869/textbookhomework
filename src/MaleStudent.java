/**Class: MaleStudent
 * @author Joey Chen
 * @version 1.0
 * Course: ITEC 2140 - 04, Spring 2023
 * Written: February 1, 2023
 * This class shows the process of finding how many male students are in a middle school.
 */
public class MaleStudent {
    public static void main (String[] args){

        System.out.println("There are 389 students in a small middle school. " +
                "How many students are male give that there are 175 female students?"); //Explains the problem
        int allStudents = 389;
        int femaleStudents = 175;

        System.out.println("175 + x = 389"); //Shows the setup equation
        System.out.println("x = 389 - 175"); //Moves 175 to the right of the equal sign and subtracts it
        System.out.println("x = " + (allStudents - femaleStudents));
        //The amount of all students minus the female students

    }
}