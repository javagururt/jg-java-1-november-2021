package student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_18;


import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.Book;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.SearchCriteria;
import teacher.annotations.CodeReview;

;

@CodeReview(approved = true)
public class YearOfIssueSearchCriteria implements SearchCriteria {
    private String yearOfIssueToSearch;
    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }


    @Override
    public boolean match(Book book) {
        if(book.getYearOfIssue().equals(yearOfIssueToSearch)) {
            return true;
        }else{
            return false;}
    }
}

