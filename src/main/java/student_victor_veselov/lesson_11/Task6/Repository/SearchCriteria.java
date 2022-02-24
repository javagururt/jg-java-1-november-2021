package student_victor_veselov.lesson_11.Task6.Repository;

import student_victor_veselov.lesson_11.Task6.Model.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface SearchCriteria {

    boolean match(Book book);
}
