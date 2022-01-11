package student_jurij_mardusevic.lesson_5_arrays_for_loop.homework.level_2_intern.Task_12;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class RandomArrayIntegers {

    public static void main(String[] args) {
        int[] randomArray = new int[3];
        randomArray[0] = (int)(Math.random()*99999);
        randomArray[1] = (int)(Math.random()*99999);
        randomArray[2] = (int)(Math.random()*99999);
        System.out.println(randomArray[0]);
        System.out.println(randomArray[1]);
        System.out.println(randomArray[2]);
    }
}
