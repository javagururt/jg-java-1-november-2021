package student_mihails_nikolajevs.lesson_11_collections.level_2_intern_;

import java.util.*;

class BookDatabaseImpl implements BookDatabase {

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
        if (!findBookInListById(bookId)) {
            return false;
        } else {
            bookList.remove(getBookIndexInListById(bookId));
            return true;
        }
    }

    @Override
    public boolean delete(Book book) {
        for (Book bookInList : bookList) {
            if (bookInList.equals(book)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }
    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    @Override
    public int countAllBooks() {

    int bookCounter = 0;
        for ( int i = 0; i < bookList.size(); i++) {
            bookCounter++;
    }
     return bookCounter;
}

    @Override
    public void deleteByAuthor(String author) {

        bookList.removeIf(book -> book.getAuthor().equals(author));
     }
     @Override
    public void deleteByTitle(String title) {

        bookList.removeIf(book -> book.getTitle().equals(title));
     }

    @Override
    public Set<String> findUniqueAuthors() {
        return null;
    }


    private boolean findBookInListById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                return true;
            }
        } return false;
     }


     private int getBookIndexInListById(Long bookId) {
        int bookIndexInList = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId().equals(bookId)) {
                bookIndexInList = i;
            }
        } return bookIndexInList;
     }
}