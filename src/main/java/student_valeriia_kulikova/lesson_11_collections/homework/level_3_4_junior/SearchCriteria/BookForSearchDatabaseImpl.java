package student_valeriia_kulikova.lesson_11_collections.homework.level_3_4_junior.SearchCriteria;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "список должен быть private, чтобы у других не было прямого доступа")
public class BookForSearchDatabaseImpl implements BookForSearchDatabase {

    List<BookForSearch> list = new ArrayList<>();

    @Override
    public Long save(BookForSearch book) {
        list.add(book);
        return book.getId();
    }


    @CodeReviewComment(comment = "можно упростить до 1 строки." +
            "return list.size();")
    @Override
    public int countAllBooks() {
        int count = list.size();
        return count;
    }

    @Override
    public List<BookForSearch> find(SearchCriteria searchCriteria) {
        List<BookForSearch> newCollection = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (searchCriteria.match(list.get(i))) {
                newCollection.add(list.get(i));
            }
        }
        return newCollection;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set <String> authors = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            authors.add(list.get(i).getAuthor());
        }
        return authors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set <String> titles = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            titles.add(list.get(i).getTitle());
        }
        return titles;
    }

    @Override
    public Set<BookForSearch> findUniqueBooks() {
        Set<BookForSearch> books = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            books.add(list.get(i));
        }
        return books;
    }

    @Override
    public boolean contains(BookForSearch book) {

        for (int i = 0; i < list.size(); i++) {
            if (book.getAuthor().equals(list.get(i).getAuthor()) &&
                    book.getTitle().equals(list.get(i).getTitle()) &&
                    book.getYearOfIssueToSearch().equals(list.get(i).getYearOfIssueToSearch())) {
                return true;

            }
        }
        return false;
    }
}
