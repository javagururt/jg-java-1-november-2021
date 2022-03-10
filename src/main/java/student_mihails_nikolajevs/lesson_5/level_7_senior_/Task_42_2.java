package student_mihails_nikolajevs.lesson_5.level_7_senior_;

import teacher.annotations.CodeReview;

/*
Решение с помощью цикла for each:
class Test {
	public static void main(String[] args) {
           int[] array = {51,136,387};

           for (int i:array) {
                System.out.println(i);
           }
	}
}

Если Вы запустите данный код, то в консоли Вы увидите следующее:

51
136
387

Как видите, цикл for each не требует ручного изменения
переменной - шага для перебора. Цикл автоматически выполняет эту работу.
 */
@CodeReview(approved = true)
public class Task_42_2 {

    public static void main(String[] args) {

        int[] array = {51,136,387};

        for (int i:array) {

            System.out.println(i);
        }
    }
}
