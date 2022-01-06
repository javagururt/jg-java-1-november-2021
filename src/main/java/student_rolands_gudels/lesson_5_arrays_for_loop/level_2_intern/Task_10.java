package student_rolands_gudels.lesson_5_arrays_for_loop.level_2_intern;

class Task_10 {
   /* Напишите программу, в которой:
            - создайте массив целых чисел длиной 3,
            - заполните каждую ячейку массива любым целым числом,
            - выведите значение каждой ячейки на консоль. */
   public static void main(String[] args) {
       int[] numbers = {1,2,3};
       for (int i=0; i<numbers.length; i++){
           System.out.println(numbers[i]);
       }

   }
}
