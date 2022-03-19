package student_valeriia_kulikova.lesson_11_collections.homework.level_2_intern;


import student_valeriia_kulikova.lesson_11_collections.homework.level_3_junior.SearchCriteria.BookForSearch;
import student_valeriia_kulikova.lesson_11_collections.homework.level_3_junior.SearchCriteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class BookDatabaseImpl implements  BookDatabase {

    List<BookWithID> list = new ArrayList<>();

    @Override
    public Long save(BookWithID book) {
        list.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 0; i < list.size(); i++) {
            if (bookId == list.get(i).getId()) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(BookWithID book) {
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(book, list.get(i))) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<BookWithID> findById(Long bookId) {
        for (int i = 0; i < list.size(); i++) {
            if (bookId == list.get(i).getId()) {
                return Optional.of(list.get(i));
            }
        }
        return Optional.empty();
    }

    @Override
    public List<BookWithID> findByAuthor(String author) {
        List<BookWithID> findByAuthor = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(author, list.get(i).getAuthor())) {
                findByAuthor.add(list.get(i));
            }

        }
        return findByAuthor;
    }

    @Override
    public int countAllBooks() {
        int count = list.size();
        return count;
    }

    @Override
    public List<BookWithID> findByTitle(String title) {
        List<BookWithID> findByTitle = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(title, list.get(i).getTitle())) {
                findByTitle.add(list.get(i));
            }
        }
        return findByTitle;
    }

    @Override
    public void deleteByAuthor(String author) {
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(author, list.get(i).getAuthor())) {
                list.remove(list.get(i));
                i--;
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(title, list.get(i).getTitle())) {
                list.remove(list.get(i));
                i--;
            }
        }
    }

}
