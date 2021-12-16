package student_dmitrijs_sinkevics.lesson_3.lvl_5_middle;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "неудачное название переменной - совпадает с названием класса (не связанного с DogDemo)")
public class DogDemo {
    public static void main(String[] args) {
        Dog DogDemo=new Dog();

        DogDemo.voice();


    }
}
