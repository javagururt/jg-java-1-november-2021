package student_rolands_gudels.lesson_12_exceptions.level_1_intern;

import student_rolands_gudels.lesson_5_arrays_for_loop.lesson_12_exceptions.level_1_intern.FactorialException;

public class exceptionDemo {
    public static void main(String[] args) {
        class Factorial {

            public static int getFactorial(int num) throws FactorialException {

                int result = 1;
                if (num < 1) throw new FactorialException("The number is less than 1", num);

                for (int i = 1; i <= num; i++) {

                    result *= i;
                }
                return result;
            }
        }
        try{
            int result = Factorial.getFactorial(0);
            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}


