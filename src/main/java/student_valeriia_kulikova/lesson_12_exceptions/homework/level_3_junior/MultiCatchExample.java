package student_valeriia_kulikova.lesson_12_exceptions.homework.level_3_junior;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }
}
/*
        Сначала указывается конкретные исключения (Арифметическая ошибка / Выход за пределы массива / и другие).
        Exception является родительским классом и указывается в самом конце, так как он охватывает намного больше исключений
        и дает возможность проверить на такие исключения, на которые мы не указали. Если родительский класс поставить
        в начале, то индивидуальные проверки проводиться уже не будут.
        */
