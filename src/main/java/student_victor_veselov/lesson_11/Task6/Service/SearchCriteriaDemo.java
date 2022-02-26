package student_victor_veselov.lesson_11.Task6.Service;

import student_victor_veselov.lesson_11.Task6.Model.Book;
import student_victor_veselov.lesson_11.Task6.Repository.SearchCriteria;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class SearchCriteriaDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Zveroboi","Kuper","2020");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        searchCriteria.match(book1);


    }
}
