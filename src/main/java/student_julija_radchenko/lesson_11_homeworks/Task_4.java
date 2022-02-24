package student_julija_radchenko.lesson_11_homeworks;

import java.util.ArrayList;
import java.util.List;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Task_4 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        for (Integer elements : list) {
            System.out.println("Lists elements:  " + elements);
        }
    }

}
