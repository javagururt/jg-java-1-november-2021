package student_dima_talanov.lesson_2.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "переменная name не используется. Используйте склеивание строк, как в примере teacher -> lessoncode -> Variables")
public class Task_8 {

    public static void main(String[] args){
        System.out.print("Enter your name please: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello Dima!");
    }
}
