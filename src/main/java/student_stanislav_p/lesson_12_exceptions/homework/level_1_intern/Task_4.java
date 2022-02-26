package student_stanislav_p.lesson_12_exceptions.homework.level_1_intern;

public class Task_4 {}


    class MyException extends Exception {
        private int detail;

        public MyException(int detail, String message) {
            super(message);
            this.detail = detail;
        }

        @Override
        public String toString() {
            return "MyException{"
                    + "detail=" + detail
                    + ", message=" + getMessage()
                    + "} ";
        }
    }

class MyExceptionDemo {
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Exception: " + e);
        }
    }

    public static void compute(int a) throws MyException {
        System.out.println("Run method compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a, "Exception message");
        }
        System.out.println("Normal working result.");
    }
}