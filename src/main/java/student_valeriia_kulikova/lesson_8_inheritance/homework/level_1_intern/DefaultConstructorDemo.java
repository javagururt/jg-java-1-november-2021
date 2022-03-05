package student_valeriia_kulikova.lesson_8_inheritance.homework.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructorDemo {
    public static void main(String[] args) {
        DefaultConstructor numbers = new DefaultConstructor();
        System.out.println("Sum of Numbers: " + numbers.GetSumOfNumbers());
    }
}
