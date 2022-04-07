package student_dmitrijs_sinkevics.lesson_12.lvl_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String stringNull = null;
        System.out.println(stringNull.length()); // так как строка ровна null, нельзя вернуть длину строки
    }
}
