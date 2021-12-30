package student_andrei_karamnov.lesson_5_arrays_for_loop.level_4_junior;
/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.*/
class Task_28 {
    public static void main(String[] args) {
        int[] array = new int[6];
            System.out.println("Random array elements: ");
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 999);
            System.out.print(" " + array[i] + " ");
        }
        int minimum = array[0];
        for (int i = 0; i < array.length; i++){
        if(array[i] < minimum){
            minimum = array[i];
        }}
            System.out.println("\n");
            System.out.println("Smallest element is: " + minimum);
    }
}
