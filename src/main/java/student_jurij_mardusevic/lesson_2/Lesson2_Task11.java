/*Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).

Примечение: обратите внимание, что результат может быть дробным числом.*/

package student_jurij_mardusevic.lesson_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "требуется среднее арифм.")
public class Lesson2_Task11 {
    public static void main(String[] argv) {
        System.out.println(median(93, 2, 9));
    }

    public static double median(double a, double b, double c) {
        return Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));
    }
}
