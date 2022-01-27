package student_dmitrijs_sinkevics.lesson_6.lvl_4_junior;

import java.util.Arrays;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TwoDimensionalArraySumDemo {
    public static void main(String[] args) {
        TwoDimensionalArraySumDemo calculator = new TwoDimensionalArraySumDemo();
        calculator.calculateArraySum();
    }

    public void calculateArraySum() {
        TwoDimensionalArray array = new TwoDimensionalArray();
        int[] arr = array.arr;
        array.fillArrayWithRandomNumbers(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Array sum: " + sum);
    }

}

