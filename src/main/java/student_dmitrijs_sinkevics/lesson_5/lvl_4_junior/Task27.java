package student_dmitrijs_sinkevics.lesson_5.lvl_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task27 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) (Math.random() * 41) - 20);
            ;
        }

        for (int number : numbers)
            System.out.println(number);

        int max=numbers[0];
        for (int i = 1; i< numbers.length; i++){
            if (max<numbers[i])
                max=numbers[i];
        }
        System.out.println("Max= "+max);
    }
}