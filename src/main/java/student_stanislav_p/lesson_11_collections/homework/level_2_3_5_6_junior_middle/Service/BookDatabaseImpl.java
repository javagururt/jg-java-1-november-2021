package student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Service;

import java.util.*;

import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.Book;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.Repository.BookDatabase;
import student_stanislav_p.lesson_11_collections.homework.level_2_3_5_6_junior_middle.SearchCriteria.SearchCriteria;
import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BookDatabaseImpl implements BookDatabase {

    public List<Book> database = new ArrayList<>();

    @Override
    public Long save(Book book) {
        database.add(book);
        return null;
    }

    // ---------------  Task7 ----------
    @Override
    public boolean deleteById(int bookId) {
        for (int i = 0; i < database.size(); i++) {
            if (bookId==database.get(i).getId()) {
                database.remove(i);
                return true;
            }
        }
        return false;
    }

    // ---------------  Task8 ---------
    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < database.size(); i++) {
            if (book.equals(database.get(i))) ;
            database.remove(i);
            System.out.println(true);
        }
        return false;
    }


    // ---------------  Task9 ---------
    @Override
    public Optional<Book> findById(int bookId) {
        for (Book book : database) {
            if (bookId==book.getId()) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    // ---------------  Task10 ---------
    @Override
    public List<Book> findByAuthor(String author) {

        List <Book> bookListByAuthor = new ArrayList<>();

        for (Book book : database) {
            if (author.equals(book.getAuthor())) {
                bookListByAuthor.add(book);
            }
        }
        return bookListByAuthor;
    }

    // ---------------  Task11 ---------
    @Override
    public List<Book> findByTitle(String title) {

        List <Book> bookListByTitle = new ArrayList<>();

        for (Book book : database) {
            if (title.equals(book.getTitle())) {
                bookListByTitle.add(book);
            }
        }
        return bookListByTitle;
    }

    @Override
    public List<Book> findAllBook() {
        List <Book> bookListAllBook = new ArrayList<>();

        for (Book book : database) bookListAllBook.add(book);

        return bookListAllBook;
    }

    // ---------------  Task12 ---------
    @Override
    public int countAllBooks() {

        return database.size();
    }

    // ---------------  Task13 ---------
    @Override
    public void deleteByAuthor(String author) {
        for (int i = 0; i < database.size(); i++) {
            if (author.equals(database.get(i).getAuthor())) {
                database.remove(i);

            }
        }
    }

    // ---------------  Task14 ---------
    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < database.size(); i++) {
            if (title.equals(database.get(i).getTitle())) {
                database.remove(i);

            }
        }
    }

    // ---------------  Task22 ---------
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


    // ---------------  Task23 ---------
    @Override
    public Set <String> findUniqueAuthors(){
        Set <String> listUniqueAuthors = new HashSet<>();

        for (Book book : database){
            listUniqueAuthors.add(book.getAuthor());
        }

        return listUniqueAuthors;
    }


    // ---------------  Task24 ---------
    @Override
    public Set<String> findUniqueTitles(){
        Set <String> listUniqueTitles = new HashSet<>();
        for (Book book : database){
            listUniqueTitles.add(book.getTitle());
        }
        return listUniqueTitles;
    }



    // ---------------  Task25 ---------
    @Override
    public Set<Book> findUniqueBooks(){
        Set <Book> listUniqueBooks = new HashSet<>();
        for (Book book : database){
            listUniqueBooks.add(book);
        }
        return listUniqueBooks;
    }


    // ---------------  Task26 ---------
    @Override
    public boolean contains(Book bookSearch){
        boolean isContains=true;
        for (Book book : database){
            if (bookSearch.equals(book)) { isContains=true;}
         else {isContains=false;}}
        return isContains;
    }

    // ---------------  Task28 ---------

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {

        Map<String, List<Book>> authorsToBookMap = new HashMap<>();

        for (Book book : database) {
            String author = book.getAuthor();

            if (authorsToBookMap.containsKey(author)) {
                List<Book> books = authorsToBookMap.get(author);
                books.add(book);
                authorsToBookMap.put(author, books);
            } else {
                List<Book> books = new ArrayList<>();
                books.add(book);
                authorsToBookMap.put(author, books);
            }

        }
        return authorsToBookMap;
    }

    // ---------------  Task29 ---------

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        return null;
    }


}
