package student_eduards_puzirevskis.lesson_12_exeptions.level_1_intern.task_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class MyExсeption extends Exception {

    private final int exceptionNumber;

    MyExсeption(int exceptionNumber, String message) {
        super(message);
        this.exceptionNumber = exceptionNumber;
    }

    public int getExceptionNumber() {
        return exceptionNumber;
    }
}
