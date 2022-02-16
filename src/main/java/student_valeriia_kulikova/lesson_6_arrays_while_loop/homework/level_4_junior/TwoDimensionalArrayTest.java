package student_valeriia_kulikova.lesson_6_arrays_while_loop.homework.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TwoDimensionalArrayTest {
    public static void main(String[] args) {

        TwoDimensionalArray array = new TwoDimensionalArray();

        System.out.println("First step - array creation.");

        int [][] testArray1 = array.createArray();

        System.out.println(testArray1.length);
        System.out.println(testArray1[0].length);


        System.out.println("Second step - array filling.");

        int [][] testArray2 = array.fillArray(testArray1);


        System.out.println("Third step - sum calculation.");

        int testArray3 = array.sumOfArray(testArray2);
        System.out.println("Sum of array: " + testArray3);

    }
}
