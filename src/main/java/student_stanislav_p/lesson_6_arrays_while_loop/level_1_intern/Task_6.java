package student_stanislav_p.lesson_6_arrays_while_loop.level_1_intern;

/*
Напишите тесты для проверки метода isEven(int number).
Упростите работу метода, код внутри может быть написан в одну строку.

class NumberUtils {

    public boolean isEven(int number) {
           return (number % 2 == 0);
      }
}


 */


public class Task_6 {


    static class NumberUtilsDemo {

        public static void main(String[] args) {

            NumberUtils testNumbers = new NumberUtils();

            int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            boolean[] expectedResultArray = {false, true, false, true, false, true, false, true, false, true};


            int i = 0;

            while (i < 10) {

              //  System.out.println((i+1) + "   "+ testNumbers.isEven(i) +"   " + expectedResultArray[i]);

                if (testNumbers.isEven(testArray[i]) == expectedResultArray[i]) {

                    if (testNumbers.isEven(testArray[i])) {
                        System.out.println("Number " + (i+1) + " - even.  Test is OK");
                    } else {
                        System.out.println("Number " + (i+1) + " - odd. Test is OK");
                    }
                } else {

                    System.out.println("Number " + (i+1) + "  -  Test FALSE");}


                    i++;


                }

            }
        }


    static class NumberUtils {

        public boolean isEven(int number) {return (number % 2 == 0);}
    }
}
