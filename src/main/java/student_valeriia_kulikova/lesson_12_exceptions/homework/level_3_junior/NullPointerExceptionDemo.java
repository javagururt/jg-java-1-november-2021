package student_valeriia_kulikova.lesson_12_exceptions.homework.level_3_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String text = null;
        System.out.println(text.length());
    }
}
/*  Exception in thread "main" java.lang.NullPointerException:
    Cannot invoke "String.length()" because "text" is null
	at NullPointerExceptionDemo.main(NullPointerExceptionDemo.java:6) */
