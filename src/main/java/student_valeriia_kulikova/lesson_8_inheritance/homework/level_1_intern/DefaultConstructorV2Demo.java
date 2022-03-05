package student_valeriia_kulikova.lesson_8_inheritance.homework.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructorV2Demo {
    public static void main(String[] args) {
        DefaultConstructorV2 numbers = new DefaultConstructorV2();
        System.out.println("Sum of numbers: " + numbers.GetSumOfNumbers());
    }
}
