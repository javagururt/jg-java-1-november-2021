package student_valeriia_kulikova.lesson_12_exceptions.homework.level_1_intern.Task_5;

public class ExceptionDemo extends Exception{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        arithmeticException(a,b);
        int [] array = new int[2];
        arrayException(array, 2);
    }

    public static void arithmeticException (int a, int b){

        int c;
        try {
            c = a/b;
            System.out.println("a/b = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Message: " +e.getMessage());
        }
    }

    public static void arrayException (int [] array, int index) {
        try {
            array[index] = 125;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Message: " + e.getMessage());
        }
    }
}
