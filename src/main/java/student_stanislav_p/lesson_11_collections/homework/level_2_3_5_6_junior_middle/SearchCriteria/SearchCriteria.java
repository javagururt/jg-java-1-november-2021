package student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.SearchCriteria;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.Book;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface SearchCriteria {

    boolean match(Book book);

}
