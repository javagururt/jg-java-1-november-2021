package student_jurij_mardusevic.lesson_5_arrays_for_loop.homework.level_2_intern.Task_14;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class AverageAllArrayIntegers {
    public static void main(String[] args) {
        int[] averageOfArray = new int[3];
        averageOfArray[0] = (int)(Math.random()*999);
        averageOfArray[1] = (int)(Math.random()*999);
        averageOfArray[2] = (int)(Math.random()*999);
        System.out.println(averageOfArray[0]);
        System.out.println(averageOfArray[1]);
        System.out.println(averageOfArray[2]);
        int sum = 0;
        for (int x: averageOfArray) {
            sum += x;
        }
        System.out.println("Среднее значение массива: " + sum/ averageOfArray.length);
    }

}

