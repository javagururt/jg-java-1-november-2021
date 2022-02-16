package student_victor_veselov.lesson_11.Task6.Service;

import student_victor_veselov.lesson_11.Task6.Model.Book;
import student_victor_veselov.lesson_11.Task6.Repository.SearchCriteria;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;


    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        if (book.equals(yearOfIssueToSearch)){
            System.out.println(true);
        }
        return false;
    }
}
