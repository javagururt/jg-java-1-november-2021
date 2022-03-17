package student_rolands_gudels.lesson_12_exceptions.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_4 {
    /*  Внесите изменения в код так, что бы сообщение об ошибке
    передать в конструктор супер класса.*/

    class MyException extends Exception {

        public MyException(String message) {
            super(message);
        }

    }
}

