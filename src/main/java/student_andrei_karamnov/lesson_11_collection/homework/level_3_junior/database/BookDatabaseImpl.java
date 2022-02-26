package student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.database;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import student_andrei_karamnov.lesson_11_collection.homework.level_3_junior.domain.Book;
import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "сравнения нужно делать через equals")
public class BookDatabaseImpl implements BookDatabase {

    private List<Book> database = new ArrayList<>();


    @Override
    public Long save(Book book) {
        database.add(book);
        for (int i = 0; i < database.size(); i++) {
            book.setId((long) i);
        }
        return null;
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 0; i < database.size(); i++) {
            if(bookId == database.get(i).getId()){
                database.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < database.size(); i++) {
            if(book.equals(database.get(i))){
                database.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : database) {
            if (bookId == book.getId()){
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {

        List<Book> authorList = new ArrayList<>();
        for (Book book : database) {
            if(author.equals(book.getAuthor())){
                authorList.add(book);
            }
        }
        return authorList;
    }

    @Override
    public List<Book> findByTitle(String title) {

        List<Book> titleList = new ArrayList<>();
        for (Book book : database){
            if(title.equals(book.getTitle())){
                titleList.add(book);
            }
        }
        return titleList;
    }

    @Override
    public int countAllBooks() {
        return database.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        for (int i = 0; i < database.size(); i++) {
            if (author.equals(database.get(i).getAuthor())){
                database.remove(i);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < database.size(); i++) {
            if (title.equals(database.get(i).getTitle())){
                database.remove(i);
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {

        List<Book> searchCriteriaList = new ArrayList<>();
        for (Book book : database){
            if (searchCriteria.equals(book.getTitle()) ||
                    searchCriteria.equals(book.getAuthor()) ||
                    searchCriteria.equals(book.getYearOfIssue())){
                searchCriteriaList.add(book);
            }
        }
        return searchCriteriaList;
    }

    @Override
    public Set<String> findUniqueAuthors() {

        Set<String> uniqueAuthors = new HashSet<>();
        for (Book book : database){
            uniqueAuthors.add(book.getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitles = new HashSet<>();
        for (Book book : database){
            uniqueTitles.add(book.getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBooks = new HashSet<>();
        for (Book book : database){
            uniqueBooks.add(book);
        }
        return uniqueBooks;
    }

    @Override
    public boolean contains(Book book) {
        return database.contains(book);
    }
    @Override
    public List<Book> getDatabase() {
        return database;
    }
}
