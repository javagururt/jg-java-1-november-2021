package student_andrei_karamnov.lesson_5_arrays_for_loop.level_2_intern;
/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль,
 - увеличьте значение каждой ячейки на 2,
 - выведите значение каждой ячейки на консоль.*/
class Task_15 {
    public static void main(String[] args) {
        System.out.println("Random array elements: ");
        int[] randomInt = new int[3];
        for(int i = 0; i < randomInt.length; i++){
            randomInt[i] = (int)(Math.random() * 999);
            System.out.println(randomInt[i]);
        }
        System.out.println("Random array elements increased by two: ");
        for(int i =0; i < randomInt.length; i++){
        int everyRandomIntIncreasedByTwo = randomInt[i] + 2;
            System.out.println(everyRandomIntIncreasedByTwo);
        }

    }
}
