package student_valeriia_kulikova.lesson_10_junit.homework.level_5_middle;

public class StringCalculator {
    public int add(String numbers) {
    String [] numbersStringArray = numbers.split(",");

        int sum = 0;
        for (int i = 0; i < numbersStringArray.length; i++) {
            sum = sum + Integer.parseInt (numbersStringArray[i]);
        }
        return sum;
    }
}
