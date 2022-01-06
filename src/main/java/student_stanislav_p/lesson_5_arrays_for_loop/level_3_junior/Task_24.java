package student_stanislav_p.lesson_5_arrays_for_loop.level_3_junior;

/*
Исправьте код таким образом, что бы программа
выводила на консоль числа от 0 до 100:

class ForLoopDefinition9 {

    public static void main(String[] args) {
        for ( ; ; ) {
            System.out.println(i);
        }
    }

}

 */

 class Task_24 {



   static class ForLoopDefinition9 {

        public static void main(String[] args) {
            for (int i=0;i<=100;i++) {
                System.out.print(i + " , ");
                if (i %10 == 0) System.out.println(" ");
            }
        }

    }
}
