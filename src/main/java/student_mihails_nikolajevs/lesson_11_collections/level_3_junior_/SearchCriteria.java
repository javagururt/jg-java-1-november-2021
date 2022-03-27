package student_mihails_nikolajevs.lesson_11_collections.level_3_junior_;
/*
Продолжаем разработку интерфейса BookDatabase.

Для представления сложных критериев поиска книг в базе данных создайте
интерфейс SearchCriteria со следующим методом:

    boolean match(Book book);
 */
import student_mihails_nikolajevs.lesson_11_collections.level_2_intern_.Book;

public interface SearchCriteria {

   boolean match(Book book);

    String searchCriteriaName();
}
