//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите наименьшее число в массиве и выведети его на консоль.

package student_dima_talanov.lesson_5.level_4_junior;

public class Task28 {

    public static void main(String[] args) {
        int myArray[] = new int[10];
        System.out.println("My array number is: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 30);
            System.out.print(myArray[i] + ", ");
        }
        int minNumber = myArray[0] + 1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < minNumber)
                minNumber = myArray[i];
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Min array number is: " + minNumber);
    }
}

