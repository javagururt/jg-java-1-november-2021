package teacher.lesson_12_exceptions.lessoncode.exceptions;

class TryCatchExample {

    public static void main(String[] args) {
        try {
//            illegalArgumentException();
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            validateProductName("213");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
        } catch (ProductValidationException e) {
            System.out.println("Validation failed, reason: " + e.getMessage());
            e.printStackTrace();
            illegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("FINALLY");
        }
    }

    static void illegalArgumentException() {
        throw new IllegalArgumentException("Random error");
    }

    static void validateProductName(String name) {
        if (name.length() < 10) {
            throw new ProductValidationException("Product name should be greater than 10");
        }
    }
}
