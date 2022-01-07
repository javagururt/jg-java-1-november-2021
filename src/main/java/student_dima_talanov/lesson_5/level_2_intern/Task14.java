package student_dima_talanov.lesson_5.level_2_intern;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task14 {

    public static void main(String[] args) {
        int[] myArray = new int[3];
        System.out.println("First random array number: ");
        myArray[0] = (int) (Math.random() * 10);
        System.out.println(myArray[0]);
        System.out.println("Second random array number: ");
        myArray[1] = (int) (Math.random() * 15);
        System.out.println(myArray[1]);
        System.out.println("Third random array number: ");
        myArray[2] = (int) (Math.random() * 20);
        System.out.println(myArray[2]);
        int sum = (myArray[0] + myArray[1] + myArray[2]) / 3;
        System.out.println("Result is: " + sum);
    }
}

