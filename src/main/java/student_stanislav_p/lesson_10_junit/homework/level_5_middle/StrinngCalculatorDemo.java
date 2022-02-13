package student_stanislav_p.lesson_10_junit.homework.level_5_middle;

public class StrinngCalculatorDemo {

    public static void main(String[] args) {

        StringCalculator stringCalculator = new StringCalculator();

        String numbers = "//[,]\n1,2,3,4,5,6,7,8,9";

        System.out.println("Array ->"+numbers);

        int summOfStringArray=stringCalculator.add(numbers);

        System.out.println("Summ of string array is "+summOfStringArray);




    }
}
