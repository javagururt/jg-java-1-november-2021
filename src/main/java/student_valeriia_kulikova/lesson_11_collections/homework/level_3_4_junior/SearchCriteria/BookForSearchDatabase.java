package student_valeriia_kulikova.lesson_11_collections.homework.level_3_4_junior.SearchCriteria;


import java.util.List;
import java.util.Set;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface BookForSearchDatabase {
    Long save(BookForSearch book);

    int countAllBooks();

    List<BookForSearch> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<BookForSearch> findUniqueBooks();

    boolean contains(BookForSearch book);


}
