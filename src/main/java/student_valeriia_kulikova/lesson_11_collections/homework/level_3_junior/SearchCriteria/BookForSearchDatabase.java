package student_valeriia_kulikova.lesson_11_collections.homework.level_3_junior.SearchCriteria;


import java.util.List;

public interface BookForSearchDatabase {
    Long save (BookForSearch book);
    int countAllBooks();
    List<BookForSearch> find(SearchCriteria searchCriteria);




}
