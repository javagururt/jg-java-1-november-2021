package student_julija_radchenko.lesson_11_homeworks.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {
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
        if(!isBookIdInBooksList(bookId)) {
            return false;
        }else{
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
        for (int i =0; i< bookList.size();i++) {
            if (bookList.get(i).getId().equals(bookId)) {
                bookIndexInList = i;
            }
        }return bookIndexInList;
        }

}




