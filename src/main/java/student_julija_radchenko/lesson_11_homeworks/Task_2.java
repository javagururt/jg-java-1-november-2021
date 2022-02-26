package student_julija_radchenko.lesson_11_homeworks;

import java.util.ArrayList;
import java.util.List;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_2 {
    public static void main(String[] args) {
        List<Integer> arrayListExample = new ArrayList<>();
        int i = 5;
        arrayListExample.add(5);
        arrayListExample.add(i);
        arrayListExample.add(1, 3);

        for (Integer listItem : arrayListExample) {
            System.out.println(listItem);
        }
    }
}
