package student_valeriia_kulikova.lesson_12_exceptions.homework.level_4_junior;

import java.util.ArrayList;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Необходимо указать generic (для какого класса список) при создании списка")
public class OutOfMemoryError {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        int number = 1000000;
        while (true) {
            arrayList.add(number);
        }
    }
}
