package student_valeriia_kulikova.lesson_10_junit.homework.level_5_middle;

import java.util.Arrays;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StringCalculator {
    public int add(String numbers) {
        String[] numbersStringArray = numbers.split(",");
        int sum = 0;
        try {
            for (int i = 0; i < numbersStringArray.length; i++) {
                sum = sum + Integer.parseInt(numbersStringArray[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong format!");
            return 0;
        }
        return sum;
    }

    public int add2 (String numbers) {
        String [] numbersStringArray = numbers.split(",|\n");

        int sum = 0;
        for (int i = 0; i < numbersStringArray.length; i++) {
            sum = sum + Integer.parseInt (numbersStringArray[i]);
        }
        return sum;
    }

    public int add3 (String numbers) {
        String [] numbersStringArray = numbers.split("\n");
        String regex = numbersStringArray[0].substring(3,4);
        String [] newNumberStringArray = numbersStringArray[1].split(regex);
        System.out.println(regex);
        System.out.println(Arrays.toString(newNumberStringArray));

        int sum = 0;
        for (int i = 0; i < newNumberStringArray.length; i++) {
            sum = sum + Integer.parseInt (newNumberStringArray[i]);
        }
        return sum;
    }

}
