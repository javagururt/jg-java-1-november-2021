package student_julija_radchenko.lesson_12_homeworks.level_4_junior;

import java.util.ArrayList;
import java.util.List;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class OutOfMemory {
    public static void main(String[] args) {
        List<Object> bigList = new ArrayList<>();

        while (true) {
            bigList.add(new Object());
        }
    }
}
