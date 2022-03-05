package student_valeriia_kulikova.lesson_9_interfaces.homework.level_1_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
interface ArrayUtil {
    public int[] createArray(int arrayLength);

    public void fillArrayWithRandomNumbers(int[] array);

    public void printArrayToConsole(int[] array);


    public int findMaxNumber(int[] array);

    public int findMinNumber(int[] array);


}
