package student_stanislav_p.lesson_11_collections.homework.level_3_junior.Service;

import student_stanislav_p.lesson_11_collections.homework.level_3_junior.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_3_junior.Repository.SearchCriteria;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если год выпуска книги совпадает с this.yearOfIssueToSearch
        // иначе return false
        // добавьте в класс Book новое свойство - yearOfIssue - год выпуска
        return true;
    }

}
