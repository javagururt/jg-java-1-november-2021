package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_4_junior;

import teacher.annotations.CodeReview;

/*
Создайте класс WhileInfiniteLoop и в нём напишите бесконечный
цикл при помощи цикла while.

Создайте класс ForInfiniteLoop и в нём напишите бесконечный
цикл при помощи цикла for.
 */
@CodeReview(approved = true)
class WhileInfiniteLoop {
  public static void main(String[] args) {

   int counter = 1;

   while (counter>1) {
    System.out.println("Your counter is " + counter);
    counter++;
   }

  }
}
