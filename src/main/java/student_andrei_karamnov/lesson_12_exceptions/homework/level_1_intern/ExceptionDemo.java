package student_andrei_karamnov.lesson_12_exceptions.homework.level_1_intern;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            validate("Jason Addington");
            validate("Garry Livingston");
        } catch (MyException e) {
            System.out.println("Exception: " + e);
        }
    }

    public static void validate(String name) throws MyException {
        System.out.println("Name length: " + name.length());
        if (name.length() > 15) {
            throw new MyException("Your name must be shorter than 15", name);
        }
        System.out.println("It's OK.");
    }
}
