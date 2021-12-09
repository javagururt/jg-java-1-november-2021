package student_dima_talanov.lesson_2.level_2_intern;

import java.util.Scanner;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "переменная name не используется. Используйте склеивание строк, как в примере teacher -> lessoncode -> Variables")
public class Task_8 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name please: ");
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }
}
