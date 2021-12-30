package student_rolands_gudels.lesson_5_arrays_for_loop.level_7_senior;

public class Task_42 {

/*    Цикл for each:

            - это разновидность цикла for
            - используется для перебора элементов массива или коллекции
- впервые цикл for each появился в JDK5. В более ранних версиях JDK этого вида цикла не было.

    Давайте посмотрим как выглядит общая форма цикла for и цикла for each.

    Общая форма цикла for:

            for (инициализация; условие; итерация) {
        // действия, которые выполняются
    }

    Общая форма цикла for each:

            for (тип и название: название массива/коллекции) {
        // действия, которые выполняются
    }

    Внимание: в цикле for each тип должен соответствовать типу массива!

    Чтобы понять в чем же все-таки отличие между этим 2 циклами, предлагаем решить одну и ту же задачу 2-мя способами:

            1. С помощью цикла for

            2. C помощью цикла for each

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
    переменной - шага для перебора. Цикл автоматически выполняет эту работу.*/
}
