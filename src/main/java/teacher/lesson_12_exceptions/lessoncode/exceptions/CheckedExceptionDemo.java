package teacher.lesson_12_exceptions.lessoncode.exceptions;

class CheckedExceptionDemo {

    public static void main(String[] args) {
        try {
            throwCheckedException();
            System.out.println("...");
            throwUncheckedException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void throwCheckedException() throws Exception {
        throw new Exception("Checked exception");
    }

    static void throwUncheckedException() {
        throw new RuntimeException("Unchecked exception");
    }
}
