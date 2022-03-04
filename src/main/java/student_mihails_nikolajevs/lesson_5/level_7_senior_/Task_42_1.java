package student_mihails_nikolajevs.lesson_5.level_7_senior_;
/*
Задача №1
Необходимо перебрать все элементы массива и вывести в консоль.

Решение с помощью цикла for:
class Test {
	public static void main(String[] args) {
           int[] array = {51,136, 387};

           for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
           }
	}
}

Если Вы запустите данный код, то в консоли Вы увидите следующее:

51
136
387
 */
public class Task_42_1 {

    public static void main(String[] args) {

        int[] array = {51,136, 387};

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }
}
