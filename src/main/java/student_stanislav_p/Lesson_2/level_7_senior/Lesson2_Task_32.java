package student_stanislav_p.Lesson_2.level_7_senior;

import teacher.annotations.CodeReview;

/*
Напишите программу и продемонстрируйте в ней использование
однострочного и многострочного коментариев.

 *
 */
@CodeReview(approved = true)
class Lesson2_Task_32 {
    public static void main(String args []) {
        int num1; /* в этой строке кода объявляется переменная с именем num1
                   эта переменная целого вида*/

        num1 = 50; // в этой строке кода переменной num1 присваивается значение 50

        int num2; // в этой строке кода объявляется переменная с именем num2
                  // эта переменная целого вида

        num2 = 3; // в этой строке кода переменной num2 присваивается значение 3


        System.out.println("Это переменная num1: " + num1);
        System.out.println("Это переменная num2: " + num2);

        int num3; // в этой строке кода объявляется переменная с именем num3

        num3 = num1 / num2;

        System.out.print("Значение деления  равно ");
        System.out.println(num3);
    }
}