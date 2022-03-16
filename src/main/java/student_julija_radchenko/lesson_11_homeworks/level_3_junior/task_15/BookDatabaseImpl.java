package student_julija_radchenko.lesson_11_homeworks.level_3_junior.task_15;



import java.util.*;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BookDatabaseImpl implements BookDatabase{

    List<Book> bookList = new ArrayList<>();
    private Long startId = 1L;


    @Override
    public Long save(Book book) {
        book.setId(startId);
        bookList.add(book);
        startId++;
        return startId;
    }

    @Override
    public boolean delete(Long bookId) {
        if (!isBookIdInBooksList(bookId)) {
            return false;
        } else {
            bookList.remove(getBookIndexInListById(bookId));
            return true;
        }
    }

    @Override
    public boolean delete(Book book) {
        if (!isBookInBookList(book)) {
            return false;
        }else{
            bookList.remove(book);
            return true;
        }
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList){
            if(book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        } return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List <Book> booksByAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book book : bookList){
            if (book.getTitle().equals(title)){
                booksByTitle.add(book);
            }
        }return booksByTitle;
    }

    @Override
    public int countAllBooks() {

        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {

        bookList.removeAll(findByAuthor(author));
    }

    @Override
    public void deleteByTitle(String title) {

        bookList.removeAll(findByTitle(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> findList = new ArrayList<>();
        for(Book book:bookList){
            if(searchCriteria.match(book)){
                findList.add(book);
            }
        }
        return findList;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new TreeSet<>();
        for(Book book : bookList){
            uniqueAuthors.add(book.getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitles = new TreeSet<>();
        for(Book book:bookList){
            uniqueTitles.add(book.getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBooks = new HashSet<>();
        for(Book book: bookList){
            uniqueBooks.add(book);
        }
        return uniqueBooks;
    }

    @Override
    public boolean contains(Book book) {
        boolean doesContain = false;
        for(Book eachBook: bookList){
        if(eachBook.equals(book)){
            doesContain = true;
        }
        } return doesContain;


    }


    private boolean isBookInBookList(Book book){
        for (Book bookInList : bookList){
            if(bookInList.equals(book)) {
                return true;
            }
        }return false;
    }


    private boolean isBookIdInBooksList(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                return true;
            }
        }return false;
    }

    private int getBookIndexInListById (Long bookId){
        int bookIndexInList = 0;
        for (int i =0; i< bookList.size(); i++) {
            if (bookList.get(i).getId().equals(bookId)) {
                bookIndexInList = i;
            }
        }return bookIndexInList;
    }

}


