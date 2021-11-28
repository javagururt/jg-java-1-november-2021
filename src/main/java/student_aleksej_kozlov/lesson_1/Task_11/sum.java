package student_aleksej_kozlov.lesson_1.Task_11;

import java.util.Scanner;

public class sum
{
    public static void main(String[] args)
    {
        // 1. get first number from user
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter FIRST number:" );
        int firstNum = myInput.nextInt();                      // wait input 1

        // 2. get second number from user
        System.out.println("Enter SECOND number:" );
        int secondNum = myInput.nextInt();                     // wait input 2
        System.out.println();

        // 3. first number add second number
         int result = firstNum + secondNum;                    // sum

        // 4. print result to console
        System.out.println("Test Data:");                      // output
        System.out.println(firstNum + " + " + secondNum);
        System.out.println("Expected Output: ");
        System.out.println(result);
    }

}
