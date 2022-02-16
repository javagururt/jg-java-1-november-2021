package student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.UI;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Repository.SearchCriteria;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service.AndSearchCriteria;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service.AuthorSearchCriteria;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_junior.Service.TitleSearchCriteria;

public class SearchCriteriaDemo {

    SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
    SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
    SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

}
