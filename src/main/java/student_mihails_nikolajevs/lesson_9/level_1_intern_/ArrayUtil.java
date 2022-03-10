package student_mihails_nikolajevs.lesson_9.level_1_intern_;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);

}
