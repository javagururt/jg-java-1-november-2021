package student_jurij_mardusevic.lesson_5_arrays_for_loop.homework.level_2_intern.Task_13;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SumOfAllArrayIntegers {
    public static void main(String[] args) {
        int[] sumArray = new int[3];
        sumArray[0] = (int)(Math.random()*9999);
        sumArray[1] = (int)(Math.random()*9999);
        sumArray[2] = (int)(Math.random()*9999);
        System.out.println(sumArray[0]);
        System.out.println(sumArray[1]);
        System.out.println(sumArray[2]);
        int sumArrayIntegers = sumArray[0] + sumArray[1] + sumArray[2];
        System.out.println("Сумма всех целых чисел массива = " + sumArrayIntegers);
    }
}
