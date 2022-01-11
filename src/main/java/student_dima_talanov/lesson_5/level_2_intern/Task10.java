package student_dima_talanov.lesson_5.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task10 {

    public static void main(String[] args) {
        int[] myArray = new int[3];
        myArray[0] = 2;
        myArray[1] = 8;
        myArray[2] = 7;

        for (int i = 0; i < 3; i++) {
            System.out.println(myArray[i]);
        }
    }
}