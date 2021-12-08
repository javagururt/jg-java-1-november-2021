/*Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.

Test Data:
Input a number: 8

Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/

package student_jurij_mardusevic.lesson_2;
    public class Lesson2_Task9 {

        public static void main(String[] args) {
            int[] pif = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int q : pif) {
                for (int w : pif) {
                    System.out.printf("%4d", (q * w));
                }
                System.out.println();
            }
        }
    }



