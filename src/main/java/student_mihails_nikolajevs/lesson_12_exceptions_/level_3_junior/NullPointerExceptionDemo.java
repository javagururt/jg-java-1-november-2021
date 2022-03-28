package student_mihails_nikolajevs.lesson_12_exceptions_.level_3_junior;
/*
Создайте класс NullPointerExceptionDemo
и в main() методе этого класса
В комментариях напишите, когда происходит NullPointerException.
 */
public class NullPointerExceptionDemo {

    public static void main(String[] args) {

        foo(null);
    }
    public static void foo(String s) {
        System.out.println(s.toLowerCase());
    }
}

//  NullPointerException when null is passed in method argument.
//  This is one of the most common occurrences of java.lang.NullPointerException
//  because it’s the caller who is passing the null argument.