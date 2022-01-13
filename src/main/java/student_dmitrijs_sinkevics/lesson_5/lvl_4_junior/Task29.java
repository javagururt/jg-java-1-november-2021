package student_dmitrijs_sinkevics.lesson_5.lvl_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task29 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) (Math.random() * 41) - 20);
            ;
        }

        for (int number : numbers)
            System.out.print(number + ", ");
        System.out.println();

        for (int i = 1; i< numbers.length; i++){
            if (numbers[i]%2==0)
                System.out.print(numbers[i]+", ");
        }

    }
}

