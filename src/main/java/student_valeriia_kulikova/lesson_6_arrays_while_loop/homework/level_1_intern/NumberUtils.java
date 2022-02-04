package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_1_intern;

class NumberUtils {
    public static void main(String[] args) {
        int argument = 5;
        boolean result = false;

        boolean testResult = isEven(argument);

        if (result==testResult) {
            System.out.println("Test 1 is OK");
        }
        else {
            System.out.println("Test 1 is FAIL");
        }
    }

    static boolean isEven(int number) {
        return (number % 2 == 0);
    }

}
