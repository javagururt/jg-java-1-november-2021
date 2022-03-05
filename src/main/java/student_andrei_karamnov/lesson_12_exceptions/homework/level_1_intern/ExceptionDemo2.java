package student_andrei_karamnov.lesson_12_exceptions.homework.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ExceptionDemo2 {
    public static void main(String[] args) {
        MyExceptionClass mc = new MyExceptionClass("Message 1", 1);
        String str = mc.getMessage();
        System.out.println("str = " + str);
    }
}

class MyExceptionClass extends Exception {

    private int number;
    public int getNumber(){return number;}
    public MyExceptionClass(String message, int num){

        super(message);
        number=num;
    }
}
