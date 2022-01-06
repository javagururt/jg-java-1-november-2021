package student_andrei_karamnov.lesson_5_arrays_for_loop.level_4_junior;
/*Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.*/
class Task_27 {
    public static void main(String[] args) {
        int[] array = new int[5];
            System.out.println("Random array elements: ");
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 999);
            System.out.print(" " + array[i] + " ");
        }
        int maximum = 0;
        for (int i = 0; i < array.length; i++) {
        if(array[i] > maximum){
            maximum = array[i];
        }}
            System.out.println("\n");
            System.out.println("Largest element is: " + maximum);
    }
}