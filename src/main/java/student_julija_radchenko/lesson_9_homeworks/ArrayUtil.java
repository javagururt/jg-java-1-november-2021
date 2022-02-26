package student_julija_radchenko.lesson_9_homeworks;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface ArrayUtil {
    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);
}
