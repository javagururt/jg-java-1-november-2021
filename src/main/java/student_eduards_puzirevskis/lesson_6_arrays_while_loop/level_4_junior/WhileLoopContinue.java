package student_eduards_puzirevskis.lesson_6_arrays_while_loop.level_4_junior;
/*
Создайте класс WhileLoopContinue и в нём продемонстрируйте
как досрочно закончить текущую итерацию цикла while.
 */
 class WhileLoopContinue {

     public static void main(String[] args) {

         int counter = 0;
         while (counter < 100) {
             System.out.println("Your counter is " + counter);
             counter++;
             if (counter == 16) {
                 System.out.println("Your counter is enough for now");
                 break;
             }
         }

     }
}
