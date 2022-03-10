package student_mihails_nikolajevs.lesson_6.level_1_intern;

import teacher.annotations.CodeReview;

/*
апишите тесты для проверки метода isEven(int number).
Упростите работу метода, код внутри может быть написан в одну строку.

class NumberUtils {

    public boolean isEven(int number) {
           return (number % 2 == 0);
      }
}
 */
@CodeReview(approved = true)
public class NumberUtils {

    public boolean isEven(int number) {
    return (number % 2 == 0);
    }
}
