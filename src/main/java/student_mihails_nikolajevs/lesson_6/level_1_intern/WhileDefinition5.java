package student_mihails_nikolajevs.lesson_6.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class WhileDefinition5 {
    // Программа должна выводить числа от 1 до 100 на консоль.
    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {

            System.out.println(i);

            i++;
        }
    }
}
