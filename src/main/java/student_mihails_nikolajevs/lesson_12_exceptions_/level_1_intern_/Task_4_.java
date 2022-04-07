package student_mihails_nikolajevs.lesson_12_exceptions_.level_1_intern_;

import teacher.annotations.CodeReview;

// Внесите изменения в код так, что бы сообщение об ошибке
// передать в конструктор супер класса.
@CodeReview(approved = true)
public class Task_4_ {

    class MyException extends Exception {

        public MyException(String message) {
            super(message);
        }
    }
}
