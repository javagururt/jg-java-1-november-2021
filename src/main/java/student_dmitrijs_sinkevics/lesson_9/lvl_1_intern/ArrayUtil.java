package student_dmitrijs_sinkevics.lesson_9.lvl_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface ArrayUtil {
    public int[] createArray(int arrayLength);

    public void fillArrayWithRandomNumbers(int[] array);

    public void printArrayToConsole(int[] array);

    public int findMaxNumber(int[] array);

    public int findMinNumber(int[] array);
}
