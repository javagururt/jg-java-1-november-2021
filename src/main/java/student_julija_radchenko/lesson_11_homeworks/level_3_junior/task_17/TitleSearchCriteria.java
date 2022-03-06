package student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_17;

import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.Book;
import student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15.SearchCriteria;

public class TitleSearchCriteria implements SearchCriteria {
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
}

    @Override
    public boolean match(Book book) {
       if(book.getTitle().equals(this.titleToSearch)) {
           return true;
       }else{
           return false;}
       }


    }

