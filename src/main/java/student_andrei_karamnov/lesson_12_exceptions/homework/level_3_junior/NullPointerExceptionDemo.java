package student_andrei_karamnov.lesson_12_exceptions.homework.level_3_junior;

class NullPointerExceptionDemo {

/*Создайте класс NullPointerExceptionDemo
и в main() методе этого класса напишите код,
который приводит к появлению NullPointerException.
В комментариях напишите, когда происходит NullPointerException.*/

    public static void main(String[] args) {
        calculateSomething(null);
    }

    public static void calculateSomething(Integer num){
        if (num == null)
            throw new IllegalArgumentException("Num не должен быть null");
    }

}
