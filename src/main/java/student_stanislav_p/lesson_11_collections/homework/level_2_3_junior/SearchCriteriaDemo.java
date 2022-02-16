package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior;

/*

Создайте класс SearchCriteriaDemo и с помощью
классов OrSearchCriteria и AndSearchCriteria составьте сложные условия:
- автор книги "Kuper" и название "Zveroboi"
- автор книги "Kuper" и год выпуска 1890
- автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"
 */


import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.SearchCriteria;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service.AndSearchCriteria;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service.AuthorSearchCriteria;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service.TitleSearchCriteria;

public class SearchCriteriaDemo {

    SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
    SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
    SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

}
