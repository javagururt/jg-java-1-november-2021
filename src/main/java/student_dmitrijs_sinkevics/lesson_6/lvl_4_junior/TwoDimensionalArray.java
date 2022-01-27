package student_dmitrijs_sinkevics.lesson_6.lvl_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TwoDimensionalArray {

    public int[] arr = new int[2];

    public void fillArrayWithRandomNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 11) - 5);
        }
    }

}
