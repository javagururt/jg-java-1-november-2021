package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.businesslogic.*;
import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database.SearchCriteria;

public class SearchCriteriaDemo {

    SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
    SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
    SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
    SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
    SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
    SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
    SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
    SearchCriteria searchCriteria5 = new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);
}
