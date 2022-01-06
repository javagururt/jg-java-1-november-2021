package student_andrei_karamnov.lesson_5_arrays_for_loop.level_4_junior;
/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.*/
class Task_30 {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Random array elements: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 999);
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("\nOdd elements: ");
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){System.out.print(" " + array[i]+ " ");
            }}
    }
}

