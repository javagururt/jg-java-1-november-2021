package student_rolands_gudels.lesson_9_interfaces.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);
}
