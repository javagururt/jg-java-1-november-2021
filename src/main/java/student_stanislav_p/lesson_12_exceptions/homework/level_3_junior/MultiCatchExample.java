package student_stanislav_p.lesson_12_exceptions.homework.level_3_junior;


/*

---- Task_20 ----
Правильно ли написан try catch блок? Откомпилируется ли код?

try {

} catch (Exception e) {

} catch (ArithmeticException a) {

}

Создайте класс MultiCatchExample и в его main() методе
поместите правильный try catch блок и в комментариях напишите пояснение.

*/

/** Написано неправильно. Надо поменять местами блоки catch */


import java.util.Scanner;

public class MultiCatchExample {

            public static void main(String args[])
            {
                Scanner scn = new Scanner(System.in);
                try {
                    int n = Integer.parseInt(scn.nextLine());

                    System.out.println(n + " is a " + (99%n == 0) +" factor of 99");
                }
                catch (ArithmeticException e)  // сперва мы обрабатываем это исключения
                {
                    System.out.println("Arithmetic " + e);
                }
                catch (Exception e)
                {
                    System.out.println("Exception " + e);
                }
            }
}
