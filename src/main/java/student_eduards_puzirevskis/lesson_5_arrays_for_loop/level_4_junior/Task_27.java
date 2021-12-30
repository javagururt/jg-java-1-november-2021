package student_eduards_puzirevskis.lesson_5_arrays_for_loop.level_4_junior;


/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */
class Task_27 {
    public static void main(String[] args) {
        System.out.println("Alright, let's create random array.");
        int[] yourArray = new int[(int)(Math.random()*10)];
        System.out.println("Your random array is: ");
        for (int i = 0; i < yourArray.length; i++) {
            yourArray[i] = (int)(Math.random()*100);
            System.out.print(" " + yourArray[i] + " ");
        }
        int max = yourArray[0] - 1;
        for (int i = 0; i < yourArray.length; i++) {
            if (yourArray[i]> max) {
                max = yourArray[i];
            }
        }
        System.out.println("");
        System.out.println("Ok. Your random array maximal integer is: " + max);
    }
}
