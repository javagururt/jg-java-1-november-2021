package student_mihails_nikolajevs.lesson_11_collections.level_3_junior_;

import student_mihails_nikolajevs.lesson_11_collections.level_2_intern_.BookDatabase;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BookService {

    private final BookDatabase bookDatabase;

    public BookService(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

}


