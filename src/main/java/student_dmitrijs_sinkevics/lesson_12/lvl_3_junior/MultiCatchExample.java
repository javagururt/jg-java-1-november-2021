package student_dmitrijs_sinkevics.lesson_12.lvl_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class MultiCatchExample {

    public static void main(String[] args) {

        try {

        } catch (ArithmeticException a) { //сначала проверяем индивидуальные исключения,

        } catch (Exception e) { // потом проверяем все остальные исключения. Exception - родительский класс

        }

    }
}
