package student_eduards_puzirevskis.lesson_12_exeptions.level_3_junior;

import teacher.annotations.CodeReview;

/*
Получим результат:
   1. Got the Test Exception
   Inside finally block
   Так так:
   Блок try сразу выкидывает новый эксепшн TestException().
   TestException() выводит на консоль "Got the Test Exception".
   Блок finally выполняется всегда
 */
@CodeReview(approved = true)
 class TestException extends Exception {

     public static void main(String[] args) {
         try {
             throw new TestException();
         } catch(TestException t) {
             System.out.println("Got the Test Exception");
         } finally {
             System.out.println("Inside finally block ");
         }
     }
}
